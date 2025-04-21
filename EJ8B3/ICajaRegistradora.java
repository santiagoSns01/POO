package CajaRegistradora;

public interface ICajaRegistradora {
    String getNameUrl();
    int getNumIndex(double tipo);
    int getUnidadesPorTipo(double tipo);
    boolean ingresarUnidades(double tipo, int unidades);
    boolean extraerUnidades(double tipo, int unidades);
    boolean validarTipo(double tipo);
    void vaciarCaja();
    double[] getTiposDisponibles();
    double getSaldo();
}

