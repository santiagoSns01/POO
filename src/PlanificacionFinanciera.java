//SANTIAGO SOLORZANO SANCHEZ 20242228127
/*El dueño de una empresa desea planificar las decisiones financieras que tomara en el siguiente
año. La manera de planificarlas depende de lo siguiente:
Si actualmente su capital se encuentra con saldo negativo, pedirá un préstamo bancario para
que su nuevo saldo sea de U$10.000. Si su capital tiene actualmente un saldo positivo pedirá un
préstamo bancario para tener un nuevo saldo de U$20.000, pero si su capital tiene actualmente
un saldo superior a los U$20.000 no pedirá ningún préstamo.
Posteriormente repartirá su presupuesto de la siguiente manera:
• U$5.000 para equipo de computo
• U$2.000 para mobiliario
• El resto la mitad será para la compra de insumos y la otra para otorgar incentivos al personal.
Desplegar que cantidades se destinaran para la compra de insumos e incentivos al personal y,
en caso de que fuera necesario, a cuánto ascendería la cantidad que se pediría al banco. */

import java.util.Scanner;

public class PlanificacionFinanciera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el saldo actual de la empresa: ");
        double saldoActual = scanner.nextDouble();
        double prestamo = 0;

        if (saldoActual < 0) {
            prestamo = 10000 - saldoActual;
            saldoActual = 10000;
        } else if (saldoActual <= 20000) {
            prestamo = 20000 - saldoActual;
            saldoActual = 20000;
        }

        double presupuestoEquipo = 5000;
        double presupuestoMobiliario = 2000;
        double resto = saldoActual - presupuestoEquipo - presupuestoMobiliario;
        double insumos = resto / 2;
        double incentivos = resto / 2;

        System.out.println("Cantidad para insumos: U$" + insumos);
        System.out.println("Cantidad para incentivos: U$" + incentivos);
        if (prestamo > 0) {
            System.out.println("Préstamo necesario: U$" + prestamo);
        }
    }
}