package APP.Domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String artist;
    private String mood;
    private String youtubeLink;
    private int views;
    private LocalDate date;

    public Music(Integer id, String title, String artist, String mood, String youtubeLink, int views, LocalDate date) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.mood = mood;
        this.youtubeLink = youtubeLink;
        this.views = views;
        this.date = date;
    }

    public Music() {

    }

    public String getVideoId() {
        if (youtubeLink == null || !youtubeLink.contains("watch?v=")) {
            return null;
        }
        return youtubeLink.split("watch\\?v=")[1].split("&")[0]; // Extracts video ID
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getYoutubeLink() {
        return youtubeLink;
    }

    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
