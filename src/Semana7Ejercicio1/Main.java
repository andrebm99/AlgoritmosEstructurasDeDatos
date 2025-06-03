/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana7Ejercicio1;

/**
 *
 * @author Administrador
 */
public class Main {
    public static void main(String[] args) {
        ListasEnlazadasProblema1 llamadas = new ListasEnlazadasProblema1();
        llamadas.agregarInicio(987654321);
        llamadas.agregarInicio(912345678);
        llamadas.agregarInicio(923456789);
        llamadas.agregarInicio(953456589);
        llamadas.agregarInicio(903466739);
        
        System.out.println("Lista completa: ");
        llamadas.mostrar();
    }
}
