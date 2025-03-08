package APP.RepositoryPackage;

import APP.Domain.Music;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MusicRepository extends JpaRepository<Music, Integer> {
    @Query(value =  "SELECT m.id, m.title, m.artist, m.mood, m.youtube_link, m.views, m.date " +
                    "FROM music m " +
                    "WHERE m.mood = :mood AND m.date = :date " +
                    "ORDER BY m.views DESC " +
                    "LIMIT 2"
                    , nativeQuery = true)
    List<Music> topMusic(String mood, LocalDate date);
}
