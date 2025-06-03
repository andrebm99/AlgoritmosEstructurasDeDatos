package Semana8Ejercicio4;

public class Gestor {
    private String documento;
    private Gestor siguiente;

    // Agregar al final
    public Gestor(String documento){
        this.documento = documento;
        this.siguiente = null;
    }



    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Gestor getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Gestor siguiente) {
        this.siguiente = siguiente;
    }
}
