package culturemedia.controller;

import java.util.*;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.service.CultureMediaService;

public class CultureMediaController  {

    private final CultureMediaService cultureMediaService;

    public CultureMediaController(CultureMediaService cultureMediaService) {
        this.cultureMediaService = cultureMediaService;
    }

    public List<Video> findAll() throws VideoNotFoundException {
        return cultureMediaService.findAll();
    }

    public Video addVideo(Video video) {
        return cultureMediaService.addVideo(video);
    }
}


