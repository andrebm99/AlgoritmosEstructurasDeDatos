package Semana7;


public class Nodo {
    private int dato; 
    private Nodo siguiente; 

    // Insertar al inicio de la lista
    public Nodo(int dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    //Insertar al final
    
    public Nodo(int dato){
        this.dato = dato; 
        this.siguiente = null;
        
    }
    
        
    // getter setters

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
