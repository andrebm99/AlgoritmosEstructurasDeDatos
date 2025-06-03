/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana9Ejercicio1;

/**
 *
 * @author LAB-USR-LCENTRO
 */
public class ListaEnlazadaDoble {
   private Navegador inicio, fin;

    public ListaEnlazadaDoble() {
        this.inicio = null;
        this.fin = null;
    }

    public Navegador getInicio() {
        return inicio;
    }

    public void setInicio(Navegador inicio) {
        this.inicio = inicio;
    }

    public Navegador getFin() {
        return fin;
    }

    public void setFin(Navegador fin) {
        this.fin = fin;
    }
    
    // Insertar al final
    
    public void insertFinal(String dato){
        Navegador nuevapagina = new Navegador(dato);
        
        if(fin == null){
            inicio = fin = nuevapagina;
        } else{
            fin.setSig(nuevapagina);
            nuevapagina.setAnt(fin);
            fin = nuevapagina;
        }
    }
    
    
    // imprimir desde adelante
    
    public void imprimirAdelante(){
        Navegador elemento = inicio;
        while(elemento != null){
            System.out.println("> " + elemento.getDato());
            elemento = elemento.getSig();
        }
    }
    
    // imprimir desde el final
    
    public void imprimirFinal(){
        Navegador elemento = fin;
        while(elemento != null){
            System.out.println("> " + elemento.getDato());
            elemento = elemento.getAnt();
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
            inicio = inicio.getSig();
            inicio.setAnt(null);
            
        }
        
        System.out.println("Nodo eliminado al inicio.");
        
        
   
    }
    
}
