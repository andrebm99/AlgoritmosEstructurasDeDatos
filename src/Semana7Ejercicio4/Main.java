/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana7Ejercicio4;

/**
 *
 * @author Administrador
 */
public class Main {
    public static void main(String[] args) {
        ColaCanciones cola = new ColaCanciones();
        cola.insetarFinal("CancionA");
        cola.insetarFinal("CancionB");
        cola.insetarFinal("CancionC");
        cola.insetarFinal("CancionD");
        
        cola.mostrar();
    }
   
    
    
}
