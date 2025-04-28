//20242228127 SANTIAGO SOLORZANO SANCHEZ
public class AeropuertoMilitar extends Aeropuerto {
    private String nombreClave;

    public AeropuertoMilitar(String nombre, String ciudad, String nombreClave, int capacidadAviones) {
        super(nombre, ciudad, capacidadAviones);
        this.nombreClave = nombreClave;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Aeropuerto Militar: " + nombre + " | Ciudad: " + ciudad + " | Nombre en clave: " + nombreClave);
    }
}
