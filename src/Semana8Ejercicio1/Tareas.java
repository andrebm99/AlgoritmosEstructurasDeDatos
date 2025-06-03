package Semana8Ejercicio1;

public class Tareas {
    private String task;
    private Tareas sig;

    // Insert final
    public Tareas(String task){
        this.task = task;
        this.sig = null;
    }

    // Insert ini

    public Tareas(String task, Tareas sig){
        this.task = task;
        this.sig = sig;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Tareas getSig() {
        return sig;
    }

    public void setSig(Tareas sig) {
        this.sig = sig;
    }
}
