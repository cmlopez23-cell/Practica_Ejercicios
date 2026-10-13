/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op,n;
        Empleado empleados[] = null;
        
        System.out.print("Ingrese el numero de empleados a registar: ");
        n = sc.nextInt();
        sc.nextLine();
        
        do{
            System.out.println("--------MENU EMPLEADOS---------");
            System.out.println("1) Registrar Emplado");
            System.out.println("2) Calcular Salario Empleado");
            System.out.println("3) Mostrar Datos Empleado");
            System.out.println("4) Salir");
            System.out.println("Ingrese una de las opciones: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1: 
                    empleados = new Empleado[n];
                    for (int i = 0; i < n; i++) {
                        
                        System.out.println("DATOS EMPLEADO N_"+ (i+1));
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Horas Extras: ");
                        int horas_e = sc.nextInt();
                        sc.nextLine();
                        
                        empleados[i] = new Empleado(nombre, horas_e);
                    }break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        empleados[i].calcularSalarioTotal();
                    }break;
                case 3:
                    for (int i = 0; i < n; i++) {
                        empleados[i].mostrarDatos();
                    }break;
                case 4: 
                    break;
                default: 
                    System.out.println("OPCION INGRESADA NO VALIDA");break;
            }
            
            
        }while(op != 5);
        sc.close();
    }
    
}
