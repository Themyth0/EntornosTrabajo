/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaed;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Pelicula extends Audiovisual implements Prestable {
    
    private final String DIRECTOR;
    private boolean prestado;
    private ArrayList listaPrestamos = new ArrayList();

    public Pelicula(String TITULO, int FECHAPUB, String ISAN, int DURACION, String DIRECTOR) {
        super(TITULO, FECHAPUB, ISAN, DURACION);
        this.DIRECTOR = DIRECTOR;
        this.prestado = false;
    }

    @Override
    public void presta(Socio s) {
       this.prestado = true;
       LocalDate currentDate = LocalDate.now();
       listaPrestamos.add(currentDate+" "+s.getNOMBRE()+" SALIDA BIBLIOTECA");
       s.getListaPrestamos().add(currentDate+" "+this.getTITULO()+" SALIDA BIBLIOTECA");
    }

    @Override
    public void devuelve(Socio s) {
        this.prestado = false;
        LocalDate currentDate = LocalDate.now();
        listaPrestamos.add(currentDate+" "+s.getNOMBRE()+" RETORNO BIBLIOTECA");
        s.getListaPrestamos().add(currentDate+" "+this.getTITULO()+" RETORNO BIBLIOTECA");
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }
    
    public void listarPrestamos(){
        System.out.println("Préstamos de "+this.getTITULO()+"\n");
        for (Object l : listaPrestamos) {
            System.out.println(l);
        }
        System.out.println("");
    }
    
     @Override
    public String datos() {
        return prestado ? super.datos()+"\nDirector: "+DIRECTOR+"\nEn la biblioteca: No":super.datos()+"\nDirector: "+DIRECTOR+"\nEn la biblioteca: Sí";
    }
    
}
