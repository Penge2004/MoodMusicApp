package APP.Controller;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.JSONObject;

@Service
public class YouTubeService {

    private static final String API_KEY = "AIzaSyDr27YCakFh2TeEoG8IFm3P98YMuddgnZY";
    private static final String YOUTUBE_API_URL = "https://www.googleapis.com/youtube/v3/videos";

    public Integer fetchYouTubeViews(String youtubeLink) {
        try {
            String videoId = extractVideoId(youtubeLink);
            String url = YOUTUBE_API_URL + "?part=statistics&id=" + videoId + "&key=" + API_KEY;

            RestTemplate restTemplate = new RestTemplate();
            String response = restTemplate.getForObject(url, String.class);
            JSONObject json = new JSONObject(response);

            return Math.toIntExact(json.getJSONArray("items").getJSONObject(0)
                    .getJSONObject("statistics")
                    .getLong("viewCount"));

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private String extractVideoId(String youtubeLink) {
        if (youtubeLink.contains("watch?v=")) {
            return youtubeLink.split("watch\\?v=")[1].split("&")[0];
        } else if (youtubeLink.contains("youtu.be/")) {
            return youtubeLink.split("youtu.be/")[1].split("\\?")[0];
        }
        return null;
    }
}
