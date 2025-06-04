package Semana8Ejercicio6;

public class Main {
    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();

        lista.pacienteNormal("Paciente C");
        lista.pacienteUrgente("Paciente A");

        lista.moverDespuesDe("Paciente A", "Paciente B");
        lista.moverAntesDe("Paciente C", "Paciente D");
        lista.mostrar();
        System.out.println("Eliminando al inicio");
        lista.eliminarInicio();
        lista.mostrar();
        System.out.println("Eliminando al final");
        lista.eliminarFin();
        lista.mostrar();

        System.out.println("Ordenando alfabeticamente");
        lista.ordenarAlfabeticamente();
        lista.mostrar();


    }
}
