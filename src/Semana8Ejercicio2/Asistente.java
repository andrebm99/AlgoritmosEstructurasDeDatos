package Semana8Ejercicio2;

public class Asistente {
    private String reunion;
    private Asistente siguente;

    public Asistente(String reunion){
        this.reunion=reunion;
        this.siguente=null;
    }

    public Asistente(String reunion, Asistente siguente){
        this.reunion=reunion;
        this.siguente=siguente;
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
}
