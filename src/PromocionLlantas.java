//SANTIAGO SOLORZANO SANCHEZ 20242228127
/*En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra. */

import java.util.Scanner;

public class PromocionLlantas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de llantas a comprar: ");
        int cantidad = scanner.nextInt();
        double precioUnitario;

        if (cantidad < 5) {
            precioUnitario = 100;
        } else if (cantidad >= 5 && cantidad <= 10) {
            precioUnitario = 75;
        } else {
            precioUnitario = 50;
        }

        double total = cantidad * precioUnitario;
        System.out.println("Precio por llanta: U$" + precioUnitario);
        System.out.println("Total a pagar: U$" + total);
    }
}