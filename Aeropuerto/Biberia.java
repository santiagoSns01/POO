//20242228127 SANTIAGO SOLORZANO SANCHEZ
public class Biberia {
    private Aeropuerto[] aeropuertos;
    private int contadorAeropuertos;

    public Biberia(int cantidadAeropuertos) {
        aeropuertos = new Aeropuerto[cantidadAeropuertos];
        contadorAeropuertos = 0;
    }

    public void agregarAeropuerto(Aeropuerto aeropuerto) {
        if (contadorAeropuertos < aeropuertos.length) {
            aeropuertos[contadorAeropuertos++] = aeropuerto;
        }
    }

    public void mostrarTodosLosAeropuertos() {
        for (int i = 0; i < contadorAeropuertos; i++) {
            aeropuertos[i].mostrarInformacion();
            for (Avion avion : aeropuertos[i].getAviones()) {
                if (avion != null) {
                    avion.mostrarInformacion();
                }
            }
            System.out.println("-----------------------------------");
        }
    }

    public void buscarPasajero(String nombrePasajero) {
        for (int i = 0; i < contadorAeropuertos; i++) {
            Avion[] aviones = aeropuertos[i].getAviones();
            for (Avion avion : aviones) {
                if (avion != null) {
                    if (avion instanceof AvionPasajeros) {
                        Pasajero[] pasajeros = ((AvionPasajeros) avion).getPasajeros();
                        for (Pasajero pasajero : pasajeros) {
                            if (pasajero != null && pasajero.getNombre().equalsIgnoreCase(nombrePasajero)) {
                                System.out.println("Pasajero " + nombrePasajero + " encontrado en avión " + avion.getNombre() + " en el aeropuerto " + aeropuertos[i].getNombre());
                                return;
                            }
                        }
                    }
                    if (avion instanceof Avioneta) {
                        Pasajero[] pasajeros = ((Avioneta) avion).getPasajeros();
                        for (Pasajero pasajero : pasajeros) {
                            if (pasajero != null && pasajero.getNombre().equalsIgnoreCase(nombrePasajero)) {
                                System.out.println("Pasajero " + nombrePasajero + " encontrado en avioneta " + avion.getNombre() + " en el aeropuerto " + aeropuertos[i].getNombre());
                                return;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Pasajero " + nombrePasajero + " no encontrado.");
    }
}
