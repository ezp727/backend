package culturemedia;
import culturemedia.model.Video;
import culturemedia.service.CultureMediaService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppInit implements ApplicationRunner {

    private final CultureMediaService cultureMediaService;

    //inyeccion de dependencia para el servicio
    public AppInit(CultureMediaService cultureMediaService) {
        this.cultureMediaService = cultureMediaService;
    }

    @Override   //runner de la app
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("La aplicación se ha iniciado correctamente");

        //agrega unos videos para iniciar
        if (args.containsOption("init")) {
            System.out.println("Inicializando videos predeterminados...");
            cultureMediaService.addVideo(new Video("1A", "Video 1", "--",9.3));
            cultureMediaService.addVideo(new Video("1B", "Video 2","--",5.6 ));
        }
    }
}