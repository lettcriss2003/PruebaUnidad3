/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.listas.exception;

/**
 *
 * @author lettc
 */
public class AtributoException extends Exception {
    public AtributoException(String msg) {
        super(msg);
    }

    public AtributoException() {
        super("No se puede encontrar el atributo dado");
    }
    
}
