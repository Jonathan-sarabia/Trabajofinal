/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorCine;

import controlador.DAO.AdaptadorDao;
import controlador.tda.cola.Cola;
import controlador.tda.cola.ColaServices;
import modeloCine.Pelicula;
import modeloCine.Ratings;
import modeloOficina.Ticket;

/**
 *
 * @author jona
 */
public class MovieController extends AdaptadorDao<Pelicula>{
    private Pelicula movie;
    private Ratings ratings;
    private ColaServices<Pelicula> lismovie = new  ColaServices<Pelicula>(0);
    
    
    public MovieController() {
        super(Pelicula.class);
        listado();
    }

    public Pelicula getMovie() {
        if (this.movie == null) {
            this.movie = new Pelicula();
        }
        return movie;
    }

    public Ratings getRatings() {
         if (this.ratings == null) {
            this.ratings = new Ratings();
        }
        return ratings;
    }

    public void setRatings(Ratings ratings) {
        this.ratings = ratings;
    }
    

    public void setMovie(Pelicula movie) {
        this.movie = movie;
    }

    public ColaServices<Pelicula> getLismovie() {
        return lismovie;
    }

    public void setLismovie(ColaServices<Pelicula> lismovie) {
        this.lismovie = lismovie;
    }

    public Boolean guardar() {
        try {            
            //getMovie().set(listaTickets.getSize()+1);
            guardar(getMovie());
            return true;
        } catch (Exception e) {
            System.out.println("Error en guardar autor"+e);
        }
        return false;
    }
    public Boolean modificar(Integer pos) {
        try {            
            
            modificar(getMovie(), pos);
            return true;
        } catch (Exception e) {
            System.out.println("Error en modificar ticket"+e);
        }
        return false;
    }
    
    public ColaServices<Pelicula> listado() {
        setLismovie(listar());
        return lismovie;
    }
//    public static void main(String[] args) {
//        MovieController  mv = new MovieController();
//        try {
//           mv.getMovie().setTitle("La venganza de gilgamesh");
//           short num = 2002; 
//           mv.getMovie().setYear(num);
//           mv.getMovie().setRated("80%");
//           mv.getMovie().setActors("Jualian M, Rosa G");
//           mv.getMovie().setAwards("2 premios");
//           mv.getMovie().setCountry("España");
//           mv.getMovie().setLenguaje("Español");
//           mv.getMovie().setProducion("pollos hermanos");
//           mv.getMovie().setDirector("Snyder Cut");
//           mv.getMovie().setPoster("WW.Images.masalla.com");
//           mv.getMovie().setDVD("si");
//           mv.getMovie().setReleased("06-06-22");
//           mv.getMovie().setGenre("Accion");
//           mv.getMovie().setImdbID("293jas");
//           mv.getMovie().setPlot("Un semi dios busca su inmortalidad");
//           mv.getMovie().setImdbRating(89.7);
//           mv.getMovie().setImdbVotes(132.9);
//           mv.getMovie().setTyte("Pelicula");
//           mv.getMovie().setMetascore(10);
//           mv.getMovie().setBoxoffice(999.22);
//           mv.getMovie().setResponse(Boolean.TRUE);
//           mv.getMovie().setWebsite("www.pelis");
//           mv.getMovie().setRuntime("2 horas");
//           mv.getRatings().setSourse("patato");
//           mv.getRatings().setValue("100%");
//           mv.guardar();
//            
//        } catch (Exception e) {
//            System.out.println("Error "+e);
//        }
        
    
    
    
    
    
    
    
    
}
