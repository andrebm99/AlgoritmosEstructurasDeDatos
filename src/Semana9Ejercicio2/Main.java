/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana9Ejercicio2;

/**
 *
 * @author LAB-USR-LCENTRO
 */
public class Main {
    public static void main(String[] args) {
        ListaEnlazada playList = new ListaEnlazada();
        playList.agregarFinal("Bullet for my Valentine: Hand of Blood");
        playList.agregarFinal("Bullet for my Valentine: Tears Don't Fall");
        
        playList.agregarInicio("Metallica - nothing else matters");
        playList.agregarInicio("AC / DC: highway to hell");
        
        playList.printFinal();
        
    }
}
