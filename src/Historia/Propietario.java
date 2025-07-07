package relacion;
import java.util.ArrayList;

public class Propietario {


    private String nombre;
    private String documento;
    private String telefono;


    private ArrayList<Mascota> mascotas = new ArrayList<>();

    public Propietario(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }

    public void mostrarMascotas() {
        for (Mascota m : mascotas) {
            m.mostrarInfo();
        }
    }
}