
package Semana9Ejercicio4;


public class Carrito {
    private String producto;
    private Carrito siguiente;
    private Carrito anterior;
    
    // Inicio
    public Carrito(String producto, Carrito siguiente, Carrito anterior){
        this.producto = producto;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
    // fin
    
    public Carrito(String producto){
        this.producto = producto;
        this.siguiente = null;
        this.anterior = null;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Carrito getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Carrito siguiente) {
        this.siguiente = siguiente;
    }

    public Carrito getAnterior() {
        return anterior;
    }

    public void setAnterior(Carrito anterior) {
        this.anterior = anterior;
    }
    
    
    
    
}
