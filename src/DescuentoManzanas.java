//SANTIAGO SOLORZANO SANCHEZ 20242228127
/*Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS % DESCUENTO
0 - 2 0%
2.01 - 5 10%
5.01 - 10 15%
10.01 en adelante 20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería. */
import java.util.Scanner;

public class DescuentoManzanas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de kilos de manzanas a comprar: ");
        double kilos = scanner.nextDouble();
        double precioPorKilo = 5; // Supongamos que el precio por kilo es U$5
        double total = kilos * precioPorKilo;
        double descuento = 0;

        if (kilos > 10) {
            descuento = total * 0.20;
        } else if (kilos > 5) {
            descuento = total * 0.15;
        } else if (kilos > 2) {
            descuento = total * 0.10;
        }

        double totalConDescuento = total - descuento;
        System.out.println("Total sin descuento: U$" + total);
        System.out.println("Descuento aplicado: U$" + descuento);
        System.out.println("Total con descuento: U$" + totalConDescuento);
    }
}