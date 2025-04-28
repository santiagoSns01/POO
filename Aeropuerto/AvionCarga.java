//20242228127 SANTIAGO SOLORZANO SANCHEZ
public class AvionCarga extends Avion {
    private double cargaMaxima;

    public AvionCarga(String nombre, String matricula, int autonomia, double cargaMaxima) {
        super(nombre, matricula, autonomia);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Avión de Carga: " + nombre + " | Matrícula: " + matricula + " | Autonomía: " + autonomia + " km | Carga máxima: " + cargaMaxima + " kg");
    }
}

