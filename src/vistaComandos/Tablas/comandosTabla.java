/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistaComandos.Tablas;

import controlador.tda.cola.Cola;
import controlador.tda.lista.ListaEnlazadaServices;
import controlador.tda.lista.exception.PosicionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import modelocomandos.Comando;

/**
 *
 * @author jona
 */
public class comandosTabla extends AbstractTableModel {
    

    private Cola lista;



    public Cola getLista() {
        return lista;
    }

    public void setLista(Cola lista) {
        this.lista = lista;
    }
    
    
    @Override
    public int getRowCount() {
        return lista.getSize();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

     @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0: return "Nro";
            case 1: return "Comandos";
            default: return null;
        }
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Comando aux= new Comando();
        try {
            aux.setComando(lista.obtenerDato(rowIndex));
        } catch (PosicionException ex) {
            Logger.getLogger(comandosTabla.class.getName()).log(Level.SEVERE, null, ex);
        }
     Comando comando = aux;
        switch(columnIndex) {
            case 0: return (rowIndex+1);
            case 1: return comando.getComando();
            default: return null;
        }
    }
    
}
