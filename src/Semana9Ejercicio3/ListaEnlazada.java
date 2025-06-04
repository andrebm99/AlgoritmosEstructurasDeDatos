/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana9Ejercicio3;

import Semana8Ejercicio5.RRHH;
import Semana9Ejercicio2.Reproduccion;

/**
 *
 * @author LAB-USR-LCENTRO
 */
public class ListaEnlazada {
    private SO inicio, fin;

    public ListaEnlazada() {
        this.inicio = null;
        this.fin = null;
    }

    public SO getInicio() {
        return inicio;
    }

    public void setInicio(SO inicio) {
        this.inicio = inicio;
    }

    public SO getFin() {
        return fin;
    }

    public void setFin(SO fin) {
        this.fin = fin;
    }
    
    // Insert tareas urgentes
    
    public void tareaUrgente(String tarea){
        SO nuevaTarea = new SO(tarea);
        
        if(inicio == null){
            inicio = fin = nuevaTarea;
        } else{
            nuevaTarea.setSiguiente(inicio);
            inicio.setAnterior(nuevaTarea);
            inicio = nuevaTarea;
        }
    }

    // Insert tareas rutinarias
    public void tareaRutinaria(String tarea){
        SO nuevaTarea = new SO(tarea);
        
        if(fin == null){
            inicio = fin = nuevaTarea;
        } else{
            fin.setSiguiente(nuevaTarea);
            nuevaTarea.setAnterior(fin);
            fin = nuevaTarea;
        }
    }

    public void eliminar(String x) {
        if (inicio == null) {
            System.out.println("La lista está vacía, no se puede eliminar la tarea: " + x);
            return;
        }

        if (inicio == fin && inicio.getTarea().equals(x)) {
            System.out.println("Se eliminó la única tarea: " + inicio.getTarea());
            inicio = null;
            fin = null;
            return;
        }

        if (inicio.getTarea().equals(x)) {
            System.out.println("Se eliminó la tarea: " + inicio.getTarea());
            inicio = inicio.getSiguiente();
            return;
        }

        SO anterior = inicio;
        SO actual = inicio.getSiguiente();

        while (actual != null && !actual.getTarea().equals(x)) {
            anterior = actual;
            actual = actual.getSiguiente();
        }

        if (actual == null) {
            System.out.println("La tarea \"" + x + "\" no está en la lista.");
            return;
        }

        anterior.setSiguiente(actual.getSiguiente());

        if (actual == fin) {
            fin = anterior;
            System.out.println("Se eliminó la tarea: " + actual.getTarea());
        } else {
            System.out.println("Se eliminó la tarea: " + actual.getTarea());
        }
    }

    public void mostrar() {
        SO actual = inicio;
        while (actual != null) {
            System.out.println("> " + actual.getTarea());
            actual = actual.getSiguiente();
        }
    }
    
}
