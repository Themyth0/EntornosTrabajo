/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecaed;

import java.util.ArrayList;

/**
 *
 * @author Alejandro Ramirez Nieves
 */
public class BibliotecaED {
    
    public static void main(String[] args) {
        ArrayList<Publicacion> publicaciones = new ArrayList<>();
        ArrayList<Socio> socios = new ArrayList<>();
        
        CD c1= new CD("VOYAGE", 2020, "20102",60,"ABBA",20);
        CD c2= new CD("POWER UP", 2006, "49092",45,"AC/DC",15);
        
        Revista r1= new Revista("HOLA",2026,"10210",20,12340);
        Revista r2= new Revista("MARCA",2022,"30810",15,19083);
        
        
        Libro l1= new Libro("MURDOKU",2026,"56789",98,"MANUEL GARAND");
        Libro l2= new Libro("LAS 48 LEYES DEL PODER",2012,"35629",550,"ROBERT GRENEE");
        
        Pelicula p1= new Pelicula("Interstellar",2014,"10923",102,"Christopher Nolan");
        Pelicula p2= new Pelicula("Los intocables de Elliot ness",1987,"29943",96,"Brian De Palma");
        
        Socio s1= new Socio("31783351H","ROBERTO");
        Socio s2= new Socio("41393321L","ALEJANDRO");

        
        publicaciones.add(c1);
        publicaciones.add(c2);
        publicaciones.add(r1);
        publicaciones.add(r2);
        publicaciones.add(l1);
        publicaciones.add(l2);
        publicaciones.add(p1);
        publicaciones.add(p2);
        
        socios.add(s1);
        socios.add(s2);
        
        
        for (Publicacion p : publicaciones){
            System.out.println(p.datos());
            System.out.println("");
        }




    }
    
}
