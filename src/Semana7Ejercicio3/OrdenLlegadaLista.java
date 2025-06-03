package Semana7Ejercicio3;

import Semana7Ejercicio2.Pacientes;

public class OrdenLlegadaLista {
    private Pacientes primero, ultimo;
    
    public OrdenLlegadaLista(){
        this.primero = null;
        this.ultimo = null;
    }
    
    public void insertarFinalOrden(String nombre){
        if(primero == null){
            primero = ultimo = new Pacientes(nombre);
            
        } else{
            ultimo.setOrden(new Pacientes(nombre));
            ultimo = ultimo.getOrden();
        }
    }
    // Mostrar
    
    public void mostrar(){
        Pacientes llegada = primero;
        while(llegada != null){
            System.out.print(llegada.getNombre() + "--> ");
            llegada = llegada.getOrden();
        }
        System.out.println();
    }
}
