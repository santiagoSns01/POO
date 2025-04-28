//20242228127 SANTIAGO SOLORZANO SANCHEZ
public class AvionPasajeros extends Avion {
    private int numeroPasajeros;
    private Pasajero[] pasajeros;
    private int contadorPasajeros;

    public AvionPasajeros(String nombre, String matricula, int autonomia, int capacidadPasajeros) {
        super(nombre, matricula, autonomia);
        this.numeroPasajeros = capacidadPasajeros;
        pasajeros = new Pasajero[capacidadPasajeros];
        contadorPasajeros = 0;
    }

    public void agregarPasajero(Pasajero pasajero) {
        if (contadorPasajeros < pasajeros.length) {
            pasajeros[contadorPasajeros++] = pasajero;
        } else {
            System.out.println("No se pueden agregar más pasajeros al avión " + nombre);
        }
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Avión de Pasajeros: " + nombre + " | Matrícula: " + matricula + " | Autonomía: " + autonomia + " km | Capacidad: " + numeroPasajeros);
        for (int i = 0; i < contadorPasajeros; i++) {
            pasajeros[i].mostrarInformacion();
        }
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }
}

