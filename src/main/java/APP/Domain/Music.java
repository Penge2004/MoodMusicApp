package APP.Domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "music")
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment for PostgreSQL
    private Long id; // You can use Long instead of int for bigger ranges

    private String title;
    private String artist;

    @Column(name = "total_views", nullable = false)
    private int totalViews = 0;

    @Column(name = "todays_views", nullable = false)
    private int todaysViews = 0;

    private String mood;

    private String link;


    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getTodaysViews() {
        return todaysViews;
    }

    public void setTodaysViews(int todaysViews) {
        this.todaysViews = todaysViews;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
