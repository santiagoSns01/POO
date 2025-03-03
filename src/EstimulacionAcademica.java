//SANTIAGO SOLORZANO SANCHEZ 20242228127
/*Una institución educativa estableció un programa para estimular a los alumnos con buen
rendimiento académico y que consiste en lo siguiente:
▪ Si el promedio es de 9.5 o más y el alumno es de tecnología, entonces este podrá cursar
55 créditos y se le hará un 25% de descuento.
▪ Si el promedio es mayor o igual a 9 pero menor que 9.5 y el alumno es de tecnología,
entonces este podrá cursar 50 créditos y se le hará un 10% de descuento.
▪ Si el promedio es mayor que 7 y menor que 9 y el alumno es de tecnología, este podrá
cursar 50 créditos y no tendrá ningún descuento.
▪ Si el promedio es de 7 o menor, el número de materias reprobadas es de 0 a 3 y el
alumno es de tecnología, entonces podrá cursar 45 créditos y no tendrá descuento.

▪ Si el promedio es de 7 o menor, el número de materias reprobadas es de 4 o más y el
alumno es de tecnología, entonces podrá cursar 40 créditos y no tendrá ningún
descuento.
▪ Si el promedio es mayor o igual a 9.5 y el alumno es de profesional, entonces podrá
cursar 55 créditos y se le hará un 20% de descuento.
▪ Si el promedio es menor de 9.5 y el alumno es de profesional, entonces podrá cursar 55
créditos y no tendrá descuento.
Obtener el total que tendrá que pagar un alumno si el valor de la matrícula para alumnos de
profesional es de $30.000 por cada cinco créditos y para alumnos de tecnología es de $18.000
por cada cinco créditos. */

import java.util.Scanner;

public class EstimulacionAcademica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el promedio del alumno: ");
        double promedio = scanner.nextDouble();
        System.out.print("Ingrese el número de materias reprobadas: ");
        int materiasReprobadas = scanner.nextInt();
        System.out.print("Ingrese el tipo de alumno (T para tecnología, P para profesional): ");
        char tipoAlumno = scanner.next().charAt(0);

        int creditos = 0;
        double descuento = 0;
        double costoPorCincoCreditos = 0;

        if (tipoAlumno == 'T') {
            costoPorCincoCreditos = 18000;
            if (promedio >= 9.5) {
                creditos = 55;
                descuento = 0.25;
            } else if (promedio >= 9) {
                creditos = 50;
                descuento = 0.10;
            } else if (promedio > 7) {
                creditos = 50;
                descuento = 0;
            } else if (materiasReprobadas <= 3) {
                creditos = 45;
                descuento = 0;
            } else {
                creditos = 40;
                descuento = 0;
            }
        } else if (tipoAlumno == 'P') {
            costoPorCincoCreditos = 30000;
            if (promedio >= 9.5) {
                creditos = 55;
                descuento = 0.20;
            } else {
                creditos = 55;
                descuento = 0;
            }
        }

        double costoTotal = (creditos / 5) * costoPorCincoCreditos;
        double costoConDescuento = costoTotal * (1 - descuento);

        System.out.println("Créditos a cursar: " + creditos);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Costo total sin descuento: $" + costoTotal);
        System.out.println("Costo total con descuento: $" + costoConDescuento);
    }
}