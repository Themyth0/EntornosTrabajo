/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaed;

/**
 *
 * @author usuario
 */
public class CD extends Audiovisual {
    private final String ARTISTA;
    private final int PISTAS;

    public CD(String TITULO, int FECHAPUB, String ISAN, int DURACION, String ARTISTA, int PISTAS) {
        super(TITULO, FECHAPUB, ISAN, DURACION);
        this.ARTISTA = ARTISTA;
        this.PISTAS = PISTAS;
    }
    
    @Override
    public String datos() {
        return super.datos()+"\nArtista: "+ARTISTA+"\nPistas: "+PISTAS;
    }
    
    
    
}
