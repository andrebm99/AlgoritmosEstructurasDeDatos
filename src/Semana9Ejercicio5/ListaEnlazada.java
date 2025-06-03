package Semana9Ejercicio5;

public class ListaEnlazada {
    private Editor inicio, fin;

    public ListaEnlazada(){
        this.inicio = null;
        this.fin = null;
    }

    public Editor getInicio() {
        return inicio;
    }

    public void setInicio(Editor inicio) {
        this.inicio = inicio;
    }

    public Editor getFin() {
        return fin;
    }

    public void setFin(Editor fin) {
        this.fin = fin;
    }

    public void insertFinal(String acciones){
        Editor accionNueva = new Editor(acciones);

        if(fin == null){
            inicio = fin = accionNueva;
        } else{
            fin.setSiguiente(accionNueva);
            accionNueva.setAnterior(fin);
            fin = accionNueva;
        }
    }

    //Recorrer hacia adelante para rehacer
    public void rehacer(){
        Editor historial = inicio;
        while(historial != null){
            System.out.println("> " + historial.getAcciones());
            historial = historial.getSiguiente();
        }
    }

    // Recorrer hacia atrás para deshacer.

    public void deshacer(){
        Editor historial = fin;
        while(historial != null){
            System.out.println("> " + historial.getAcciones() );
            historial = historial.getAnterior();
        }
    }

    // Eliminar

    public void eliminar(){
        if(inicio == null){
            System.out.println("Las acciones están vacias");
            return;
        }

        if(inicio == fin){
            inicio = fin = null;
        } else{
            inicio = inicio.getSiguiente();
            inicio.setAnterior(null);
        }

        System.out.println("Accion eliminada.");
    }




}
