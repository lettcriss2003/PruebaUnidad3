/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.listas.exception;

/**
 *
 * @author lettc
 */
public class ListaNulaException extends Exception {
    public ListaNulaException(String msg) {
        super(msg);
    }

    public ListaNulaException() {
        super("No se puede operar, lista vacia");
    }
    
}
