//SANTIAGO SOLORZANO SANCHEZ 20242228127
/*Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
cualquiera por la compra de su aparato. El IVA es del 19%. */

import java.util.Scanner;

public class DescuentoReproductores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del reproductor sin IVA: ");
        double precioSinIVA = scanner.nextDouble();
        System.out.print("Ingrese la marca del reproductor: ");
        String marca = scanner.next();
        double descuento = 0;

        if (precioSinIVA >= 500) {
            descuento += precioSinIVA * 0.10;
        }
        if (marca.equalsIgnoreCase("NOSY")) {
            descuento += precioSinIVA * 0.05;
        }

        double precioConDescuento = precioSinIVA - descuento;
        double iva = precioConDescuento * 0.19;
        double total = precioConDescuento + iva;
        System.out.println("Total a pagar con IVA y descuentos: U$" + total);
    }
}
