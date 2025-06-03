package Semana8Ejercicio2;

public class Main {
    public static void main(String[] args) {
        ListaEnlazadaAsistente asistente = new ListaEnlazadaAsistente();

        asistente.insertarInicio("Revision mensual");

        asistente.mostrar();

        asistente.insertarAntesDe("Revision Mensual", "Llamada con cliente");

        asistente.mostrar();


        asistente.insertarAntesDe("Revision Mensual", "Reunion de equipo de desarrollo");




    }
}
