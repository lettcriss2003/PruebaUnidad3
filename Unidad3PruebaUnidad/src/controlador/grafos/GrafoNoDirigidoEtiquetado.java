/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.grafos;

import controlador.grafos.exception.VerticeOfSizeException;
/**
 *
 * @author lettc
 */

public class GrafoNoDirigidoEtiquetado <E> extends GrafoDirigidoEtiquetado<E> {
    public GrafoNoDirigidoEtiquetado(Integer numV, Class clazz) {
       super(numV, clazz);
    }

    @Override
    public void insertarArista(Integer o, Integer d, Double peso) throws VerticeOfSizeException {
        if (o > 0 && d > 0 &&o <= numVertices && d <= numVertices) {
            Object[] existe = existeArista(o, d);
            if (!((Boolean) existe[0])) {
                numAristas++;
                listaAdyacente[o].insertarCabecera(new Adyacencia(d, peso));
                listaAdyacente[d].insertarCabecera(new Adyacencia(o, peso));
            }
        } else {
            throw new VerticeOfSizeException("VERTICE NO EXISTE");
        }
    }

    @Override
    public void insertarAristaE(E o, E d, Double peso) throws Exception {
        insertarArista(obtenerCodigo(o),obtenerCodigo(d), peso);
        insertarArista(obtenerCodigo(d),obtenerCodigo(o), peso);
    }

    /**
     *
     * @param inicio
     * @return String
     * @throws Exception
     */
    public String toStringBusquedaEnAnchura(E inicio) throws Exception {
        return super.toStringBusquedaEnAnchura(obtenerCodigo(inicio)); 
    }
    
    public String toStringBusquedaEnProfundidad(E inicio) throws Exception {
        return super.arrayToString(busquedaEnProfuendidad());
    }

    @Override
    public String arrayToString(Integer[] v) {
       StringBuilder sb = new StringBuilder();
        for (int i = 0; i < v.length; i++) {
           try {
               sb.append(obtenerEtiqueta(v[i]).toString() + " |\t");
           } catch (Exception ex) {               
           }
        }
        return sb.toString();
    }
    
  
    
}