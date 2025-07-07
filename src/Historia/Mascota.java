package Historia;
import java.util.ArrayList;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private ArrayList<Consulta> consultas = new ArrayList<>();

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    /**
     * Agrega una consulta médica al historial de la mascota.
     */
    public void agregarConsulta(Consulta c) {
        consultas.add(c);
    }

    /**
     * Muestra la información de la mascota y su historial de consultas.
     */
    public void mostrarHistorial() {
        System.out.println("📋 Mascota: " + nombre + " | Especie: " + especie + " | Edad: " + edad + " años");
        System.out.println("Historial de consultas:");
        for (Consulta c : consultas) {
            c.mostrarDetalleConsulta();
            System.out.println("--------------------------");
        }
        System.out.println();
    }
}
