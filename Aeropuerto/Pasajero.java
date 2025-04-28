//20242228127 SANTIAGO SOLORZANO SANCHEZ
public class Pasajero {
    private String nombre;
    private String dni;
    private int edad;

    public Pasajero(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInformacion() {
        System.out.println("Pasajero: " + nombre + " | DNI: " + dni + " | Edad: " + edad);
    }
}

