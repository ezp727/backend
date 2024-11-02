package culturemedia.service.impl;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.model.View;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewsRepository;
import culturemedia.service.CultureMediaService;

import java.util.List;

public class CultureMediaServiceImpl implements CultureMediaService {

    private VideoRepository videoRepository;
    private ViewsRepository viewsRepository;

    public CultureMediaServiceImpl(ViewsRepository viewsRepository, VideoRepository videoRepository) {
        this.viewsRepository = viewsRepository;
        this.videoRepository = videoRepository;
    }

    @Override
    public View addView(View view) {
        return viewsRepository.add(view);
    }

    @Override
    public List<Video> findAll() throws VideoNotFoundException {
        List<Video> videos = videoRepository.findAll();
        if (videos.isEmpty()){
            throw new VideoNotFoundException("Video no encontrado");
        }
        return videos;
    }

    @Override
    public Video addVideo(Video video) {
        return videoRepository.add(video);
    }
}
