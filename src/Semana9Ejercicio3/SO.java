/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana9Ejercicio3;


/**
 *
 * @author LAB-USR-LCENTRO
 */
public class SO {
    private String tarea;
    private SO siguiente;
    private SO anterior;
    
    // Final
    public SO(String tarea){
        this.tarea = tarea;
        this.siguiente = null;
        this.anterior = null;
    }
    
    // Inicio
    public SO(String tarea, SO siguiente, SO anterior){
        this.tarea = tarea;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public SO getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(SO siguiente) {
        this.siguiente = siguiente;
    }

    public SO getAnterior() {
        return anterior;
    }

    public void setAnterior(SO anterior) {
        this.anterior = anterior;
    }
    
    
}
