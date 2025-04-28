public abstract class Avion {
    private String nombre;
    private String matricula;
    private int autonomiaVuelo;

    public Avion(String nombre, String matricula, int autonomiaVuelo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.autonomiaVuelo = autonomiaVuelo;
    }

    public abstract String getInfo();

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAutonomiaVuelo() {
        return autonomiaVuelo;
    }
}