/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana9Ejercicio1;

/**
 *
 * @author LAB-USR-LCENTRO
 */
public class Main {
    public static void main(String[] args) {
        ListaEnlazadaDoble lista = new ListaEnlazadaDoble();
        
        
        lista.insertFinal("google.com");
        lista.insertFinal("HackTheBox.com");
        lista.insertFinal("Ubuntu.com");
        lista.insertFinal("javascript.com");
        lista.insertFinal("facebook.com");
        
        System.out.println("Imprimir hacia adelante");
        lista.imprimirAdelante();
        System.out.println("Imprimir hacia el final");
        lista.imprimirFinal();
        
        lista.eliminarInicio();
        lista.imprimirAdelante();
    }
}
