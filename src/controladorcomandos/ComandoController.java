/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorcomandos;

import controlador.tda.cola.Cola;
import controlador.tda.lista.ListaEnlazada;
import controlador.tda.lista.ListaEnlazadaServices;
import controlador.tda.lista.exception.PosicionException;
import controlador.tda.lista.exception.TopeExeption;
import java.io.FileOutputStream;
import modelocomandos.Comando;
/**
 *
 * @author jona
 */
public class ComandoController {
    private Cola cola;
    private Comando comando;
    
    public Comando getComando() {
        return comando;
    }
    
    public void setComando(String comando) {
        Comando aux = new Comando();
        aux.setComando(comando);
        this.comando = aux;
    }
    
    public Cola getCola() {
        return cola;
    }

    public void setCola(Cola cola) {
        this.cola = cola;
    }
    
    public ComandoController(Integer tamanio) {
        this.cola = new Cola(tamanio);
    }
     
    public void insertarc(String codigo) {
        try {
             cola.queue(codigo);
        } catch (Exception e) {
        }
 
    }
    public void guardaer(String dato){
    Cola colas= new Cola();
        try {
            colas.queue(dato);
        } catch (Exception e) {
        }
    }
    public void extraer(Integer pos){
        try {
            cola.dequeue(pos);
        } catch (Exception e) {
        }
    }
    
    
    
    
}
