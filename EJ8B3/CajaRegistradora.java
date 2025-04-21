package CajaRegistradora;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementación de la interfaz ICajaRegistradora.
 * Esta clase representa una caja registradora que puede manejar diferentes
 * tipos de monedas y billetes.
 */
public class CajaRegistradora implements ICajaRegistradora {
    private Map<Double, Integer> inventario;
    private double saldo;
    private final double[] tiposValidos = { 0.5, 1.0, 2.0, 5.0, 10.0, 20.0, 50.0 };

    public CajaRegistradora() {
        inventario = new HashMap<>();
        saldo = 0.0;
        // Inicializar con 0 unidades de cada tipo
        for (double tipo : tiposValidos) {
            inventario.put(tipo, 0);
        }
    }
    // Constructor de la clase CajaRegistradora
    // Inicializa el inventario con 0 unidades de cada tipo de moneda/billete
    @Override
    public String getNameUrl() {
        return "Sistema Robot de Caja Registradora";
    }

    @Override
    public int getNumIndex(double tipo) {
        for (int i = 0; i < tiposValidos.length; i++) {
            if (tiposValidos[i] == tipo) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int getUnidadesPorTipo(double tipo) {
        if (!validarTipo(tipo))
            return 0;
        return inventario.getOrDefault(tipo, 0);
    }

    @Override
    public boolean ingresarUnidades(double tipo, int unidades) {
        if (!validarTipo(tipo) || unidades <= 0)
            return false;

        int unidadesActuales = inventario.get(tipo);
        inventario.put(tipo, unidadesActuales + unidades);
        saldo += tipo * unidades;
        return true;
    }

    @Override
    public boolean extraerUnidades(double tipo, int unidades) {
        if (!validarTipo(tipo) || unidades <= 0)
            return false;

        int unidadesActuales = inventario.get(tipo);
        if (unidadesActuales < unidades)
            return false;

        inventario.put(tipo, unidadesActuales - unidades);
        saldo -= tipo * unidades;
        return true;
    }

    @Override
    public boolean validarTipo(double tipo) {
        for (double t : tiposValidos) {
            if (t == tipo)
                return true;
        }
        return false;
    }

    @Override
    public void vaciarCaja() {
        for (double tipo : tiposValidos) {
            inventario.put(tipo, 0);
        }
        saldo = 0.0;
    }

    @Override
    public double[] getTiposDisponibles() {
        return tiposValidos.clone();
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
