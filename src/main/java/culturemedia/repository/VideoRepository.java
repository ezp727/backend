package culturemedia.repository;

import java.util.List;
import culturemedia.model.Video;

public interface VideoRepository {
    List<Video> findAll();
    Video add(Video video);
    List<Video> find(String title);
    List<Video> find(Double lengthFrom, Double lengthGoesUp);
}
