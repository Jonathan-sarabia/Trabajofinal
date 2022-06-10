/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.tda.pila;

import controlador.tda.lista.exception.EstructuraVaciaException;
import controlador.tda.lista.exception.PosicionException;
import controlador.tda.lista.exception.TopeExeption;

/**
 *
 * @author jona
 */
public class PilaServices <E>{
    private Pila<E> pila;

    public PilaServices(Integer tope) {
     if(tope == 0)
        pila= new Pila<>();
     else 
         pila = new Pila<>(tope);
    }
    public boolean push (E dato){
        try {
            pila.push(dato);
            return true;
        } catch (TopeExeption e) {
            System.out.println("Error " + e);
        }
        return false;
    }
    public E pop (Integer pos){
        try {
             return pila.pop(pos);
            
        } catch (EstructuraVaciaException | PosicionException e) {
            System.out.println("Error " + e);
        }
        return null;
    }
    
    public Integer getSize(){
        return pila.getSize();
    }
    public Integer getTope(){
        return pila.getTope();
    }
    
    
}
