package dao;

import modelo.Proyecto;

import java.util.ArrayList;
import java.util.List;

public class ProyectoDAO {
    private List<Proyecto> proyectos;


    public int buscar(String proyecto) {
        int n = -1;
        for (int i = 0; i < proyectos.size(); i++) {
            if (proyectos.get(i).getUsuario().equals(proyecto)) {
                n = i;
                break;
            }
        }
        return n;
    }
    public boolean insertar (Proyecto proyecto){
        if (buscar(proyecto.getNombre())==-1){
            proyectos.add(proyecto);
            return true;
        }else{
            return false;
        }
    }

    public Proyecto obtener(String proyecto) {
        if (buscar(proyecto)!=-1) {
            return proyectos.get(buscar(proyecto));
        } else {
            return null;
        }
    }
    public boolean modificar(Proyecto proyecto) {
        if (buscar(proyecto.getNombre())!=-1) {
            Proyecto proyectoaux = obtener(proyecto.getNombre());
            proyectoaux.setEstado(proyecto.getEstado());
            proyectoaux.setUltimaModificacion(proyecto.getUltimaModificacion());
            proyectoaux.setUsuario(proyecto.getUsuario());
            proyectoaux.setCategoria(proyecto.getCategoria());
            proyectoaux.setRepositorio(proyecto.getRepositorio());
            proyectoaux.setInvestigacion(proyecto.getInvestigacion());

            return true;
        }else {
            return false;
        }
    }

}
