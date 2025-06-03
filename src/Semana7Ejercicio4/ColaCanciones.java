/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana7Ejercicio4;


public class ColaCanciones {
    private Musica inicio, fin;

    public ColaCanciones() {
        this.inicio = null;
        this.fin = null;
    }
    
    public void insetarFinal(String cancion){
        if(inicio == null){
            inicio = fin = new Musica(cancion);
        } else{
            fin.setCola(new Musica(cancion));
            fin = fin.getCola();
        }
    }
    
    public void mostrar(){
        Musica elemento = inicio;
        while(elemento != null){
            System.out.print(elemento.getCancion()+"\n");
            elemento = elemento.getCola();
        }
        System.out.println();
    }
    
}
