/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.tda.cola;

import controlador.tda.pila.*;
import controlador.tda.lista.exception.EstructuraVaciaException;
import controlador.tda.lista.exception.PosicionException;
import controlador.tda.lista.exception.TopeExeption;

/**
 *
 * @author jona
 */
public class ColaServices <E> {
    private Cola<E> cola;


    public ColaServices(Integer tope) {
     if(tope == 0)
        cola= new Cola<>();
     else 
         cola = new Cola<>(tope);
    }
    public Cola<E> getCola() {
        return cola;
    }

    public void setCola(Cola<E> cola) {
        this.cola = cola;
    }
    

 
    public boolean queue (E dato) {
        try {
            cola.queue(dato);
            return true;
        } catch (TopeExeption | PosicionException e) {
            System.out.println("Error " + e);
        }
        return false;
    }
    public E dequeue (Integer pos){
        try {
             return cola.dequeue(pos);
            
        } catch (EstructuraVaciaException | PosicionException e) {
            System.out.println("Error " + e);
        }
        return null;
    }
    
    public Integer getSize(){
        return cola.getSize();
    }
    public Integer getTope(){
        return cola.getTope();
    }
    
    
}
