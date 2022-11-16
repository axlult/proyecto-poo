import java.util.Date;

public class Proyecto  {


    private String estado;
    private Date fecha;
    private String categoria;
    private String nombre;
    private Usuario[] usuario;
    private Date ultimaModificacion;
    private String repositorio;
    private Investigacion[] investigacion;

    public Proyecto(String estado, Date fecha, String categoria, String nombre, Usuario[] usuario, Date ultimaModificacion, String repositorio, Investigacion[] investigacion) {
        this.estado = estado;
        this.fecha = fecha;
        this.categoria = categoria;
        this.nombre = nombre;
        this.usuario = usuario;
        this.ultimaModificacion = ultimaModificacion;
        this.repositorio = repositorio;
        this.investigacion = investigacion;
    }


    public Usuario[] getUsuario() {
        return usuario;
    }
    public String getEstado() {
        return estado;
    }

    public void setUsuario(Usuario[] usuario) {
        this.usuario = usuario;
    }

    public Investigacion[] getInvestigacion() {
        return investigacion;
    }

    public void setInvestigacion(Investigacion[] investigacion) {
        this.investigacion = investigacion;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Date getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(Date ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(String repositorio) {
        this.repositorio = repositorio;
    }




}
