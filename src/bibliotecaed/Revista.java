/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaed;

/**
 *
 * @author usuario
 */
public class Revista extends Papel {
    private final int NUMEROPUB;

    public Revista(String TITULO, int FECHAPUB, String ISBN, int PAGINAS, int NUMEROPUB) {
        super(TITULO, FECHAPUB, ISBN, PAGINAS);
        this.NUMEROPUB = NUMEROPUB;
    }
    
    
}
