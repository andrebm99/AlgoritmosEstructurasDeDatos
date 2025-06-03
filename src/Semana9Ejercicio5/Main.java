package Semana9Ejercicio5;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada list = new ListaEnlazada();
        list.insertFinal("Despertar");
        list.insertFinal("Navegar");
        list.insertFinal("Programar");
        list.insertFinal("Comer");
        list.insertFinal("Dormir");

        System.out.println("Deshacer");
        list.deshacer();

        System.out.println("Rehacer");
        list.rehacer();

        System.out.println("Eliminar");
        list.eliminar();

        list.rehacer();
    }
}
