//20242228127 SANTIAGO SOLORZANO SANCHEZ
public abstract class Avion {
    protected String nombre;
    protected String matricula;
    protected int autonomia;

    public Avion(String nombre, String matricula, int autonomia) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.autonomia = autonomia;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void mostrarInformacion();
}
