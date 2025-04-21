package CajaRegistradora;
import java.util.Scanner;

public class Test { // Clase de prueba para la caja registradora
    // Esta clase permite interactuar con la caja registradora a través de un menú
    // en la consola, permitiendo al usuario ingresar unidades, consultar el inventario,
    // extraer unidades, mostrar el saldo total y vaciar la caja.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ICajaRegistradora caja = new CajaRegistradora();
        
        int opcion;
        do { // Mostrar menú y opciones
            System.out.println("\n--- MENÚ CAJA REGISTRADORA ---");
            System.out.println("1. Ingresar unidades [tipo y cantidad]");
            System.out.println("2. Consultar inventario [mostrar todas las unidades]");
            System.out.println("3. Extraer unidades [tipo y cantidad]");
            System.out.println("4. Mostrar saldo total");
            System.out.println("5. Vaciar caja");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            // Leer opción del usuario
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el tipo de unidad: ");
                    double tipoIngreso = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidadIngreso = scanner.nextInt();
                    
                    if (caja.ingresarUnidades(tipoIngreso, cantidadIngreso)) {
                        System.out.println("Unidades ingresadas correctamente.");
                    } else {
                        System.out.println("Error: Tipo no válido o cantidad inválida.");
                    }
                    break;
                    
                case 2:
                    System.out.println("\nINVENTARIO ACTUAL:");
                    for (double tipo : caja.getTiposDisponibles()) {
                        System.out.printf("Tipo %.2f: %d unidades%n", 
                                         tipo, caja.getUnidadesPorTipo(tipo));
                    }
                    break;
                    
                case 3:
                    System.out.print("Ingrese el tipo de unidad a extraer: ");
                    double tipoExtraccion = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidadExtraccion = scanner.nextInt();
                    
                    if (caja.extraerUnidades(tipoExtraccion, cantidadExtraccion)) {
                        System.out.println("Unidades extraídas correctamente.");
                    } else {
                        System.out.println("Error: Tipo no válido, cantidad inválida o no hay suficientes unidades.");
                    }
                    break;
                    
                case 4:
                    System.out.printf("Saldo total: %.2f%n", caja.getSaldo());
                    break;
                    
                case 5:
                    caja.vaciarCaja();
                    System.out.println("Caja vaciada correctamente.");
                    break;
                    
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            
        } while (opcion != 6);
        
        scanner.close();
    }
}