public class AeropuertoMilitar extends Aeropuerto {
    private String rango;

    public AeropuertoMilitar(String nombre, String ciudad, int capacidadAviones, String rango) {
        super(nombre, ciudad, capacidadAviones, true); // Es militar
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    @Override
    public String getInfoAviones() {
        return super.getInfoAviones() + ", rango=" + rango;
    }
}