package Historia;
import java.util.ArrayList;

public class Propietario {
    private String nombre;
    private int documento;
    private int telefono;
    private ArrayList<Mascota> mascotas = new ArrayList<>();

    public Propietario(String nombre, int documento, int telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
    }

    /**
     * Agrega una mascota al listado del propietario.
     */
    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }

    /**
     * Muestra la ficha clínica del propietario y todas sus mascotas.
     */
    public void mostrarInformacionCompleta() {
        System.out.println("===== FICHA CLÍNICA =====\n");
        System.out.println("👤 Propietario: " + nombre);
        System.out.println("🆔 Documento: " + documento);
        System.out.println("📞 Teléfono: " + telefono);
        System.out.println();

        for (Mascota m : mascotas) {
            m.mostrarHistorial();
        }
    }
}