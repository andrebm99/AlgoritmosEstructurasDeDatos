package Semana8Ejercicio6;

import Semana7Ejercicio2.Pacientes;

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

    public void urgentes(String paciente){
        inicio = new Emergencias(paciente, inicio);
        if(fin == null){
            fin = inicio;
        }
    }

    public void normales(String paciente){
        if(inicio == null){
            inicio = fin = new Emergencias(paciente);
        } else{
            fin.setSiguiente(new Emergencias(paciente));
            fin = fin.getSiguiente();
        }
    }

    public void mostrar(){
        Emergencias elemento = inicio;
        while(elemento != null ){
            System.out.println("> " + elemento.getPaciente());
            elemento = elemento.getSiguiente();
        }
    }
}
