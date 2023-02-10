/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modeloTabla;

import controlador.grafos.GrafoNoDirigidoEtiquetado;
import javax.swing.table.AbstractTableModel;
import modelo.Actividades;

/**
 *
 * @author lettc
 */

public class TablaActividades extends AbstractTableModel {

    private GrafoNoDirigidoEtiquetado<Actividades> actividadesGrafo;

    public GrafoNoDirigidoEtiquetado<Actividades> getActividadesGrafo() {
        return actividadesGrafo;
    }

    public void setActividadesGrafo(GrafoNoDirigidoEtiquetado<Actividades> actividadesGrafo) {
        this.actividadesGrafo = actividadesGrafo;
    }

    
    @Override
    public int getRowCount() {
        return actividadesGrafo.numVertices();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nro";
            case 1:
                return "Nombre";
            case 2:
                return "Numero de Estudiantes";
            case 3:
                return "Tiempos";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            Actividades h = actividadesGrafo.obtenerEtiqueta(rowIndex+1);
            switch (columnIndex) {
                case 0:
                    return (rowIndex + 1);
                case 1:
                    return h.getNombre();
                case 2:
                    return h.getNumEstudiantes();
                case 3:
                    return (h.getTiempo()==null)?"No tiene ningun tiempo definido":h.getTiempo().toString();
                default:
                    return null;
            }
        } catch (Exception e) {
            return null;
        }
    }

}