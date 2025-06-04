package Semana8Ejercicio2;

public class ListaEnlazadaAsistente {
    private Asistente inicio, fin;

    public ListaEnlazadaAsistente(){
        this.inicio = null;
        this.fin = null;
    }

    public Asistente getInicio() {
        return inicio;
    }

    public void setInicio(Asistente inicio) {
        this.inicio = inicio;
    }

    public Asistente getFin() {
        return fin;
    }

    public void setFin(Asistente fin) {
        this.fin = fin;
    }

    // Insertar inicio

    public void insertarInicio(String reunion){
        Asistente nuevoAsistente = new Asistente(reunion);
         if(inicio == null){
             inicio = fin = nuevoAsistente;
         } else{
             nuevoAsistente.setSiguente(inicio);
             inicio.setAnterior(nuevoAsistente);
             inicio = nuevoAsistente;
         }
    }

    public void insertarAntesDe(String valorBuscado, String nuevaReunion){
        if(inicio == null){
            System.out.println("Lista vacia, no se puede insertar");
            return;
        }

        Asistente actual = inicio;

        while(actual != null && !actual.getReunion().equals(valorBuscado)){
            actual = actual.getSiguente();
        }

        if (actual == null){
            System.out.println("No se encontró la reuncion con dato: " + valorBuscado);
            return;
        }

        Asistente nuevoAsistente = new Asistente(nuevaReunion);
        if(actual == inicio){
            nuevoAsistente.setSiguente(inicio);
            inicio.setAnterior(nuevoAsistente);
            inicio = nuevoAsistente;
        } else{
            Asistente anterior = actual.getAnterior();
            anterior.setSiguente(nuevoAsistente);
            nuevoAsistente.setAnterior(anterior);
            nuevoAsistente.setSiguente(actual);
            actual.setAnterior(nuevoAsistente);
        }
    }

    // Insertar despues de

    public void insertarDespuseDe(String valorBuscado, String nuevaReunion){
        if(inicio == null){
            System.out.println("Lista vacia, no se puede insertar");
            return;
        }

        Asistente actual = inicio;

        while(actual != null && !actual.getReunion().equals(valorBuscado)){
            actual = actual.getSiguente();
        }

        if (actual == null){
            System.out.println("No se encontró la reuncion con dato: " + valorBuscado);
            return;
        }

        Asistente nuevoAsistente = new Asistente(nuevaReunion);

        if(actual.getSiguente() == null){
            actual.setSiguente(nuevoAsistente);
            nuevoAsistente.setAnterior(actual);
        } else{
            Asistente siguienteOriginal = actual.getSiguente();

            actual.setSiguente(nuevoAsistente);
            nuevoAsistente.setAnterior(actual);
            nuevoAsistente.setSiguente(siguienteOriginal    );
            siguienteOriginal.setAnterior(nuevoAsistente);
        }
    }


    // Mostrar

    public void mostrar(){
        Asistente elemento = inicio;
        while(elemento != null){
            System.out.println("> " + elemento.getReunion());
            elemento = elemento.getSiguente();
        }
    }

}
