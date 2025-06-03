package Semana8Ejercicio4;

public class ListaEnlazadaDoc {
    private Gestor antes, despues;

    public ListaEnlazadaDoc(){
        this.antes = null;
        this.despues = null;
    }

    public Gestor getAntes() {
        return antes;
    }

    public void setAntes(Gestor antes) {
        this.antes = antes;
    }

    public Gestor getDespues() {
        return despues;
    }

    public void setDespues(Gestor despues) {
        this.despues = despues;
    }

    public void agregarFinal(String documento){
        if(antes == null){
            antes = despues = new Gestor(documento);

        } else{
            despues.setSiguiente(new Gestor(documento));
            despues = despues.getSiguiente();
        }
    }

    public void mostrar(){
        Gestor elemento = antes;

        while(elemento != null){
            System.out.println("> " + elemento.getDocumento());
            elemento = elemento.getSiguiente();
        }
    }
    public void eliminarAntesDe(String documento) {
        if(antes == null || antes.getDocumento().equals(documento)){
            return;
        }

        Gestor anterior = null;
        Gestor actual = antes;
        Gestor siguiente = antes.getSiguiente();

        while(siguiente != null && !siguiente.getDocumento().equals(documento)){
            anterior = actual;
            actual = siguiente;
            siguiente = siguiente.getSiguiente();
        }

        if(siguiente != null){
            if(anterior == null){
                antes = siguiente;
            } else{
                anterior.setSiguiente(siguiente);
            }
        }
    }

    public void eliminarDespuesDe(String documento){
        Gestor actual = antes;
        while(actual != null && !actual.getDocumento().equals(documento)){
            actual = actual.getSiguiente();
        }

        if(actual != null && actual.getSiguiente() != null){
            Gestor aEliminar = actual.getSiguiente();
            actual.setSiguiente(aEliminar.getSiguiente());
            if(aEliminar == despues){
                despues = actual;
            }
        }
    }

}
