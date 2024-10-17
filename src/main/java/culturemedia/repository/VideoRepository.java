package culturemedia.repository;

import java.util.List;
import culturemedia.model.Video;

public interface VideoRepository {
    List<Video> findAll();
    Video findByCode(String code);
    void save(Video video);
}
