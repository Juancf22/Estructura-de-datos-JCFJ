public class Estacion {
    private char id;
    private String nombre;

    public Estacion(char id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public char getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
