package modelo;

import java.util.Date;

public class Investigacion {



    private Boolean estado;
    private String titulo;
    private String subtitulo;
    private String autor;
    private String categoria;
    private String tema;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private Media Media;

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Investigacion(Boolean estado, String titulo, String subtitulo, String autor, String categoria, String tema, Date fechaCreacion, Date fechaModificacion, Media media) {
        this.estado = estado;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.autor = autor;
        this.categoria = categoria;
        this.tema = tema;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        Media = media;
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

    public Media getMedia() {
        return Media;
    }

    public void setMedia(Media media) {
        Media = media;
    }

    @Override
    public String toString() {
        return "modelo.Investigacion{" +
                "titulo='" + titulo + '\'' +
                ", subtitulo='" + subtitulo + '\'' +
                ", autor='" + autor + '\'' +
                ", categoria='" + categoria + '\'' +
                ", tema='" + tema + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaModificacion=" + fechaModificacion +
                ", Medios=" + Media +
                '}';
    }
}
