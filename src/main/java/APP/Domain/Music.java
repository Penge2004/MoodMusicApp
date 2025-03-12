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
    private Long views;
    private LocalDate date;

    @Column(name = "videoID")
    private String videoID;


    public Music(Integer id, String title, String artist, String mood, String youtubeLink, Long views, LocalDate date, String videoID) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.mood = mood;
        this.youtubeLink = youtubeLink;
        this.views = views;
        this.date = date;
        this.videoID = videoID;
    }

    public Music() {

    }

    public String getVideoID() {
        return videoID;
    }

    public void setVideoID(String videoID) {
        this.videoID = videoID;
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

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", mood='" + mood + '\'' +
                ", youtubeLink='" + youtubeLink + '\'' +
                ", views=" + views +
                ", date=" + date +
                ", videoID='" + videoID + '\'' +
                '}';
    }
}
