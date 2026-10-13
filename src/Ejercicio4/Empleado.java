/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author HP
 */
public class Empleado {
    String nombre;
    double salarioBase = 460, salario_total;
    int horas_e;
    

    public Empleado() {
    }

    public Empleado(String nombre, int horas_e) {
        this.nombre = nombre;
        this.horas_e = horas_e;
    }
    
    public void calcularSalarioTotal(){
        if(horas_e > 0){
            salario_total = salarioBase + (10 * horas_e);
            System.out.println("El Empleado "+ nombre + " con "+ horas_e + "horas extras tiene un salario total de "+ salario_total +"$");
        }else{
            System.out.println("El Empleado "+ nombre + "con horas extras "+ horas_e + "tiene un salario total de "+ salario_total +"$");
        }
        
    }
    public void mostrarDatos(){
        System.out.println("------INFORMACION EMPLEADO-------");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Salario Base: "+ salarioBase + "$");
        System.out.println("Horas Extras: "+ horas_e);
        System.out.println("Salario Total: "+ salario_total+"$");
    }
}
