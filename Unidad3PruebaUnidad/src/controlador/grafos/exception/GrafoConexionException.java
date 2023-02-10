/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.grafos.exception;

/**
 *
 * @author lettc
 */

public class GrafoConexionException extends Exception{

    /**
     * Creates a new instance of <code>GrafoConexionException</code> without
     * detail message.
     */
  
    public GrafoConexionException(String msg) {
        super(msg);
    }
    
      public GrafoConexionException() {
          super("Coneccion no existe");
    }
}
