//package APP.Controller;
//
//import org.json.JSONObject;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//@Service
//public class YouTubeService {
//
//    private static final String API_KEY = "AIzaSyDr27YCakFh2TeEoG8IFm3P98YMuddgnZY";
//    private static final String YOUTUBE_API_URL = "https://www.googleapis.com/youtube/v3/videos";
//
//    public Long fetchYouTubeViews(String videoId) {
//        try {
//            String url = YOUTUBE_API_URL + "?part=statistics&id=" + videoId + "&key=" + API_KEY;
//            System.out.println("Making request to YouTube API with URL: " + url); // Logging the API request
//
//            RestTemplate restTemplate = new RestTemplate();
//            String response = restTemplate.getForObject(url, String.class);
//            System.out.println("API Response: " + response); // Log the API response
//
//            JSONObject json = new JSONObject(response);
//            long viewCount = json.getJSONArray("items").getJSONObject(0)
//                    .getJSONObject("statistics")
//                    .getLong("viewCount");
//
//            System.out.println("Fetched views: " + viewCount); // Logging the view count
//
//            return viewCount;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return 0L;
//        }
//    }
//}