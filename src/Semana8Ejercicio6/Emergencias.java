package Semana8Ejercicio6;

public class Emergencias {
    private String paciente;
    private Emergencias siguiente;
    private Emergencias anterior;

    // Insertar al inicio


    public Emergencias(String paciente, Emergencias siguiente, Emergencias anterior) {
        this.paciente = paciente;
        this.siguiente = siguiente;
        this.anterior = anterior;

    }

    // Insertar al final

    public Emergencias(String paciente){
        this.paciente = paciente;
        this.siguiente = null;
        this.anterior = null;
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

    public Emergencias getAnterior() {
        return anterior;
    }

    public void setAnterior(Emergencias anterior) {
        this.anterior = anterior;
    }
}
