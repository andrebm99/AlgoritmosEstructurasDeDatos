package Semana8Ejercicio6;

public class ListaEnlazada {
    private Emergencias inicio, fin;

    public ListaEnlazada() {
        this.inicio = null;
        this.fin = null;
    }

    public Emergencias getInicio() {
        return inicio;
    }

    public void setInicio(Emergencias inicio) {
        this.inicio = inicio;
    }

    public Emergencias getFin() {
        return fin;
    }

    public void setFin(Emergencias fin) {
        this.fin = fin;
    }

    // Insertar al inicio

    public void pacienteUrgente(String paciente){
        Emergencias nuevaAtencion = new Emergencias(paciente);
        if(inicio == null){
            inicio = fin = nuevaAtencion;
        } else{
            nuevaAtencion.setSiguiente(inicio);
            inicio.setAnterior(nuevaAtencion);
            inicio = nuevaAtencion;
        }
    }

    // Insertar al final

    public void pacienteNormal(String paciente){
        Emergencias nuevaAtencion = new Emergencias(paciente);
        if(inicio == null){
            inicio = fin = nuevaAtencion;
        } else{
            fin.setSiguiente(nuevaAtencion);
            nuevaAtencion.setAnterior(fin);
            fin = nuevaAtencion;
        }
    }

    // Insertar despues de

    public void moverDespuesDe(String valorBuscado, String atencionNueva){
        if(inicio == null){
            System.out.println("Lista vacia, no se puede insertar");
            return;
        }

        Emergencias actual = inicio;

        while(actual != null && !actual.getPaciente().equals(valorBuscado)){
            actual = actual.getSiguiente();
        }

        if (actual == null){
            System.out.println("No se encontró la reuncion con dato: " + valorBuscado);
            return;
        }

        Emergencias emergenciaNueva = new Emergencias(atencionNueva);

        if(actual.getSiguiente() == null){
            actual.setSiguiente(emergenciaNueva);
            emergenciaNueva.setAnterior(actual);
        } else{
            Emergencias original = actual.getSiguiente();

            actual.setSiguiente(emergenciaNueva);
            emergenciaNueva.setAnterior(actual);
            emergenciaNueva.setSiguiente(original);
            original.setAnterior(emergenciaNueva);
        }
    }

    // Insertar antes de
    public void moverAntesDe(String valorBuscado, String atencionNueva){
        if(inicio == null){
            System.out.println("Lista vacia, no se puede insertar");
            return;
        }

        Emergencias actual = inicio;

        while(actual != null && !actual.getPaciente().equals(valorBuscado)){
            actual = actual.getSiguiente();
        }

        if (actual == null){
            System.out.println("No se encontró la emergencia con dato: " + valorBuscado);
            return;
        }

        Emergencias emergenciaNueva = new Emergencias(atencionNueva);
        if(actual == inicio){
            emergenciaNueva.setSiguiente(inicio);
            inicio.setAnterior(emergenciaNueva);
            inicio = emergenciaNueva;
        } else{
            Emergencias anterior = actual.getAnterior();
            anterior.setSiguiente(emergenciaNueva);
            emergenciaNueva.setAnterior(anterior);
            emergenciaNueva.setSiguiente(actual);
            actual.setAnterior(emergenciaNueva);
        }
    }

    // Eliminar al inicio

    public void eliminarInicio(){
        if(inicio == null){
            System.out.println("La lista está vacía.");
            return;
        }
        if(inicio == fin){

            inicio = fin = null;
        } else{
            inicio = inicio.getSiguiente();
            inicio.setAnterior(null);

        }

        System.out.println("Paciente ya atendido eliminado al inicio.");



    }

    // Eliminar al final

    public void eliminarFin(){
        if(fin == null){
            System.out.println("La lista está vacía.");
            return;
        }
        if(inicio == fin){

            inicio = fin = null;
        } else{
            fin = fin.getAnterior();
            fin.setAnterior(null);

        }
        System.out.println("Paciente ya atendido eliminado al final.");
    }

    // Ordenar por nombre

    public void ordenarAlfabeticamente(){
        if(inicio == null){
            return;
        }
        boolean intercambio;
        Emergencias actual;
        Emergencias previo = null;

        do{
            intercambio = false;
            actual = inicio;

            while(actual.getSiguiente() != previo){
                Emergencias eme = actual.getSiguiente();

                if(actual.getPaciente().compareToIgnoreCase(eme.getPaciente()) > 0){
                    String temp = actual.getPaciente();
                    actual.setPaciente(eme.getPaciente());
                    eme.setPaciente(temp);
                    intercambio = true;
                }
                actual = actual.getSiguiente();
            }
            previo = actual;
        } while(intercambio);
    }

    // Mostrar

    public void mostrar(){
        Emergencias elemento = inicio;
        while(elemento != null){
            System.out.println("> " + elemento.getPaciente());
            elemento = elemento.getSiguiente();
        }
    }

}
