/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana7Ejercicio1;

/**
 *
 * @author Administrador
 */
public class ListasEnlazadasProblema1 {
    private AppLlamadas inicio, fin;
    
    public void agregarInicio(int numMarcados){
        inicio = new AppLlamadas(numMarcados, inicio);
        if(fin == null){
            fin = inicio;
        }
    }
    
    public void mostrar(){
        AppLlamadas elemento = inicio;
        while(elemento != null){
            System.out.print(elemento.getNumMarcados()+" --> ");
            elemento = elemento.getSigLlamada();
        }
        System.out.println();
    }
}
