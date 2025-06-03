/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana7Ejercicio5;

/**
 *
 * @author andre
 */
public class Tareas {
    private String urgentes;
    private Tareas normales;
    
    
    // Inicio de la lista

    public Tareas(String urgentes, Tareas normales) {
        this.urgentes = urgentes;
        this.normales = normales;
    }
    
    // Insertar al final
    
    public Tareas(String urgentes){
        this.urgentes = urgentes;
        this.normales = null;
    }

    public String getUrgentes() {
        return urgentes;
    }

    public void setUrgentes(String urgentes) {
        this.urgentes = urgentes;
    }

    public Tareas getNormales() {
        return normales;
    }

    public void setNormales(Tareas normales) {
        this.normales = normales;
    }
    
    
    
}
