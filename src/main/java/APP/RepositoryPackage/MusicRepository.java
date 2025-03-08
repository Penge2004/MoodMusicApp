package APP.RepositoryPackage;

import APP.Domain.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MusicRepository extends JpaRepository<Music, Integer> {
    @Query( "SELECT m " +
            "FROM Music m " +
            "WHERE m.mood = :mood AND m.date = :date " +
            "ORDER BY m.views DESC")
    List<Music> topMusic(String mood, LocalDate date);
}
