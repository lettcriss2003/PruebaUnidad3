/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador.actividades;

import controlador.grafos.GrafoNoDirigidoEtiquetado;
import java.util.Random;
import modelo.Actividades;
import modelo.Tiempos;

/**
 *
 * @author lettc
 */

public class ActividadesController {
    private GrafoNoDirigidoEtiquetado<Actividades> gnde;
    private Actividades actividad;

   
    public ActividadesController() {
        gnde=new GrafoNoDirigidoEtiquetado<>(7,Actividades.class);
        Random rand = new Random();
        for (int i = 1; i <= 7; i++) {
            Tiempos u= new Tiempos();
            u.setId(i);
//            u.setInicio(Math.round((90.99 + ( 90.99 - (-90.99) ) * rand.nextDouble())*100.0)/100.0);
//            u.setFin(Math.round((90.99 + ( 90.99 - (-90.99) ) * rand.nextDouble())*100.0)/100.0);
            u.setInicio(Math.round((3.99 + ( 3.99 - (-3.99) ) * rand.nextDouble())*100.0)/100.0);
            u.setFin(Math.round((5.99 + ( 5.99 - (-5.99) ) * rand.nextDouble())*100.0)/100.0);
            Actividades h= new Actividades(i,"Actividad "+i, i, u);
            gnde.etiquetarVertice(i, h);
        }
        SinActividades();    
    }

    public GrafoNoDirigidoEtiquetado<Actividades> getGnde() {
        return gnde;
    }

    public void setGnde(GrafoNoDirigidoEtiquetado<Actividades> gnde) {
        this.gnde = gnde;
    }

    public Actividades getActividad() {
        if(actividad==null){
            actividad= new Actividades();
        }
        return actividad;
    }
    
    public void setActividad(Actividades actividad) {
        this.actividad = actividad;
    }
    

    public void SinActividades(){
        Tiempos u= new Tiempos(0,0.0,0.0);        
        actividad = new Actividades(0,"",0, u); 
    }

    public Double calcularTiempos(Actividades ai, Actividades af) {
        Double timp = 0.0;
        Double inicio = ai.getTiempo().getFin() - af.getTiempo().getFin();
        Double fin = ai.getTiempo().getInicio() - af.getTiempo().getInicio();
        timp = Math.sqrt((inicio*inicio) + (fin*fin));
        return timp;
    }


    public Boolean NuevaActividad( ) {
        try {
            gnde.nuevoGrafo();
            System.out.println(actividad.getNombre());
            gnde.etiquetarVertice(gnde.numVertices(), actividad);
            SinActividades();
            return true;
        } catch (Exception e) {
            return false;
        }       
    }
    
}