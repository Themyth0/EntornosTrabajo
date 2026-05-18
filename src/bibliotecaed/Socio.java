/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaed;

import java.util.ArrayList;

public class Socio {
    private final String DNI;
    private final String NOMBRE;
    private ArrayList ListaPrestamos = new ArrayList();

    public Socio(String DNI, String NOMBRE) {
        this.DNI = DNI;
        this.NOMBRE = NOMBRE;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }
    
    
}
