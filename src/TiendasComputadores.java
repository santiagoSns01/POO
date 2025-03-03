//SANTIAGO SOLORZANO SANCHEZ 20242228127
/*En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500. */

import java.util.Scanner;

public class TiendasComputadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de computadoras a comprar: ");
        int cantidad = scanner.nextInt();
        double precioUnitario = 500;
        double total = cantidad * precioUnitario;
        double descuento = 0;

        if (cantidad < 5) {
            descuento = total * 0.10;
        } else if (cantidad >= 5 && cantidad < 10) {
            descuento = total * 0.20;
        } else if (cantidad >= 10) {
            descuento = total * 0.40;
        }

        double totalConDescuento = total - descuento;
        System.out.println("Total sin descuento: U$" + total);
        System.out.println("Descuento aplicado: U$" + descuento);
        System.out.println("Total con descuento: U$" + totalConDescuento);
    }
}
