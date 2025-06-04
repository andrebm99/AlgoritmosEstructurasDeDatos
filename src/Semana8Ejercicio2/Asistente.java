package Semana8Ejercicio2;

public class Asistente {
    private String reunion;
    private Asistente siguente;
    private Asistente anterior;


    public Asistente(String reunion) {
        this.reunion = reunion;
        this.anterior = null;
        this.siguente = null;
    }

    public Asistente(String reunion, Asistente siguente, Asistente anterior){
        this.reunion=reunion;
        this.siguente=siguente;
        this.anterior = anterior;
    }

    public String getReunion() {
        return reunion;
    }

    public void setReunion(String reunion) {
        this.reunion = reunion;
    }

    public Asistente getSiguente() {
        return siguente;
    }

    public void setSiguente(Asistente siguente) {
        this.siguente = siguente;
    }

    public Asistente getAnterior() {
        return anterior;
    }

    public void setAnterior(Asistente anterior) {
        this.anterior = anterior;
    }
}
