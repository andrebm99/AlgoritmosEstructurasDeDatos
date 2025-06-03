package Semana8Ejercicio5;

public class ListaEnlazada {
    private RRHH inicio, fin;

    public ListaEnlazada() {
        this.inicio = null;
        this.fin = null;

    }

    public RRHH getInicio() {
        return inicio;
    }

    public void setInicio(RRHH inicio) {
        this.inicio = inicio;
    }

    public RRHH getFin() {
        return fin;
    }

    public void setFin(RRHH fin) {
        this.fin = fin;
    }

    public void agregarInicio(String nombres){
        inicio = new RRHH(nombres, inicio);
        if(fin == null){
            fin = inicio;
        }
    }

    public void ordenarAlfabeticamente(){
        if(inicio == null){
            return;
        }
        boolean intercambio;
        RRHH actual;
        RRHH previo = null;

        do{
            intercambio = false;
            actual = inicio;

            while(actual.getSiguiente() != previo){
                RRHH siguiente = actual.getSiguiente();

                if(actual.getNombres().compareToIgnoreCase(siguiente.getNombres()) > 0){
                    String temp = actual.getNombres();
                    actual.setNombres(siguiente.getNombres());
                    siguiente.setNombres(temp);
                    intercambio = true;
                }
                actual = actual.getSiguiente();
            }
            previo = actual;
        } while(intercambio);
    }

    public void mostrar(){
        RRHH actual = inicio;
        while(actual != null){
            System.out.println("> " + actual.getNombres());
            actual = actual.getSiguiente();
        }
    }
}
