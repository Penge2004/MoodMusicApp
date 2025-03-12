//package APP.Controller;
//
//import APP.Domain.Music;
//import APP.RepositoryPackage.MusicRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Service
//public class ViewUpdaterService {
//
//    @Autowired
//    private MusicRepository musicRepository;
//
//    @Autowired
//    private YouTubeService youTubeService;
//
//    public void updateDailyViewsIfNeeded() {
//        LocalDate lastUpdateDate = UpdateTracker.getLastUpdateDate();
//        LocalDate today = LocalDate.now();
//
//        // Check if an update has already been done today
//        if (lastUpdateDate == null || !lastUpdateDate.isEqual(today)) {
//            updateDailyViews();  // Run the update if not done yet
//            UpdateTracker.setLastUpdateDate(today);  // Store the current date as the last update date
//        }
//    }
//
//    private void updateDailyViews() {
//        List<Music> allMusic = musicRepository.findAll();
//
//        for (Music music : allMusic) {
//            Long newViews = youTubeService.fetchYouTubeViews(music.getTotalViews());
//
//            if (newViews != null) {
//                // Update total views
//                music.setViews(newViews);
//                musicRepository.save(music);
//            }
//        }
//    }
//}