package Semana9Ejercicio3;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.tareaRutinaria("Pasear a los perros");
        lista.tareaUrgente("Entregar tarea Algoritmos y estructuras de datos");
        lista.tareaUrgente("Entregar proyecto final");
        lista.tareaRutinaria("hola");

        lista.eliminar("Entregar tarea Algoritmos y estructuras de datos");
        lista.mostrar();

        lista.eliminar("hola");
        lista.mostrar();
        lista.eliminar("Entregar proyecto final");
        lista.mostrar();
    }
}
