public class GrafoTransporte {
    private int[][] matrizAdyacencia;
    private Estacion[] estaciones;
    private int tamaño;

    public GrafoTransporte(int tamaño) {
        this.tamaño = tamaño;
        matrizAdyacencia = new int[tamaño][tamaño];
        estaciones = new Estacion[tamaño];
    }

    // Agregar una estación al grafo
    public void agregarEstacion(int indice, Estacion estacion) {
        estaciones[indice] = estacion;
    }

    // Crear una conexión (arista) entre dos estaciones
    public void agregarConexion(int origen, int destino) {
        matrizAdyacencia[origen][destino] = 1;
        matrizAdyacencia[destino][origen] = 1; // Es un grafo no dirigido
    }

    // Verificar si dos estaciones son vecinas
    public boolean sonVecinos(int i, int j) {
        return matrizAdyacencia[i][j] == 1;
    }

    // Mostrar la matriz de adyacencia
    public void mostrarMatrizAdyacencia() {
        System.out.println("Matriz de Adyacencia:");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matrizAdyacencia[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Mostrar el listado de estaciones
    public void mostrarEstaciones() {
        System.out.println("\nEstaciones del Sistema de Transporte:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println(i + ": " + estaciones[i].getNombre() + " (" + estaciones[i].getId() + ")");
        }
    }
}
