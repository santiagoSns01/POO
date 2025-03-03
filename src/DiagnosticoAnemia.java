//SANTIAGO SOLORZANO SANCHEZ 20242228127
/*Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos, un médico
determina si una persona tiene anemia o no, lo cual depende de su nivel de hemoglobina en la
sangre, de su edad y de su sexo. Si el nivel de hemoglobina que tiene una persona es menor
que el rango que le corresponde, se determina su resultado como positivo y en caso contrario
como negativo. La tabla en la que el medico se basa para obtener el resultado es la siguiente:

EDAD NIVEL HEMOGLOBINA
0 - 1 mes 13 - 26 g%
> 1 y < = 6 meses 10 - 18 g%
> 6 y < = 12 meses 11 - 15 g%
> 1 y < = 5 años 11.5 - 15 g%
> 5 y < = 10 años 12.6 - 15.5 g%
> 10 y < = 15 años 13 - 15.5 g%
Mujeres > 15 años 12 - 16 g%
Hombres > 15 años 14 - 18 g% */

import java.util.Scanner;

public class DiagnosticoAnemia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la edad en años: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese el nivel de hemoglobina en g%: ");
        double hemoglobina = scanner.nextDouble();
        System.out.print("Ingrese el sexo (M para mujer, H para hombre): ");
        char sexo = scanner.next().charAt(0);

        boolean anemia = false;

        if (edad <= 1) {
            if (hemoglobina < 13 || hemoglobina > 28) anemia = true;
        } else if (edad <= 6) {
            if (hemoglobina < 10 || hemoglobina > 18) anemia = true;
        } else if (edad <= 12) {
            if (hemoglobina < 11 || hemoglobina > 15) anemia = true;
        } else if (edad <= 5) {
            if (hemoglobina < 11.5 || hemoglobina > 15) anemia = true;
        } else if (edad <= 10) {
            if (hemoglobina < 12.6 || hemoglobina > 15.5) anemia = true;
        } else if (edad <= 15) {
            if (hemoglobina < 13 || hemoglobina > 15.5) anemia = true;
        } else if (sexo == 'M') {
            if (hemoglobina < 12 || hemoglobina > 16) anemia = true;
        } else if (sexo == 'H') {
            if (hemoglobina < 14 || hemoglobina > 18) anemia = true;
        }

        if (anemia) {
            System.out.println("Resultado: Positivo para anemia.");
        } else {
            System.out.println("Resultado: Negativo para anemia.");
        }
    }
}