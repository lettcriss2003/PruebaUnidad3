/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.grafos;

import controlador.grafos.exception.GrafoConexionException;
import controlador.grafos.exception.VerticeOfSizeException;
import controlador.listas.ListaEnlazada;
import controlador.listas.exception.PosicionNoEncontradaException;

/**
 *
 * @author lettc
 */
public abstract class Grafo {

    public abstract Integer numVertices();

    public abstract Integer numAristas();

    public abstract Object[] existeArista(Integer i, Integer f) throws VerticeOfSizeException;

    public abstract Double pesoArista(Integer i, Integer f) throws VerticeOfSizeException;

    public abstract void insertarArista(Integer i, Integer j) throws VerticeOfSizeException;

    public abstract void insertarArista(Integer i, Integer j, Double peso) throws VerticeOfSizeException;

    public abstract ListaEnlazada<Adyacencia> adyacente(Integer i) throws VerticeOfSizeException;

    @Override
    public String toString() {
        StringBuilder grafo = new StringBuilder();
        for (int i = 1; i <= numVertices(); i++) {
            try {
                grafo.append("VERTICE " + i);
                ListaEnlazada<Adyacencia> lista = adyacente(i);
                for (int j = 0; j < lista.getSize(); j++) {
                    try {
                        Adyacencia aux = lista.obtenerDato(j);
                        if (aux.getPeso().toString().equalsIgnoreCase(String.valueOf(Double.NaN))) {
                            grafo.append("------- VERTICE DESTINO " + aux.getDestino());
                        } else {
                            grafo.append("------- VERTICE DESTINO " + aux.getDestino() + "------------ peso---" + aux.getPeso());
                        }

                    } catch (PosicionNoEncontradaException ex) {
                    }
                }
                grafo.append("\n");
            } catch (VerticeOfSizeException ex) {
                System.out.println("ERROR: " + ex);
            }
        }
        return grafo.toString();
    }

    
        public ListaEnlazada caminoMinimo(Integer verticeInicial, Integer verticeFinal) throws Exception {
        ListaEnlazada<Integer> camino = new ListaEnlazada();
        if (estaConectado()) {
            ListaEnlazada pesos = new ListaEnlazada();
            Boolean finalizar = false;
            Integer inicial = verticeInicial;
            camino.insertarCabecera(inicial);
            while (!finalizar) {
                System.out.println("***** " + inicial);
                ListaEnlazada<Adyacencia> adycencias = adyacente(inicial);
                Integer T = -1;
                Double peso = 100000000.0;
                for (int i = 0; i < adycencias.getSize(); i++) {
                    Adyacencia ad = adycencias.obtenerDato(i);
                    if (!estaPintado(camino, ad.getDestino())) {
                        Double pesoArista = ad.getPeso();
                        if (verticeFinal.intValue() == ad.getDestino()) {
                            T = ad.getDestino();
                            peso = ad.getPeso();
                            break;
                        } else if (pesoArista < peso) {
                            T = ad.getDestino();
                            peso = pesoArista;
                        }
                    }
                }
                if (T > -1) {
                    pesos.insertarCabecera(peso);
                    camino.insertarCabecera(T);
                    inicial = T;
                } else {
                    throw new GrafoConexionException("NO SE ENCUENTRA EL CAMINO");
                }
                if (verticeFinal.intValue() == inicial.intValue()) {
                    finalizar = true;
                }
            }
        } else {
            throw new GrafoConexionException("LE GRAFO NO ESTA CONECTADO");
        }

        return camino;
    }

    public Boolean estaConectado() {
        Boolean bad = true;
        for (int i = 1; i <= numVertices(); i++) {
            try {
                ListaEnlazada<Adyacencia> lista = adyacente(i);
                for (int j = 0; j < lista.getSize(); j++) {
                    try {
                        Adyacencia aux = lista.obtenerDato(j);
                        if (lista.getSize() == 0) {
                            bad = false;
                            break;
                        }
                    } catch (PosicionNoEncontradaException ex) {
                        System.out.println("ERROR: " + ex);
                    }
                }
            } catch (VerticeOfSizeException ex) {
                System.out.println("ERROR: " + ex);
            }
        }
        return bad;
    }

    private Boolean estaPintado(ListaEnlazada<Integer> lista, Integer vertice) throws PosicionNoEncontradaException {
        Boolean band = false;
        for (int i = 0; i < lista.getSize(); i++) {
            if (lista.obtenerDato(i).intValue() == vertice.intValue()) {
                band = true;
                break;
            }
        }
        return band;
    }


}