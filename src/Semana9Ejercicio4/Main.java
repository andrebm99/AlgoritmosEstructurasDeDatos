
package Semana9Ejercicio4;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        
        lista.insertFinal("Gaseosa");
        lista.insertFinal("Agua");
        lista.insertFinal("Galleta");
        lista.insertFinal("Piqueo");

        System.out.println("Deshacer");
        lista.deshacer();
        System.out.println("Rehacer");
        lista.rehacer();

        System.out.println("Eliminar");
        lista.eliminarProducto();
        lista.deshacer();

    }
}
