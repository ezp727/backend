package culturemedia.model;

public class Video {
    private String title;
    private String description;
    private Double duration;

    // Constructor
    public Video(String title, String description, Double duration) {
        this.title = title;
        this.description = description;
        this.duration = duration;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Double getDuration() {
        return duration;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }
}
