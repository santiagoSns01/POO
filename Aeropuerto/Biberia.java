import java.util.Scanner;

public class Biberia {
    private Aeropuerto[] aeropuertos;
    private int contadorAeropuertos;

    public Biberia(int capacidadAeropuertos) {
        this.aeropuertos = new Aeropuerto[capacidadAeropuertos];
        this.contadorAeropuertos = 0;
        inicializarDatos();
    }

    private void inicializarDatos() {
        // Inicializar aeropuertos
        Aeropuerto aeropuerto1 = new Aeropuerto("Aeropuerto Internacional", "Ciudad A", 5, false);
        Aeropuerto aeropuerto2 = new Aeropuerto("Aeropuerto Militar", "Ciudad B", 3, true);
        Aeropuerto aeropuerto3 = new Aeropuerto("Aeropuerto Nacional", "Ciudad C", 4, false);

        // Crear aviones de pasajeros
        AvionPasajeros avion1 = new AvionPasajeros("Boeing 737", "ABC123", 5000, 2);
        avion1.agregarPasajero(new Pasajero("Juan Perez", "12345678A", 30));
        avion1.agregarPasajero(new Pasajero("Maria Lopez", "87654321B", 25));

        AvionPasajeros avion2 = new AvionPasajeros("Airbus A320", "DEF456", 6000, 3);
        avion2.agregarPasajero(new Pasajero("Carlos Garcia", "23456789C", 40));

        // Crear aviones de carga
        AvionCarga avion3 = new AvionCarga("Carguero 2000", "XYZ789", 3000, 10000);

        // Agregar aviones a los aeropuertos
        aeropuerto1.agregarAvion(avion1);
        aeropuerto1.agregarAvion(avion2);
        aeropuerto2.agregarAvion(avion3);

        // Agregar aeropuertos a Biberia
        aeropuertos[contadorAeropuertos++] = aeropuerto1;
        aeropuertos[contadorAeropuertos++] = aeropuerto2;
        aeropuertos[contadorAeropuertos++] = aeropuerto3;
    }

    public String getInfoAeropuertos() {
        StringBuilder info = new StringBuilder("Biberia{" +
                "aeropuertos=[");
        for (int i = 0; i < contadorAeropuertos; i++) {
            info.append(aeropuertos[i].getInfoAviones());
            if (i < contadorAeropuertos - 1) {
                info.append(", ");
            }
        }
        info.append("]}");
        return info.toString();
    }

    public String buscarPasajero(String nombrePasajero) {
        for (int i = 0; i < contadorAeropuertos; i++) {
            Aeropuerto aeropuerto = aeropuertos[i];
            for (int j = 0; j < aeropuerto.aviones.length; j++) {
                Avion avion = aeropuerto.aviones[j];
                if (avion instanceof AvionPasajeros) {
                    Pasajero[] pasajeros = ((AvionPasajeros) avion).getPasajeros();
                    for (Pasajero pasajero : pasajeros) {
                        if (pasajero != null && pasajero.getNombre().equalsIgnoreCase(nombrePasajero)) {
                            return "Pasajero encontrado: " + pasajero.toString();
                        }
                    }
                } else if (avion instanceof Avioneta) {
                    Pasajero[] pasajeros = ((Avioneta) avion).getPasajeros();
                    for (Pasajero pasajero : pasajeros) {
                        if (pasajero != null && pasajero.getNombre().equalsIgnoreCase(nombrePasajero)) {
                            return "Pasajero encontrado: " + pasajero.toString();
                        }
                    }
                }
            }
        }
        return "Pasajero no encontrado: " + nombrePasajero;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú de Biberia ===");
            System.out.println("1. Mostrar información de aeropuertos");
            System.out.println("2. Buscar pasajero por nombre");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println(getInfoAeropuertos());
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del pasajero: ");
                    String nombrePasajero = scanner.nextLine();
                    System.out.println(buscarPasajero(nombrePasajero));
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
