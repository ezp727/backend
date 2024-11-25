package culturemedia.service;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.model.View;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewsRepository;
import culturemedia.service.impl.CultureMediaServiceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class CultureMediaServiceTest {


    private CultureMediaService cultureMediaService;
    private VideoRepository videoRepositoryMock = Mockito.mock(VideoRepository.class);
    private ViewsRepository viewsRepositoryMock = Mockito.mock(ViewsRepository.class);

    @BeforeEach
    void init(){
        cultureMediaService = new CultureMediaServiceImpl(viewsRepositoryMock, videoRepositoryMock);
    }

    @Test
    void when_FindAll_all_videos_should_be_returned_successfully() throws VideoNotFoundException {
        mockVideoRepositoryFindAllWithResult();
        List<Video> actual = cultureMediaService.findAll();
        assertEquals(6, actual.size());
    }

    private void mockVideoRepositoryFindAllWithResult() {
        List<Video> videos = List.of(
        new Video("01", "Título 1", "----", 4.5),
        new Video("02", "Título 2", "----", 5.5),
        new Video("03", "Título 3", "----", 4.4),
        new Video("04", "Título 4", "----", 3.5),
        new Video("05", "Clic 5", "----", 5.7),
        new Video("06", "Clic 6", "----", 5.1)
        );
        doReturn(videos).when(videoRepositoryMock).findAll();
    }

    @Test
    void when_FindAll_all_videos_should_be_returned_throws_not_found() throws VideoNotFoundException {
        mockVideoRepositoryFindAllWithNoResult();
        assertThrows(VideoNotFoundException.class, () -> cultureMediaService.findAll());
    }

    private void mockVideoRepositoryFindAllWithNoResult() {
        List<Video> videos = new ArrayList<>();
        doReturn(videos).when(videoRepositoryMock).findAll();
    }

    @Test
    void when_addVideo_should_be_returned_videoAdded(){
        Video video = new Video("01","Titulo1","---",5.5);
        doReturn(video).when(videoRepositoryMock).add(any());
        Video actual=cultureMediaService.addVideo(video);
        assertEquals("01",actual.getCode());
    }

    @Test
    void when_addView_should_be_returned_viewAdded(){
        Video video = new Video("01","Titulo1","---",5.5);
        View view = new View("User01", LocalDateTime.now(),3,video);
        doReturn(view).when(viewsRepositoryMock).add(view);
        View actual=cultureMediaService.addView(view);
        assertEquals("User01",actual.getUserFullName());
    }
}

