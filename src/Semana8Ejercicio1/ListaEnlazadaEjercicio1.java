package Semana8Ejercicio1;

public class ListaEnlazadaEjercicio1 {
    private Tareas inicio, fin;

    public ListaEnlazadaEjercicio1() {
        this.inicio = null;
        this.fin = null;
    }

    public Tareas getInicio() {
        return inicio;
    }

    public void setInicio(Tareas inicio) {
        this.inicio = inicio;
    }

    public Tareas getFin() {
        return fin;
    }

    public void setFin(Tareas fin) {
        this.fin = fin;
    }

    // Agregar al inicio

    public void inicioUrgentes(String tareas){
        inicio = new Tareas(tareas, inicio);
        if(fin == null){
            fin = inicio;
        }
    }

    public void finalRegulares(String tareas){
        if(inicio == null){
            inicio = fin = new Tareas(tareas);
        } else{
            fin.setSig(new Tareas(tareas));
            fin = fin.getSig();
        }
    }

    public void mostrar(){
        Tareas elemento = inicio;
        while(elemento != null){
            System.out.println("> " + elemento.getTask());
            elemento = elemento.getSig();
        }

    }
}
