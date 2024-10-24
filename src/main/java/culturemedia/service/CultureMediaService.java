package culturemedia.service;

import culturemedia.model.Video;
import culturemedia.model.View;

import java.util.List;


public interface CultureMediaService {

    View addView(View view);
    List<Video> findAll();
    Video addVideo(Video video);
}
