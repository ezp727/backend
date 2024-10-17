package culturemedia.repository;


import java.util.List;
import culturemedia.model.Video;
import culturemedia.model.View;

public interface ViewsRepository {
    void add(View view); // Metodo para anadir lista
    List<View> listAll(); // Metodo para listar todas las vistass
    List<View> listByUser(String userFullName); // Metodo para listar por nombre completo
}
