package Semana8Ejercicio2;

public class Main {
    public static void main(String[] args) {
        ListaEnlazadaAsistente asistente = new ListaEnlazadaAsistente();

        asistente.insertarInicio("Revision mensual");
        asistente.insertarAntesDe("Revision mensual", "Reunión de equipo");
        asistente.insertarDespuseDe("Revision mensual", "Llamada con cliente");

        asistente.mostrar();

    }
}
