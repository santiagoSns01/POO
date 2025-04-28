public class Avioneta extends Avion {
    private int numeroPasajeros;
    private Pasajero[] pasajeros;
    private int contadorPasajeros;

    public Avioneta(String nombre, String matricula, int autonomiaVuelo, int numeroPasajeros) {
        super(nombre, matricula, autonomiaVuelo);
        this.numeroPasajeros = numeroPasajeros;
        this.pasajeros = new Pasajero[numeroPasajeros];
        this.contadorPasajeros = 0;
    }

    public void agregarPasajero(Pasajero pasajero) {
        if (contadorPasajeros < numeroPasajeros) {
            pasajeros[contadorPasajeros] = pasajero;
            contadorPasajeros++;
        } else {
            System.out.println("No se pueden agregar más pasajeros.");
        }
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder("Avioneta{" +
                "nombre='" + getNombre() + '\'' +
                ", matricula='" + getMatricula() + '\'' +
                ", autonomiaVuelo=" + getAutonomiaVuelo() +
                ", numeroPasajeros=" + numeroPasajeros +
                ", pasajeros=[");
        for (int i = 0; i < contadorPasajeros; i++) {
            info.append(pasajeros[i].toString());
            if (i < contadorPasajeros - 1) {
                info.append(", ");
            }
        }
        info.append("]}");
        return info.toString();
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }
}