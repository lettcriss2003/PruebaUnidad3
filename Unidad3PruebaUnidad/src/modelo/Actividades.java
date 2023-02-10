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
public class Actividades {
    private Integer id;
    private String nombre;
    private int numEstudiantes;
    private Tiempos tiempo;

    public Actividades() {
    }

    public Actividades(Integer id, String nombre, int numEstudiantes, Tiempos tiempo) {
        this.id = id;
        this.nombre = nombre;
        this.numEstudiantes = numEstudiantes;
        this.tiempo = tiempo;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    public void setNumEstudiantes(int numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }

    public Tiempos getTiempo() {
        return tiempo;
    }
    
    public void setTiempo(Tiempos tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
}
