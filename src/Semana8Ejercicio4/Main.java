package Semana8Ejercicio4;

public class Main {
    public static void main(String[] args) {
        ListaEnlazadaDoc lista = new ListaEnlazadaDoc();
        lista.agregarFinal("Doc1");
        lista.agregarFinal("Doc2");
        lista.agregarFinal("Doc3");
        lista.agregarFinal("Doc4");
        lista.agregarFinal("Doc5");
        lista.agregarFinal("Doc6");
        lista.agregarFinal("Doc7");
        lista.agregarFinal("Doc8");

        System.out.println("####### LISTA ORIGINAL #######");
        lista.mostrar();

        lista.eliminarAntesDe("Doc4");
        System.out.println("Se elimino el nodo anterior a doc4");
        lista.mostrar();

        lista.eliminarDespuesDe("Doc2");
        System.out.println("Se elimino el nodo despues de doc2");
        lista.mostrar();

    }
}
