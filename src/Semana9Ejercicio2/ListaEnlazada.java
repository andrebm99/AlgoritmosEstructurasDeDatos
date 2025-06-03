/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana9Ejercicio2;

/**
 *
 * @author LAB-USR-LCENTRO
 */
public class ListaEnlazada {
    private Reproduccion inicio, fin;
    
    public ListaEnlazada(){
        this.inicio = null;
        this.fin = null;
    }

    public Reproduccion getInicio() {
        return inicio;
    }

    public void setInicio(Reproduccion inicio) {
        this.inicio = inicio;
    }

    public Reproduccion getFin() {
        return fin;
    }

    public void setFin(Reproduccion fin) {
        this.fin = fin;
    }
    
    public void agregarInicio(String nombre){
        Reproduccion nuevaCancion = new Reproduccion(nombre);
        
        if(inicio == null){
            inicio = fin = nuevaCancion;
        } else{
            nuevaCancion.setSiguiente(inicio);
            inicio.setAnterior(nuevaCancion);
            inicio = nuevaCancion;
        }
    }
    
    public void agregarFinal(String nombre){
        Reproduccion nuevaCancion = new Reproduccion(nombre);
        if(fin == null){
            inicio = fin = nuevaCancion;
        } else{
            fin.setSiguiente(nuevaCancion);
            nuevaCancion.setAnterior(fin);
            fin = nuevaCancion;
        }
    }
    
    // Recorrer hacia atras
    
    public void printFinal(){
        Reproduccion tema = fin;
        while(tema !=null){
            System.out.println("> " + tema.getNombre());
            tema = tema.getAnterior();
        }
    }
    
    
}
