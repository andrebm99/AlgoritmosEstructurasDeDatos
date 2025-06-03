package Semana7Ejercicio5;

public class ListaTareas {
    private Tareas inicio, fin;

    public ListaTareas() {
        this.inicio = null;
        this.fin = null;
    }
    
    public void agregarInicio(String urgentes){
        inicio = new Tareas(urgentes, inicio);
        if(fin == null){
            fin = inicio;
        }
    }
    
    public void agregarFinal(String urgentes){
        if(inicio == null){
            inicio = fin = new Tareas(urgentes);
        } else{
            fin.setNormales(new Tareas(urgentes));
            fin = fin.getNormales();
        }
    }
    
    public void mostrar(){
        Tareas tarea = inicio;
        while(tarea != null){
            System.out.print(tarea.getUrgentes()+"\n");
            tarea = tarea.getNormales();
        }
        System.out.println();
    }
}
