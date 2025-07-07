package relacion;

public class Main {
    public static void main(String[] args) {
        Propietario p1 = new Propietario("Ana");
        Mascota m1 = new Mascota("Toby");
        Mascota m2 = new Mascota("Luna");

        p1.agregarMascota(m1);
        p1.agregarMascota(m2);

        p1.mostrarMascotas();
    }
}