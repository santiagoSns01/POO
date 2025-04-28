//20242228127 SANTIAGO SOLORZANO SANCHEZ
public abstract class Aeropuerto {
    protected String nombre;
    protected String ciudad;
    protected Avion[] aviones;
    protected int contadorAviones;

    public Aeropuerto(String nombre, String ciudad, int capacidadAviones) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        aviones = new Avion[capacidadAviones];
        contadorAviones = 0;
    }

    public void agregarAvion(Avion avion) {
        if (contadorAviones < aviones.length) {
            aviones[contadorAviones++] = avion;
        } else {
            System.out.println("No se pueden agregar más aviones al aeropuerto " + nombre);
        }
    }

    public Avion[] getAviones() {
        return aviones;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void mostrarInformacion();
}
