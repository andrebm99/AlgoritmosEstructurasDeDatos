/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana7Ejercicio5;

/**
 *
 * @author andre
 */
public class Main {
    public static void main(String[] args) {
        ListaTareas tarea = new ListaTareas();
        tarea.agregarInicio("RevisarServidor");
        tarea.agregarInicio("Resolver error producción");
        tarea.agregarFinal("Enviar correo al cliente");
        tarea.agregarFinal("Actualizar documentación");
        
        tarea.mostrar();
        
    }
}
