package culturemedia.service.impl;

import culturemedia.model.Video;
import culturemedia.model.View;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewsRepository;
import culturemedia.service.CultureMediaService;

import java.util.List;

public class CultureMediaServiceImpl implements CultureMediaService {

    private VideoRepository videoRepository;
    private ViewsRepository viewsRepository;

    @Override
    public View addView(View view) {
        return viewsRepository.add(view);
    }

    @Override
    public List<Video> findAll() {
        return videoRepository.findAll();
    }

    @Override
    public Video addVideo(Video video) {
        return videoRepository.add(video);
    }
}
