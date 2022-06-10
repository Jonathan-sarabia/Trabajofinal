/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.cineTablas;

import controlador.tda.cola.ColaServices;
import javax.swing.table.AbstractTableModel;
import modeloCine.Pelicula;
import modeloOficina.Ticket;

/**
 *
 * @author jona
 */
public class TablaCine extends AbstractTableModel {

    private ColaServices<Pelicula> lista = new ColaServices<>(0);

    public ColaServices<Pelicula> getLista() {
        return lista;
    }

    public void setLista(ColaServices<Pelicula> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.getSize();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            Pelicula f = lista.getCola().obtenerDato(rowIndex);
            switch (columnIndex) {
                case 0:
                    return rowIndex + 1;
                case 1:
                    return f.getTitle();
                case 2:
                    return f.getTyte();
                case 3:
                    return f.getGenre();
                case 4:
                    return f.getDirector();
                case 5:
                    return f.getRated();
                default:
                    return null;
            }
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nro";
            case 1:
                return "Titulo";
            case 2:
                return "Tipo";
            case 3:
                return "Genero";
            case 4:
                return "Director";
            case 5:
                return "Calificacion";

            default:
                return null;
        }
    }

}
