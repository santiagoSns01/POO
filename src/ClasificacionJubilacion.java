//SANTIAGO SOLORZANO SANCHEZ 20242228127
/*El Seguro Social requiere clasificar a las personas que se jubilaran en el año 2004. Existen tres
tipos de jubilaciones: por edad, por antigüedad joven y por antigüedad adulta. Las personas
adscritas a la jubilación por edad deben tener 60 años o más y una antigüedad en su empleo de
menos de 25 años. Las personas adscritas a la jubilación por antigüedad joven deben tener
menos de 60 años y una antigüedad en su empleo de 25 años o más. Las personas adscritas a
la jubilación por antigüedad adulta deben tener 60 años o más y una antigüedad en su empleo
de 25 años o más. */

import java.util.Scanner;

public class ClasificacionJubilacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese los años de antigüedad en el empleo: ");
        int antiguedad = scanner.nextInt();

        if (edad >= 60 && antiguedad < 25) {
            System.out.println("La persona se jubila por edad.");
        } else if (edad < 60 && antiguedad >= 25) {
            System.out.println("La persona se jubila por antigüedad joven.");
        } else if (edad >= 60 && antiguedad >= 25) {
            System.out.println("La persona se jubila por antigüedad adulta.");
        } else {
            System.out.println("La persona no cumple los requisitos para jubilarse en el año 2004.");
        }
    }
}