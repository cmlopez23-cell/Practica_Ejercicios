/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
public class Vehiculo {
    //Atributos
    String marca, modelo, estado;
    int ano_fab;
    boolean matriculado;
    
    //Metodos

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String estado, int ano_fab) {
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.ano_fab = ano_fab;
        this.matriculado = false;
    }
    public void revisionVehicular(){
        if(ano_fab < 1996){
            estado = "Usado Malo";
        }else if(ano_fab < 2016){
             estado = "Usado Bueno";
        }else if(ano_fab < 2026 || (ano_fab < 2026 && estado.equalsIgnoreCase("nuevo"))){
            estado = "seminuevo";
        }else {
            estado = "nuevo";
        }
    }
    
    public void matricular(){
        if(!estado.equalsIgnoreCase("usado malo")){
            matriculado = true;
            System.out.println("Vehiculo Matriculado");
        }else{
            System.out.println("No se puede matricular el vehiculo");
        }
    }
    public void mostrarDatos(){
        System.out.println("--------DATOS DE MATRICULACION---------");
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Estado: "+ estado);
        System.out.println("Anio: "+ ano_fab);
        System.out.println("Matriculado: "+ (matriculado ? "Si": "No"));
        
    }
}
