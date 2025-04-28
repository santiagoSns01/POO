//20242228127 SANTIAGO SOLORZANO SANCHEZ
import java.util.Scanner;

public class TestBiberia {
    public static void main(String[] args) {
        Biberia biberia = new Biberia(3);

        AeropuertoComercial aeropuerto1 = new AeropuertoComercial("Aeropuerto internacional", "Bogota", 5, 5);
        AeropuertoComercial aeropuerto2 = new AeropuertoComercial("Aeropuerto nacional", "Neiva", 3, 5);
        AeropuertoMilitar aeropuerto3 = new AeropuertoMilitar("Base Aérea nacional", "bogota", "Águila azul", 5);

        AvionPasajeros avion1 = new AvionPasajeros("Boeing 737", "B737-001", 10000, 180);
        avion1.agregarPasajero(new Pasajero("Luisito", "12345678A", 34));
        avion1.agregarPasajero(new Pasajero("Ana", "87654321B", 28));

        AvionCarga avion2 = new AvionCarga("Carguero Titan", "CT-987", 8000, 20000);

        Avioneta avion3 = new Avioneta("Cessna 182", "C182-555", 1500, 4);
        avion3.agregarPasajero(new Pasajero("Carlos", "11223344C", 45));

        aeropuerto1.agregarAvion(avion1);
        aeropuerto2.agregarAvion(avion2);
        aeropuerto3.agregarAvion(avion3);

        biberia.agregarAeropuerto(aeropuerto1);
        biberia.agregarAeropuerto(aeropuerto2);
        biberia.agregarAeropuerto(aeropuerto3);

        biberia.mostrarTodosLosAeropuertos();

        // AHORA pedimos el nombre del pasajero
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIntroduce el nombre del pasajero que quieres buscar:");
        String nombrePasajero = scanner.nextLine();

        System.out.println("\nBuscando pasajero...");
        biberia.buscarPasajero(nombrePasajero);

        scanner.close();
    }
}

