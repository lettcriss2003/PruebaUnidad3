/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.grafos;

import controlador.grafos.exception.VerticeOfSizeException;
import controlador.listas.ListaEnlazada;
import controlador.listas.exception.PosicionNoEncontradaException;

/**
 *
 * @author lettc
 */
public class GrafoDirigido extends Grafo {

    protected Integer numVertices;
    protected Integer numAristas;
    protected ListaEnlazada<Adyacencia> listaAdyacente[];
    protected Integer[] grafosVistds;
    protected Integer grafoOrdenVisita;
    protected ListaEnlazada<Integer> nuevaLista;

    public GrafoDirigido(Integer numVertices) {
        this.numVertices = numVertices;
        this.numAristas = 0;
        listaAdyacente = new ListaEnlazada[numVertices + 1];
        for (int i = 0; i <= this.numVertices; i++) {
            listaAdyacente[i] = new ListaEnlazada<>();
        }
    }
    
    @Override
    public Integer numVertices() {
        return this.numVertices;
    }

    @Override
    public Integer numAristas() {
        return this.numAristas;
    }
    

    @Override
    public Object[] existeArista(Integer o, Integer d) throws VerticeOfSizeException {
        Object[] existe = {Boolean.FALSE, Double.NaN};
        if (o > 0 && d > 0 && o <= numVertices && d <= numVertices) {
            ListaEnlazada<Adyacencia> lista = listaAdyacente[o];
            for (int i = 0; i < lista.getSize(); i++) {
                try {
                    Adyacencia aux = lista.obtenerDato(i);
                    if (aux.getDestino().intValue() == d.intValue()) {
                        existe[0] = Boolean.TRUE;
                        existe[1] = aux.getPeso();
                        break;
                    }
                } catch (Exception e) {
                }
            }
            return existe;
        } else {
            throw new VerticeOfSizeException("VERTICE NO EXISTE");
        }
    }

    public void setAtributos(Integer numVertices, Integer numAristas, ListaEnlazada<Adyacencia>[] listaAdyacente) {
        this.numVertices = numVertices;
        this.numAristas = numAristas;
        this.listaAdyacente = listaAdyacente;
    }

    public void nuevoGrafo() {
        GrafoDirigido nuevoGrafo = new GrafoDirigido(numVertices() + 1);
        try {
            for (int i = 0; i < numVertices(); i++) {
                ListaEnlazada<Adyacencia> lista = adyacente(i);
                for (int j = 0; j < lista.getSize(); j++) {
                    Adyacencia aux = lista.obtenerDato(j);
                    nuevoGrafo.insertarArista(i, aux.getDestino(), aux.getPeso());
                }
            }
            setAtributos(nuevoGrafo.numVertices(), nuevoGrafo.numAristas(), nuevoGrafo.listaAdyacente);
        } catch (Exception e) {
            System.out.println("ERROR COPIA: " + e);
        }
    }



    @Override
    public Double pesoArista(Integer o, Integer d) throws VerticeOfSizeException {
        Double peso = Double.NaN;
        Object[] existe = existeArista(o, d);
        if (((Boolean) existe[0])) {
            peso = (Double) existe[1];
        }
        return peso;
    }

    @Override
    public void insertarArista(Integer o, Integer d) throws VerticeOfSizeException {
        insertarArista(o, d, Double.NaN);
    }

    @Override
    public void insertarArista(Integer o, Integer d, Double peso) throws VerticeOfSizeException {
        if (o > 0 && d > 0 && o <= numVertices && d <= numVertices) {
            Object[] existe = existeArista(o, d);
            if (!((Boolean) existe[0])) {
                numAristas++;
                listaAdyacente[o].insertarCabecera(new Adyacencia(d, peso));
            }
        } else {
            throw new VerticeOfSizeException("Algun vertice ingresado no existe");
        }

    }

    @Override
    public ListaEnlazada<Adyacencia> adyacente(Integer i) throws VerticeOfSizeException {
        return listaAdyacente[i];
    }

    public ListaEnlazada<Integer> floyd(Integer origen, Integer destino) throws Exception {
        ListaEnlazada<Integer> camino_floyd = new ListaEnlazada<>();
        Integer[][] auxMatrizOrigen = new Integer[numVertices + 1][numVertices + 1];
        Integer[][] auxMatrizCaminos = new Integer[numVertices + 1][numVertices + 1];
        Double[][] auxMatrizDestino = new Double[numVertices + 1][numVertices + 1];
        pesos(auxMatrizOrigen, auxMatrizCaminos, auxMatrizDestino);
        for (int i = 1; i <= numVertices(); i++) {
            for (int j = 1; j <= numVertices(); j++) {
                for (int k = 1; k <= numVertices(); k++) {
                    if (auxMatrizDestino[j][i] + auxMatrizDestino[i][k] < auxMatrizDestino[j][k]) {
                        auxMatrizDestino[j][k] = auxMatrizDestino[j][i] + auxMatrizDestino[i][k];
                        auxMatrizOrigen[j][k] = auxMatrizCaminos[i][k];
                    }
                }
            }
        }
        while (origen != destino) {
            camino_floyd.insertarCabecera(origen);
            origen = auxMatrizOrigen[origen][destino];
        }
        camino_floyd.insertarCabecera(origen);
        return camino_floyd;
    }
    

    public void pesos(Integer[][] auxMatrizOrigen, Integer[][] auxMatrizCaminos, Double[][] auxMatrizDestino) throws Exception {
        for (int i = 1; i <= numVertices(); i++) {
            for (int j = 1; j <= numVertices(); j++) {
                auxMatrizOrigen[i][j] = j;
                auxMatrizCaminos[i][j] = i;
                if (i == j) {
                    auxMatrizDestino[i][j] = 0.0;
                    auxMatrizOrigen[i][j] = 0;
                    auxMatrizCaminos[i][j] = 0;
                } else {
                    auxMatrizDestino[i][j] = ((!(Boolean) existeArista(i, j)[0]) ? Double.POSITIVE_INFINITY : pesoArista(i, j));
                }

            }
        }
    }
    
    
    static final int V = 9;

    int tiempoMinimo(int dist[], Boolean[] visitados) {
        int min = Integer.MAX_VALUE, min_index = -1;
        for (int v = 0; v < V; v++) {
            if (visitados[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
        }
        return min_index;
    }

    void ConocerTiempo(int dist[], int n) {
        System.out.println("Tiempo");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }
    
    void Algoritmodijkstra(Integer[][] auxMatrizOrigen, Integer[][] auxMatrizCaminos, Double[][] auxMatrizDestino, Boolean sptSet []) {
        int dist[] = new int[V];

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        for (int count = 0; count < V - 1; count++) {
            int u = tiempoMinimo(dist, sptSet);
            sptSet[u] = true;
            for (int v = 0; v < V; v++) {
                if (!sptSet[v] && auxMatrizCaminos[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + auxMatrizCaminos[u][v] < dist[v]) {
                    dist[v] = dist[u] + auxMatrizCaminos[u][v];
                }
            }
        }
        ConocerTiempo(dist, V);
    }
    
    public String toStringDijkstra() throws Exception{
        return arrayToString(grafosVistds);
    
    }

//    void dijkstra(int graph[][], int src) {
//        int dist[] = new int[V];
//
//        Boolean sptSet[] = new Boolean[V];
//
//        for (int i = 0; i < V; i++) {
//            dist[i] = Integer.MAX_VALUE;
//            sptSet[i] = false;
//        }
//
//        dist[src] = 0;
//
//        for (int count = 0; count < V - 1; count++) {
//            int u = tiempoMinimo(dist, sptSet);
//            sptSet[u] = true;
//            for (int v = 0; v < V; v++) {
//                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
//                    dist[v] = dist[u] + graph[u][v];
//                }
//            }
//        }
//        ConocerTiempo(dist, V);
//    }

    public Integer[] busquedaEnAnchura(Integer inicio) throws PosicionNoEncontradaException {
        Integer[] recorrido = new Integer[numVertices];
        recorrido[0] = inicio;
        Integer c = 1;
        int i = 0;
        boolean existe = false;
        while (c < numVertices) {
            i++;
            for (int j = 0; j < listaAdyacente[inicio].getSize(); j++) {
                for (int k = 0; k < recorrido.length; k++) {
                    if (recorrido[k] == listaAdyacente[inicio].obtenerDato(j).getDestino()) {
                        existe = true;
                        break;
                    } else {
                        existe = false;
                    }
                }
                if (!existe) {
                    recorrido[c] = listaAdyacente[inicio].obtenerDato(j).getDestino();
                    c++;
                }
            }

            if (inicio == numVertices) {
                inicio = 0;
            }
            if (c == numVertices) {
                break;
            }
            inicio++;
            if (i > numVertices) {
                break;
            }
        }
  
        
        return recorrido;
    }

    public String toStringBusquedaEnAnchura(Integer inicio)throws Exception {
        return arrayToString(busquedaEnAnchura(inicio));
    }
    
    public Integer[] busquedaEnProfuendidad() throws Exception {
        Integer[] recorrido = new Integer[numVertices()];
        grafosVistds = new Integer[numVertices() + 1];
        grafoOrdenVisita = 0;
        
        for (int i = 0; i <= numVertices(); i++) {
            grafosVistds[i] = 0;
        }

        for (int j = 1; j <= numVertices(); j++) {
            if (grafosVistds[j] == 0) {
                busquedaEnProfundidad(j, recorrido);
            }
        }
        Integer aux[] = recorrido;
        for (int k = 0; k < recorrido.length; k++) {
            for (int l = 0; l < aux.length; l++) {
                if (l != l) {
                    if (recorrido[l] == aux[l]) {
                        for (int i = l; i < aux.length-1; i++) {
                                recorrido[i] = aux[i + 1];
                           
                        }
                    }
                }
            }
        }
        
        return recorrido;
    }

    private void busquedaEnProfundidad(Integer origen, Integer res[]) throws Exception {
        res[grafoOrdenVisita] = origen;
        grafosVistds[origen] = grafoOrdenVisita++;
        ListaEnlazada<Adyacencia> lista = listaAdyacente[origen];
        for (int i = 0; i < lista.getSize(); i++) {
            Adyacencia a;           
            if (lista.existeDato(i)) {
                 break;
            } else {
                a = lista.obtenerDato(i);
            }
            
            lista.setCabecera(lista.getCabecera().getSiguiente());
            if (grafosVistds[a.getDestino()] == 0) {
                busquedaEnProfundidad(a.getDestino(), res);
                
            }
        }
    }

    public String toStringBusquedaEnProfundidad() throws Exception {
        return arrayToString(busquedaEnProfuendidad());
    }
    
    public String arrayToString(Integer v[]) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < v.length; i++) {
            sb.append(v[i] + " |\t");
        }
        return sb.toString();
    }
    

}