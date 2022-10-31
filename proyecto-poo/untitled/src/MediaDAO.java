
import java.util.ArrayList;

public class MediaDAO {

    ArrayList<Media> medias = new ArrayList<>();


    public void insertarMedia (Media media){
            this.medias.add(media);
    }

    public ArrayList<Media> verMedia(){
        return medias;
    }


    public void modificarMedia(Media media) {
            Media medioaux = media;
            medioaux.setAuthoria(media.getAuthoria());
            medioaux.setFecha(media.getFecha());

    }



}
