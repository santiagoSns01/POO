//20242228127 SANTIAGO SOLORZANO SANCHEZ
public class AeropuertoComercial extends Aeropuerto {
    private int numeroTerminales;

    public AeropuertoComercial(String nombre, String ciudad, int numeroTerminales, int capacidadAviones) {
        super(nombre, ciudad, capacidadAviones);
        this.numeroTerminales = numeroTerminales;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Aeropuerto Comercial: " + nombre + " | Ciudad: " + ciudad + " | Terminales: " + numeroTerminales);
    }
}
