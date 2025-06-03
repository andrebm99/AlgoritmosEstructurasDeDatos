package Semana8Ejercicio1;

public class Main {
    public static void main(String[] args) {
        ListaEnlazadaEjercicio1 task = new ListaEnlazadaEjercicio1();

        task.inicioUrgentes("Revisar servido");
        task.inicioUrgentes("Corregir error crítico");
        task.finalRegulares( "Enviar informe");
        task.finalRegulares("Organizar archivos");

        task.mostrar();
    }
}
