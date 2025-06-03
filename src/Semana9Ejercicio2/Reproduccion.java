/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana9Ejercicio2;

/**
 *
 * @author LAB-USR-LCENTRO
 */
public class Reproduccion {
    private String nombre;
    private Reproduccion siguiente;
    private Reproduccion anterior;
    
    // Final
    public Reproduccion(String nombre){
        this.nombre = nombre;
        this.siguiente = null;
        this.anterior = null;
    }
    
    // Inicio
    public Reproduccion(String nombre, Reproduccion siguiente, Reproduccion anterior){
        this.nombre = nombre;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Reproduccion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Reproduccion siguiente) {
        this.siguiente = siguiente;
    }

    public Reproduccion getAnterior() {
        return anterior;
    }

    public void setAnterior(Reproduccion anterior) {
        this.anterior = anterior;
    }
    
    
    
}
