                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelocomandos;

/**
 *
 * @author jona
 */
public class Comando {
    
    private Object comando;
    private Integer id;

    public Object getComando() {
        return comando;
    }

    public void setComando(Object comando) {
        this.comando = comando;
    }

    @Override
    public String toString() {
        return comando.toString();
    }

   

    
    
    
}
