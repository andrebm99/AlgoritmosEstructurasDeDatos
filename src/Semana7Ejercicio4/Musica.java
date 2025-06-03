/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana7Ejercicio4;



/**
 *
 * @author Administrador
 */
public class Musica {
    private String cancion;
    private Musica cola;

    // Insertar al final
    public Musica(String cancion){
        this.cancion = cancion; 
        this.cola = null;
        
    }
    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public Musica getCola() {
        return cola;
    }

    public void setCola(Musica cola) {
        this.cola = cola;
    }
    
    
    
}
