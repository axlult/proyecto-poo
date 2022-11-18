package modelo;

import java.util.Date;
public class Media {


    // corregi el nombre Medios a medio
    //no deberia tener un id de medio? o algo asi?
    private Boolean estado;
    private Date fecha;
    private String authoria;

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



    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Media(Boolean estado, Date fecha, String authoria) {
        this.estado = estado;
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
