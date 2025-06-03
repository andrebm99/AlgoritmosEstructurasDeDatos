package Semana7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.insetarFinal(10);
        lista.insetarFinal(20);
        lista.insetarFinal(30);
        lista.insetarFinal(40);
        lista.insetarFinal(50);
        lista.agregarInicio(60);
        lista.insetarFinal(70);
        
        lista.mostrar();
    }
}
