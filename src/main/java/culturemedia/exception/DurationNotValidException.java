package culturemedia.exception;

public class DurationNotValidException extends CultureMediaException {
    public DurationNotValidException(String title, double duration) {
        super("Duration not valid for video: " + title + ". Duration: " + duration);
    }
}