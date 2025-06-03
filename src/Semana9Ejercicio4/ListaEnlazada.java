package Semana9Ejercicio4;

public class ListaEnlazada {
    private Carrito inicio, fin;
    
    public ListaEnlazada(){
        this.inicio = null;
        this.fin = null;
    }

    public Carrito getInicio() {
        return inicio;
    }

    public void setInicio(Carrito inicio) {
        this.inicio = inicio;
    }

    public Carrito getFin() {
        return fin;
    }

    public void setFin(Carrito fin) {
        this.fin = fin;
    }
    
    public void insertFinal(String producto){
        Carrito nuevoProducto = new Carrito(producto);
        if(fin == null){
            inicio = fin = nuevoProducto;
        } else{
            fin.setSiguiente(nuevoProducto);
            nuevoProducto.setAnterior(fin);
            fin = nuevoProducto;
        }
    }
    
    // Imprimir hacia adelante
    
    public void rehacer(){
        Carrito compra = inicio;
        while( compra != null){
            System.out.println("> " + compra.getProducto());
            compra = compra.getSiguiente();
        }
    }
    
    public void deshacer(){
        Carrito compra = fin;
        while(compra != null){
            System.out.println("> " + compra.getProducto());
            compra = compra.getAnterior();
        }
    }
    
    public void eliminarProducto(){
        if(inicio == null){
            System.out.println("El carrito está vacio");
            return;
        }
        if(inicio == fin){
            inicio = fin = null;
        } else{
            inicio = inicio.getSiguiente();
            inicio.setAnterior(null);
        }
        
        System.out.println("Producto inicial eliminado");
    }
    
}
