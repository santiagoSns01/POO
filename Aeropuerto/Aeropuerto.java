public class Aeropuerto {
    private String nombre;
    private String ciudad;
    public Avion[] aviones;
    private int contadorAviones;
    private boolean esMilitar;

    public Aeropuerto(String nombre, String ciudad, int capacidadAviones, boolean esMilitar) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.aviones = new Avion[capacidadAviones];
        this.contadorAviones = 0;
        this.esMilitar = esMilitar;
    }

    public void agregarAvion(Avion avion) {
        if (contadorAviones < aviones.length) {
            aviones[contadorAviones] = avion;
            contadorAviones++;
        } else {
            System.out.println("No se pueden agregar más aviones.");
        }
    }

    public String getInfoAviones() {
        StringBuilder info = new StringBuilder("Aeropuerto{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", aviones=[");
        for (int i = 0; i < contadorAviones; i++) {
            info.append(aviones[i].getInfo());
            if (i < contadorAviones - 1) {
                info.append(", ");
            }
        }
        info.append("]}");
        return info.toString();
    }

    public boolean isEsMilitar() {
        return esMilitar;
    }
}