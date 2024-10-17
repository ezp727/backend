package culturemedia.model;

import java.time.LocalDateTime;

public class View {
    private String userFullName;
    private LocalDateTime startPlayingTime;
    private Integer age;
    private Video video;

    // Constructor
    public View(String userFullName, LocalDateTime startPlayingTime, Integer age, Video video) {
        this.userFullName = userFullName;
        this.startPlayingTime = startPlayingTime;
        this.age = age;
        this.video = video;
    }

    // Getters
    public String getUserFullName() {
        return userFullName;
    }

    public LocalDateTime getStartPlayingTime() {
        return startPlayingTime;
    }

    public Integer getAge() {
        return age;
    }

    public Video getVideo() {
        return video;
    }

    // Setters
    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public void setStartPlayingTime(LocalDateTime startPlayingTime) {
        this.startPlayingTime = startPlayingTime;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
