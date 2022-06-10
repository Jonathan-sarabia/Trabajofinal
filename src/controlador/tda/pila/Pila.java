/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.tda.pila;

import controlador.tda.lista.ListaEnlazada;
import controlador.tda.lista.NodoLista;
import controlador.tda.lista.exception.EstructuraVaciaException;
import controlador.tda.lista.exception.PosicionException;
import controlador.tda.lista.exception.TopeExeption;

/**
 *
 * @author jona
 */
public class Pila <E> extends ListaEnlazada<E>{
    private Integer tope;
    
    public Pila() {
        this.tope = 0;
    }
     public Pila(Integer tope) {
         this.tope = tope;
     }
      public Boolean estalleno(){
           if (tope == 0)
               return false;
           else if (tope == getSize().intValue())
               return true;
           else
               return false;
      }
      public void push(E dato) throws TopeExeption {
          if(!estalleno()){
              insertarCabecera(dato);
          }else 
              throw  new TopeExeption("La pila esta llena");
      }
      public E pop(Integer pos) throws EstructuraVaciaException, PosicionException{
          E auxdato = null;
          if (!estaVacia()){
              if (pos >= 0 && pos < getSize()) {
                  for (int i = 0; i <= pos; i++) {
                      auxdato = eliminarDato(0);
                  }
                  return auxdato;

            } else {
                throw new PosicionException("Error al realizar la operacion pop: No existe la posicion dada");
            }
          }else
              throw new EstructuraVaciaException("La pila esta vacia");
      }
//      public static void main (String[] args){
//      Pila<Integer> pila = new Pila<>(0);
//          try {
//              pila.push(10);
//              pila.push(1);
//              pila.push(5);
//              pila.push(8);
//              pila.push(2);
//              pila.push(0);
//              pila.imprimir();
//              System.out.println("elemento pop" + pila.pop(2));
//              pila.imprimir();
//              
//          } catch (Exception e) {
//              System.out.println("Error" + e);
//          }
      
      public Integer getTope(){
          return tope;
      }
      
      
      
      
      
      
    
    
    

    
    
}
