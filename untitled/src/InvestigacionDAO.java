import java.util.ArrayList;

public class InvestigacionDAO {

    ArrayList<Investigacion> investigaciones = new ArrayList<>();


    public boolean insertarInvestigaciones (Investigacion investigacion){
        if (buscarInvestigaciones(investigacion.getTitulo())==-1){
            investigaciones.add(investigacion);
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Investigacion> verinvestigaciones(){
        return investigaciones;
    }



    public int buscarInvestigaciones(String investigacion) {
        int n = -1;
        for (int i = 0; i < investigaciones.size(); i++) {
            if (investigaciones.get(i).getTitulo().equals(investigacion)) {
                n = i;
                break;
            }
        }
        return n;
    }

    public boolean modificarInvestigaciones(Investigacion investigacion) {
        if (buscarInvestigaciones(investigacion.getTitulo())!=-1) {
            Investigacion investigacionaux = obtenerInvestigaciones(investigacion.getTitulo());
            investigacionaux.setTitulo(investigacion.getTitulo());
            investigacion.setSubtitulo(investigacion.getSubtitulo());
            investigacion.setAutor(investigacion.getAutor());
            investigacion.setCategoria(investigacion.getCategoria());
            investigacion.setTema(investigacion.getTema());
            investigacion.setFechaCreacion(investigacion.getFechaCreacion());
            investigacion.setFechaModificacion(investigacion.getFechaModificacion());
            return true;
        }else {
            return false;
        }
    }

    public Investigacion obtenerInvestigaciones(String investigacion) {
        if (buscarInvestigaciones(investigacion)!=-1) {
            return investigaciones.get(buscarInvestigaciones(investigacion));
        } else {
            return null;
        }
    }


}
