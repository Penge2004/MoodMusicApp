package APP;

import APP.Domain.TestConnectivityEntity;
import APP.RepositoryPackage.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicForEachMoodApp {

    public static void main(String[] args) {
        SpringApplication.run(MusicForEachMoodApp.class, args);
    }

}
