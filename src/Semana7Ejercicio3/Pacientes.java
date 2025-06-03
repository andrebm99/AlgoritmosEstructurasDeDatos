package Semana7Ejercicio3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Pacientes {
    private String nombre;
    private Pacientes orden;

    // Insertar al final
    
    public Pacientes(String nombre){
        this.nombre = nombre;
        this.orden = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pacientes getOrden() {
        return orden;
    }

    public void setOrden(Pacientes orden) {
        this.orden = orden;
    }
    
    
}
