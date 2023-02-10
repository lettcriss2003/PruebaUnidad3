/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.adaptadorDao;

import modelo.Actividades;

/**
 *
 * @author lettc
 */
public class ActividadesDao extends AdaptadorDao<Actividades> {
    private Actividades actividad;

 
    public ActividadesDao(Class<Actividades> clazz) {
        super(Actividades.class);
    }

    public Actividades getActividade() {
        return actividad;
    }

    public void setActividade(Actividades actividade) {
        this.actividad = actividade;
    }
    

    public boolean guardar() throws Exception{
        this.actividad.setId(generarId());
        guardar(this.actividad);
        return true;
    
    }
    
     private Integer generarId(){
        return listar().getSize()+1;
    }
    
    public Actividades obtenerPropiedad(Integer id){
        if (id<=listar().getSize()) {
            return obtener(id);
        }else{
            System.out.println("FUERA DE LIMITES DEL ARCHIVO");
            return null;
        }
    }
    
    public boolean modificar(Integer pos) throws Exception{
        modificar(this.actividad, pos);
        return true;
    }
    
    
}
