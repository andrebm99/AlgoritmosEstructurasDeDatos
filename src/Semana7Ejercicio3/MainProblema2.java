/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana7Ejercicio3;

import Semana7Ejercicio2.OrdenLlegadaLista;

/**
 *
 * @author Administrador
 */
public class MainProblema2 {

    public static void main(String[] args) {
        OrdenLlegadaLista ordenLlegada = new OrdenLlegadaLista();
        ordenLlegada.insertarFinalOrden("Ana");
        ordenLlegada.insertarFinalOrden("Luis");
        ordenLlegada.insertarFinalOrden("Carlos");
        ordenLlegada.insertarFinalOrden("Mery");
        ordenLlegada.insertarFinalOrden("Mila");
        ordenLlegada.insertarFinalOrden("Andre");
        
        ordenLlegada.mostrar();
        
    }
    
}
