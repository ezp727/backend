package culturemedia.service;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewsRepository;
import culturemedia.service.impl.CultureMediaServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CultureMediaServiceTest {

    private CultureMediaService cultureMediaService;
    private VideoRepository videoRepositoryMock;

    @BeforeEach
    void init(){

        videoRepositoryMock = Mockito.mock(VideoRepository.class);
        ViewsRepository viewsRepositoryMock = Mockito.mock(ViewsRepository.class);

        cultureMediaService = new CultureMediaServiceImpl(viewsRepositoryMock, videoRepositoryMock);
    }

    void save_video() {
        // lista
        List<Video> videos = List.of(
                new Video("01", "Título 1", "----", 4.5),
                new Video("02", "Título 2", "----", 5.5),
                new Video("03", "Título 3", "----", 4.4),
                new Video("04", "Título 4", "----", 3.5),
                new Video("05", "Clic 5", "----", 5.7),
                new Video("06", "Clic 6", "----", 5.1)
        );

        // findall
        when(videoRepositoryMock.findAll()).thenReturn(videos);
    }

    @Test
    void when_FindAll_all_videos_should_be_returned_successfully() throws VideoNotFoundException {
        save_video();
        List<Video> videos = cultureMediaService.findAll();
        assertEquals(6, videos.size());
    }

    @Test
    void when_FindAll_does_not_find_any_video_an_VideoNotFoundException_should_be_thrown_successfully() {
        // findall no encuentra
        when(videoRepositoryMock.findAll()).thenThrow(new VideoNotFoundException("No videos found"));

        assertThrows(VideoNotFoundException.class, () -> cultureMediaService.findAll());
    }
}
