import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GrafoTransporte grafo = new GrafoTransporte(5);

        // Crear estaciones
        grafo.agregarEstacion(0, new Estacion('A', "Estación A"));
        grafo.agregarEstacion(1, new Estacion('B', "Estación B"));
        grafo.agregarEstacion(2, new Estacion('C', "Estación C"));
        grafo.agregarEstacion(3, new Estacion('D', "Estación D"));
        grafo.agregarEstacion(4, new Estacion('E', "Estación E"));

        // Conexiones: A-B, A-C, B-D, C-D, D-E
        grafo.agregarConexion(0, 1); // A-B
        grafo.agregarConexion(0, 2); // A-C
        grafo.agregarConexion(1, 3); // B-D
        grafo.agregarConexion(2, 3); // C-D
        grafo.agregarConexion(3, 4); // D-E

        // Mostrar la matriz de adyacencia y las estaciones
        grafo.mostrarMatrizAdyacencia();
        grafo.mostrarEstaciones();

        // Pedir al usuario dos estaciones para verificar si son vecinos
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese el índice de la primera estación (0-4): ");
        int origen = sc.nextInt();

        System.out.print("Ingrese el índice de la segunda estación (0-4): ");
        int destino = sc.nextInt();

        if (grafo.sonVecinos(origen, destino)) {
            System.out.println("Las estaciones son vecinas.");
        } else {
            System.out.println("Las estaciones no son vecinas.");
        }

        sc.close();
    }
}
