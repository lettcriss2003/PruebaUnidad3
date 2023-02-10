package controlador.listas.exception;


public class ListaLlenaException extends Exception {
     public ListaLlenaException(String msg) {
        super(msg);
    }
    public ListaLlenaException() {
        super("La lista esta llena, no puede insertar un nuevo hotel");
    }

}