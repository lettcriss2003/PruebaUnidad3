/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author lettc
 */
public class Tiempos {
   
    private Integer id;
    private Double inicio;
    private Double fin;

    
    public Tiempos() {
    }

    public Tiempos(Integer id, Double inicio, Double fin) {
        this.id = id;
        this.inicio = inicio;
        this.fin = fin;
    }
    

  

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getFin() {
        return fin;
    }

    public void setFin(Double fin) {
        this.fin = fin;
    }

    public Double getInicio() {
        return inicio;
    }

    public void setInicio(Double inicio) {
        this.inicio = inicio;
    }

    @Override
    public String toString() {
        return '{' + "inicio ->" + inicio + ", fin ->" + fin + '}';
    }


    
}