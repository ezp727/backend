package culturemedia.controller;

import java.util.*;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.model.View;
import culturemedia.service.CultureMediaService;
import culturemedia.service.impl.CultureMediaServiceImpl;

public class CultureMediaController implements CultureMediaService {

    private final CultureMediaServiceImpl cultureMediaService;


    public CultureMediaController(CultureMediaServiceImpl cultureMediaService) {
        this.cultureMediaService = cultureMediaService;
    }


    public List<Video> find_allVideos() throws VideoNotFoundException {
        List<Video> videos = null;
        videos = cultureMediaService.findAll();
        return videos;
    }

    @Override
    public View addView(View view) {
        return cultureMediaService.addView(view);
    }

    @Override
    public List<Video> findAll() throws VideoNotFoundException {
        List<Video> videos = null;
        videos = cultureMediaService.findAll();
        if (videos.isEmpty()){
            throw new VideoNotFoundException("Video no encontrado");
        }
        return videos;
    }

    @Override
    public Video addVideo(Video video) {
        return cultureMediaService.addVideo(video);
    }
}


