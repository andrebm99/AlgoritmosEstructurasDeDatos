package Semana9Ejercicio5;

public class Editor {
    private String acciones;
    private Editor siguiente;
    private Editor anterior;

    public Editor(String acciones){
        this.acciones = acciones;
        this.siguiente = null;
        this.anterior = null;
    }

    public String getAcciones() {
        return acciones;
    }

    public void setAcciones(String acciones) {
        this.acciones = acciones;
    }

    public Editor getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Editor siguiente) {
        this.siguiente = siguiente;
    }

    public Editor getAnterior() {
        return anterior;
    }

    public void setAnterior(Editor anterior) {
        this.anterior = anterior;
    }
}
