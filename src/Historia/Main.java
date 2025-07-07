package Historia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingreso de datos del propietario
        System.out.println("Registro de propietario");
        System.out.print("Nombre: ");
        String nombreProp = sc.nextLine();
        System.out.print("Documento: ");
        int documento = Integer.parseInt(sc.nextLine());
        System.out.print("Teléfono: ");
        int telefono = Integer.parseInt(sc.nextLine());

        Propietario propietario = new Propietario(nombreProp, documento, telefono);

        // Registro de mascotas
        System.out.print("¿Cuántas mascotas desea registrar?: ");
        int cantMascotas = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < cantMascotas; i++) {
            System.out.println("\nMascota " + (i + 1));
            System.out.print("Nombre: ");
            String nombreM = sc.nextLine();
            System.out.print("Especie: ");
            String especie = sc.nextLine();
            System.out.print("Edad: ");
            int edad = Integer.parseInt(sc.nextLine());

            Mascota mascota = new Mascota(nombreM, especie, edad);

            // Registro de consultas para cada mascota
            System.out.print("¿Cuántas consultas tiene esta mascota?: ");
            int cantConsultas = Integer.parseInt(sc.nextLine());

            for (int j = 0; j < cantConsultas; j++) {
                System.out.println("\nConsulta " + (j + 1));
                System.out.print("Código: ");
                String cod = sc.nextLine();
                System.out.print("Fecha (YYYY-MM-DD): ");
                String fecha = sc.nextLine();
                System.out.print("Nombre del veterinario: ");
                String nomVet = sc.nextLine();
                System.out.print("Especialidad: ");
                String esp = sc.nextLine();

                Veterinario vet = new Veterinario(nomVet, esp);
                Consulta consulta = new Consulta(cod, fecha, vet);
                mascota.agregarConsulta(consulta);
            }

            propietario.agregarMascota(mascota);
        }

        // Mostrar historial clínico completo
        System.out.println();
        propietario.mostrarInformacionCompleta();
    }
}