package APP.Controller;

import APP.Domain.Music;
import APP.RepositoryPackage.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import java.time.LocalDate;
import java.util.List;

@Controller
public class MusicController {

    private final MusicRepository musicRepository;

    @Autowired
    public MusicController(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    @GetMapping("/")
    public String homePage() {
        return "helloWorld"; // Main page where the user enters their mood
    }

    @PostMapping("/submitFeeling")
    public String getTopMusic(@RequestParam("feeling") String feeling, Model model) {
        System.out.println("User feeling: " + feeling);

        // Query the top most-watched songs
        List<Music> topSongs = musicRepository.topMusic(feeling, LocalDate.now());

        for (Music music : topSongs) {
            System.out.println(music);
        }
        // Add to model to pass to the HTML
        model.addAttribute("songs", topSongs);
        model.addAttribute("mood", feeling);

        // Redirect to the result page
        return "resultPage";
    }
}
