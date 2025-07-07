package Historia;
import java.util.Scanner;

public class Consulta {
    private String codigo;
    private String fecha;
    private Veterinario veterinario;

    public Consulta(String codigo, String fecha, Veterinario veterinario) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.veterinario = veterinario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /*
    Muestra los detalles de la consulta, incluyendo los datos del veterinario.
     */
    public void mostrarDetalleConsulta() {
        System.out.println("Consulta Código: " + codigo);
        System.out.println("Fecha: " + fecha);
        System.out.println("Veterinario: " + veterinario.getNombre() + " | Especialidad: " + veterinario.getEspecialidad());
    }
}