package Semana7;

public class ListaEnlazada {
    private Nodo inicio, fin;
    
    // Constructor
    public ListaEnlazada(){
        this.inicio = null;
        this.fin = null;
    }
    
    //Insertar nodos al final de la lista
    public void insetarFinal(int dato){
        if(inicio == null){
            inicio = fin = new Nodo(dato);
        } else{
            fin.setSiguiente(new Nodo(dato));
            fin = fin.getSiguiente();
        }
    }
    
    // Insertar nodos al inicio de la lista
    
    public void agregarInicio(int dato){
        inicio = new Nodo(dato, inicio);
        if(fin == null){
            fin = inicio;
        }
    }
    // Mostrar los elementos de la lista
    
    public void mostrar(){
        Nodo elemento = inicio;
        while(elemento != null){
            System.out.print(elemento.getDato() + "--> ");
            elemento = elemento.getSiguiente();
            
        }
    }
}
