package Semana8Ejercicio3;

public class Musica {
    private String cancion;
    private Musica siguiente;

    // Insertar al final

    public Musica(String cancion){
        this.cancion=cancion;
        this.siguiente = null;
    }

    // Insertar al inicio
    public Musica(String cancion, Musica siguiente) {
        this.cancion = cancion;
        this.siguiente = siguiente;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public Musica getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Musica siguiente) {
        this.siguiente = siguiente;
    }
}
