package Semana8Ejercicio3;

public class Main {
    public static void main(String[] args) {
        ListaEnlazadaMusica lista = new ListaEnlazadaMusica();

        lista.insertInicio( "I Can't Get No");
        lista.insertInicio("Highway to Hell");
        lista.insertFin("Hotel California");
        lista.insertInicio("Born to Run");
        lista.insertFin("Walk This Way");
        lista.insertFin("Stairway to Heaven");
        lista.mostrar();

        // Eliminar inicio
        lista.eliminarInicio();
        lista.mostrar();

        // Eliminar final
        lista.eliminarFinal();
        lista.mostrar();



    }
}
