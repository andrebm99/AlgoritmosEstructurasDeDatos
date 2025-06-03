package Semana8Ejercicio2;

public class ListaEnlazadaAsistente {
    private Asistente antes, despues;

    public ListaEnlazadaAsistente(){
        this.antes = null;
        this.despues = null;
    }

    public Asistente getAntes() {
        return antes;
    }

    public void setAntes(Asistente antes) {
        this.antes = antes;
    }

    public Asistente getDespues() {
        return despues;
    }

    public void setDespues(Asistente despues) {
        this.despues = despues;
    }

    // Insertar inicio

    public void insertarInicio(String reunion){
        Asistente nuevo = new Asistente(reunion, antes);

        antes = nuevo;

    }

    // Insertar al final

    public void insertarFinal(String reunion){

        Asistente nuevo = new Asistente(reunion);

        if(antes == null){
            antes = nuevo;
            return;
        }
        Asistente actual = antes;
        while(actual.getSiguente() != null){
            actual = actual.getSiguente();
        }

        actual.setSiguente(nuevo);
    }

    public void insertarAntesDe(String valorBuscado, String nuevaReunion){
        if(antes == null){
            System.out.println("Lista vacia, no se puede insertar despues de '" + valorBuscado + " '.");
            return;
        }

        if(antes.getReunion().equals(valorBuscado)){
            Asistente nuevo = new Asistente(nuevaReunion, antes);
            antes = nuevo;
            return;
        }

        Asistente prev = antes;
        Asistente actual = antes.getSiguente();

        while(actual != null && !actual.getReunion().equals(valorBuscado)){
            prev = actual;
            actual = actual.getSiguente();
        }
        if(actual == null){
            System.out.println("No se encontró la reunion: '" + valorBuscado + "' ");
            return;
        }

        Asistente nuevoNodo = new Asistente(nuevaReunion);
        prev.setSiguente(nuevoNodo);
        actual.setSiguente(actual);

    }


    public void insertarDespuesDe(String valorBuscado, String nuevaReunion){
        if(antes == null){
            System.out.println("Lista vacia, no se puede insertar despues de '" + valorBuscado + " '.");
            return;
        }

        Asistente actual = antes;

        while(actual != null && !actual.getReunion().equals(valorBuscado)){
            actual = actual.getSiguente();
        }
        if(actual == null){
            System.out.println("No se encontró la reunion: '" + valorBuscado + "' ");
            return;
        }

        Asistente nuevoNodo = new Asistente(nuevaReunion);
        nuevoNodo.setSiguente(actual.getSiguente());
        actual.setSiguente(nuevoNodo);

    }




    // Mostrar

    public void mostrar(){
        if(antes == null){
            System.out.println("La lsita está vacia.");
            return;
        }
        Asistente actual = antes;
        while(actual != null){
            System.out.println(actual.getReunion());
            actual = actual.getSiguente();
        }
    }

}
