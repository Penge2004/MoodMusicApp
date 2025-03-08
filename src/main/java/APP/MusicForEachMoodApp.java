package APP;

import APP.Controller.ViewUpdaterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;



@SpringBootApplication
public class MusicForEachMoodApp {

    public static void main(String[] args){
        SpringApplication.run(MusicForEachMoodApp.class, args);
    }

    @Bean
    public CommandLineRunner run(ViewUpdaterService viewUpdaterService) {
        return args -> {
            // Run the update check when the application starts
            viewUpdaterService.updateDailyViewsIfNeeded();
        };
    }

}
