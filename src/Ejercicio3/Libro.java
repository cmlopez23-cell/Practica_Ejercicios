/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
public class Libro {
    String titulo, autor, estado;
    int paginas;

    public Libro() {
    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = "Disponible";
        this.paginas = paginas;
    }
    
    public void prestar(){
        if(estado.equalsIgnoreCase("disponible")){
            estado = "prestado";
            System.out.println("Libro Prestado con exito");
        }else{
            System.out.println("Libro no disponible - Prestado u Extraviado");
        }
    }
    
    public void devolver(){
        if(estado.equalsIgnoreCase("prestado")){
            estado = "disponible";
            System.out.println("Libro devuelto con exito");
        }else if(estado.equalsIgnoreCase("extraviado")){
            System.out.println("Libro extraviado no se puede devolver");
        }else{
            System.out.println("Libro sin devolver");
        }
        
    }
    public void mostrarinfo(){
        System.out.println("------INFORMACION LIBROS-------");
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Estado: "+ estado);
        System.out.println("Paginas: "+ paginas);
    }
    
}
