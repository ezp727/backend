package culturemedia.service;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.exception.DurationNotValidException;
import culturemedia.model.Video;
import culturemedia.model.View;

import java.util.List;


public interface CultureMediaService {
    void addVideo(View view) throws DurationNotValidException; //agregar un video
    List<Video> listAllViews(); //listar todas las visualizaciones
    List<Video> listViewsByUser(String userFullName); //listar vistas por nombre de usuario
    View findVideo(String title) throws VideoNotFoundException; //buscar un video por título
}
