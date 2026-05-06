/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaed;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Pelicula extends Audiovisual {
    
    private final String DIRECTOR;
    private boolean prestado;
    private ArrayList ListaPrestamos = new ArrayList();

    public Pelicula(String TITULO, int FECHAPUB, String ISAN, int DURACION, String DIRECTOR) {
        super(TITULO, FECHAPUB, ISAN, DURACION);
        this.DIRECTOR = DIRECTOR;
        this.prestado = false;
    }
    
    
    
}
