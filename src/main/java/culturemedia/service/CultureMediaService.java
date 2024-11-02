package culturemedia.service;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.model.View;

import java.util.List;


public interface CultureMediaService {

    View addView(View view);
    List<Video> findAll() throws VideoNotFoundException;
    Video addVideo(Video video);
}
