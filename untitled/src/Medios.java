import java.util.Date;
public class Medios {

    Date fecha;
    String authoria;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAuthoria() {
        return authoria;
    }

    public void setAuthoria(String authoria) {
        this.authoria = authoria;
    }


    public Medios(Date fecha, String authoria) {
        this.fecha = fecha;
        this.authoria = authoria;
    }

    @Override
    public String toString() {
        return "Medios{" +
                "fecha=" + fecha +
                ", authoria='" + authoria + '\'' +
                '}';
    }

}
