/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaed;

import java.util.ArrayList;

public class Socio {
    private final String DNI;
    private final String NOMBRE;
    private ArrayList listaPrestamos = new ArrayList();

    public Socio(String DNI, String NOMBRE) {
        this.DNI = DNI;
        this.NOMBRE = NOMBRE;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public ArrayList getListaPrestamos() {
        return listaPrestamos;
    }
        
    public void listarPrestamos(){
        System.out.println("Préstamos de "+this.getNOMBRE()+"\n");
        for (Object l : listaPrestamos) {
            System.out.println(l);
        }
        System.out.println("");
    }
    
    
}
