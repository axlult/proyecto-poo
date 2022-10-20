import java.util.Date;

public class Investigacion {

    String titulo;
    String subtitulo;
    String autor;
    String categoria;
    String tema;
    Date fechaCreacion;
    Date fechaModificacion;
    Medios Medios;

    public Investigacion(String titulo, String subtitulo, String autor, String categoria, String tema, Date fechaCreacion, Date fechaModificacion, Medios medios) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.autor = autor;
        this.categoria = categoria;
        this.tema = tema;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        Medios = medios;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Medios getMedios() {
        return Medios;
    }

    public void setMedios(Medios medios) {
        Medios = medios;
    }

    @Override
    public String toString() {
        return "Investigacion{" +
                "titulo='" + titulo + '\'' +
                ", subtitulo='" + subtitulo + '\'' +
                ", autor='" + autor + '\'' +
                ", categoria='" + categoria + '\'' +
                ", tema='" + tema + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaModificacion=" + fechaModificacion +
                ", Medios=" + Medios +
                '}';
    }
}
