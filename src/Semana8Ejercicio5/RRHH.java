package Semana8Ejercicio5;

public class RRHH {
    private String nombres;
    private RRHH siguiente;

    // Insertar al inicio
    public RRHH(String nombres, RRHH siguiente) {
        this.nombres = nombres;
        this.siguiente = siguiente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public RRHH getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(RRHH siguiente) {
        this.siguiente = siguiente;
    }
}
