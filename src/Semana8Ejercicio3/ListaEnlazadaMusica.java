package Semana8Ejercicio3;

public class ListaEnlazadaMusica {
    private Musica inicio, fin;

    public ListaEnlazadaMusica() {
        this.inicio = null;
        this.fin = null;
    }

    public Musica getInicio() {
        return inicio;
    }

    public void setInicio(Musica inicio) {
        this.inicio = inicio;
    }

    public Musica getFin() {
        return fin;
    }

    public void setFin(Musica fin) {
        this.fin = fin;
    }

    public void insertInicio(String cancion){
        inicio = new Musica(cancion, inicio);
        if(fin == null){
            fin = inicio;
        }
    }

    public void insertFin(String cancion){
        if(inicio == null){
            inicio = fin = new Musica(cancion);
        } else{
            fin.setSiguiente(new Musica(cancion));
            fin = fin.getSiguiente();
        }
    }
    // Mostrar
    public void mostrar(){
        Musica rola = inicio;
        while(rola!=null){
            System.out.print(" " + rola.getCancion() + " --> ");
            rola = rola.getSiguiente();
        }
        System.out.println("");
    }
    // Eliminar al inicio
    public void eliminarInicio(){
        Musica temporal = inicio;
        String x = temporal.getCancion();

        if(inicio == fin){
            inicio = null;
            fin = null;
        } else{
            inicio = temporal.getSiguiente();
            System.out.println("Se eliminó el elemento: " + x);
        }
    }

    // Eliminar al final
    public void eliminarFinal(){
        Musica temporal = fin;
        String x = temporal.getCancion();

        if(inicio == fin){
            inicio = null;
            fin = null;
        } else{
            Musica xinicio = inicio;
            while(xinicio.getSiguiente() != fin){
                xinicio = xinicio.getSiguiente();
            }
            fin = xinicio;
            fin.setSiguiente(null);
            System.out.println("Se eliminó el elemento: " + x);
        }
    }
}
