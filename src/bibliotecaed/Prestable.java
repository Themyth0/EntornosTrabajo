/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaed;

/**
 *
 * @author usuario
 */
public interface Prestable {
    void presta(Socio s);
    void devuelve(Socio s);
    boolean estaPrestado();
}
