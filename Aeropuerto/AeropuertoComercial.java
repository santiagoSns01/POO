public class AeropuertoComercial extends Aeropuerto {
    private boolean tieneTiendas;

    public AeropuertoComercial(String nombre, String ciudad, int capacidadAviones, boolean tieneTiendas) {
        super(nombre, ciudad, capacidadAviones, false); // No es militar
        this.tieneTiendas = tieneTiendas;
    }

    public boolean isTieneTiendas() {
        return tieneTiendas;
    }

    @Override
    public String getInfoAviones() {
        return super.getInfoAviones() + ", tieneTiendas=" + tieneTiendas;
    }
}