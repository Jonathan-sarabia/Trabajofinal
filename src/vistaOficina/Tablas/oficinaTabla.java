/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistaOficina.Tablas;

import controlador.tda.cola.Cola;
import controlador.tda.lista.exception.PosicionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import modeloOficina.Ticket;
import modelocomandos.Comando;
import vistaComandos.Tablas.comandosTabla;
import controlador.tda.cola.ColaServices;

/**
 *
 * @author jona
 */
public class oficinaTabla extends AbstractTableModel{
     private ColaServices<Ticket> lista = new ColaServices<>(0);

    public ColaServices<Ticket> getLista() {
        return lista;
    }

    public void setLista(ColaServices<Ticket> lista) {
        this.lista = lista;
    }

  
    @Override
    public int getRowCount() {
       return lista.getSize();
    }

    @Override
    public int getColumnCount() {
       return 3;
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0: return "Nro";
            case 1: return "nombre";
            case 2: return "Tikect";
            default: return null;
        }
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            Ticket f = lista.getCola().obtenerDato(rowIndex);
            switch (columnIndex) {
                case 0:
                    f.setId(rowIndex+1);
                    return f.getId();
                case 1:
                    return f.getNombre();
                case 2:
                    return f.getCodigo();
                default:
                    return null;
            }
        } catch (Exception e) {
            return null;
        }
        
        }
   
    
    
}
