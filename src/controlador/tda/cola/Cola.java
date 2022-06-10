/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.tda.cola;

import controlador.tda.lista.ListaEnlazada;
import controlador.tda.lista.exception.EstructuraVaciaException;
import controlador.tda.lista.exception.PosicionException;
import controlador.tda.lista.exception.TopeExeption;

/**
 *
 * @author jona
 */
public class Cola<E> extends ListaEnlazada<E> {
    private Integer tope;
    
    public Cola(Integer tope){
    this.tope = tope;
    }

    public Cola() {
        this.tope = 0;
    }
    
    
    public Boolean estaLleno(){
    if(tope == 0)
        return false;
    else if(tope == getSize().intValue())
        return true;
    else 
        return false;
    }
    public void queue(E dato) throws TopeExeption,PosicionException{
     if(!estaLleno()){
              insertar(dato, getSize()-1);
          }else 
              throw  new TopeExeption("La pila esta llena");
    }
    
    public E dequeue(Integer pos) throws EstructuraVaciaException, PosicionException{
          E auxdato = null;
          if (!estaVacia()){
              if (pos >= 0 && pos < getSize()) {
                  for (int i = 0; i <= pos; i++) {
                      auxdato = eliminarDato(0);
                  }
                  return auxdato;

            } else {
                throw new PosicionException("Error al realizar la operacion dequeue: No existe la posicion dada");
            }
          }else
              throw new EstructuraVaciaException("La cola esta vacia");
      }

    public Integer getTope() {
        return tope;
    }
    
    
}
