package culturemedia.restcontroller;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.service.CultureMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/videos") // Ruta base para los endpoints de videos
public class CultureMediaRestController {

    private final CultureMediaService cultureMediaService;

    @Autowired  //para que sb inyecte las dependencias de CultureMediaService
    public CultureMediaRestController(CultureMediaService cultureMediaService) {
        this.cultureMediaService = cultureMediaService;
    }

    //Para solicitudes GET, obtener informacion (en este caso videos)
    @GetMapping         //
    public List<Video> findAll() throws VideoNotFoundException {
        return cultureMediaService.findAll();
    }
    //solicitudes POST, para mandar informacion, en este caso anadir videos
    @PostMapping
    public Video addVideo(@RequestBody Video video) { //request body convierte el formato json
        return cultureMediaService.addVideo(video);     //enviado y lo transforma en clase java video
    }
}

