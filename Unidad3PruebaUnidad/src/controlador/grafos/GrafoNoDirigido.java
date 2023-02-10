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

public class GrafoNoDirigido extends GrafoDirigido{

    public GrafoNoDirigido(Integer numV) {
        super(numV);
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
    
}