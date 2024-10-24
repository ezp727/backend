package culturemedia.repository;

import java.util.List;
import culturemedia.model.Video;

public interface VideoRepository {
    List<Video> findAll();
    Video add(Video video);
    List<Video> findByTitle(String title);
    List<Video> findDuration(Double lengthFrom, Double lengthGoesUp);
}
