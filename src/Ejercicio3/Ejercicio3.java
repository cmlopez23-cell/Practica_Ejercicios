/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op,n;
        Libro libros[] = null;
        
        System.out.print("Ingrese el numero de libros a registar: ");
        n = sc.nextInt();
        sc.nextLine();
        
        do{
            System.out.println("--------LIBRERIA ESPE---------");
            System.out.println("1) Registrar Libros");
            System.out.println("2) Prestar Libro");
            System.out.println("3) Devolver Libro");
            System.out.println("4) Mostrar Estado del Libro");
            System.out.println("5) Salir");
            System.out.println("Ingrese una de las opciones: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1: 
                    libros = new Libro[n];
                    for (int i = 0; i < n; i++) {
                        
                        System.out.println("DATOS LIBRO N_"+ (i+1));
                        System.out.print("Titulo: ");
                        String titulo = sc.nextLine();
                        System.out.print("Autor: ");
                        String autor = sc.nextLine();
                        System.out.print("Paginas: ");
                        int paginas = sc.nextInt();
                        sc.nextLine();
                        
                        libros[i] = new Libro(titulo, autor, paginas);
                    }break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        libros[i].prestar();
                    }break;
                case 3:
                    for (int i = 0; i < n; i++) {
                        libros[i].devolver();
                    }break;
                case 4:
                    for (int i = 0; i < n; i++) {
                        libros[i].mostrarinfo();
                    }break;
                case 5: 
                    break;
                default: 
                    System.out.println("OPCION INGRESADA NO VALIDA");break;
            }
            
            
        }while(op != 5);
    }
    
}
