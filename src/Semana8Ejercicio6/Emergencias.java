package Semana8Ejercicio6;

public class Emergencias {
    private String paciente;
    private Emergencias siguiente;

    // Insertar al inicio


    public Emergencias(String paciente, Emergencias siguiente) {
        this.paciente = paciente;
        this.siguiente = siguiente;

    }

    // Insertar al final

    public Emergencias(String paciente){
        this.paciente = paciente;
        this.siguiente = null;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public Emergencias getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Emergencias siguiente) {
        this.siguiente = siguiente;
    }
}
