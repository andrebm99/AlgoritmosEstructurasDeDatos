package Semana8Ejercicio5;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.agregarInicio("Andres");
        lista.agregarInicio("Kely");
        lista.agregarInicio("Gina");
        lista.agregarInicio("Emily");
        lista.agregarInicio("July");
        lista.agregarInicio("Mery");
        lista.agregarInicio("Beatriz");
        lista.agregarInicio("Luis");
        lista.agregarInicio("Ana");
        lista.agregarInicio("Carlos");

        System.out.println("Antes de ordenar: ");
        lista.mostrar();

        lista.ordenarAlfabeticamente();
        System.out.println("\nDespues de ordenarla: ");
        lista.mostrar();

    }
}
