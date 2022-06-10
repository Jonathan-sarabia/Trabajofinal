

package controladorOficina;

import controlador.DAO.AdaptadorDao;
import controlador.tda.cola.Cola;
import controlador.tda.cola.ColaServices;
import controlador.tda.lista.ListaEnlazadaServices;
import modeloOficina.Ticket;

/**
 *
 * @author jona
 */
public class OficinaController extends AdaptadorDao<Ticket>{
    private Ticket ticket;
    private ListaEnlazadaServices<Ticket> listaTickets;
    private ColaServices<Ticket> cola2 = new  ColaServices<Ticket>(21);

    public ColaServices<Ticket> getCola2() {
        return cola2;
    }

    public void setCola2(ColaServices<Ticket> cola2) {
        this.cola2 = cola2;
    }
    private Cola<Ticket> cola = new Cola<>(3);
    
    

    public OficinaController() {
        super(Ticket.class);
        //listado();
    }

    public Ticket getTicket() {
       if (this.ticket == null) {
            this.ticket = new Ticket();
        }
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ListaEnlazadaServices<Ticket> getListaTickets() {
        return listaTickets;
    }

    public void setListaTickets(ListaEnlazadaServices<Ticket> listaTickets) {
        this.listaTickets = listaTickets;
    }
    

    

  
  public Integer generarcodigo(){
      Integer num = (new Integer((int)((Math.random() * 1000))));
      return num;
  }
  
   public Boolean guardar() {
        try {            
            getTicket().setId(listaTickets.getSize()+1);
            guardar(getTicket());
            return true;
        } catch (Exception e) {
            System.out.println("Error en guardar autor"+e);
        }
        return false;
    }
    public Boolean modificar(Integer pos) {
        try {            
            
            modificar(getTicket(), pos);
            return true;
        } catch (Exception e) {
            System.out.println("Error en modificar ticket"+e);
        }
        return false;
    }
    
    public ColaServices<Ticket> listado() {
        setCola2(listar());
        return cola2;
    }

}
