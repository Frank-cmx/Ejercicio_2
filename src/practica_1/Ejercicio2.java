
package practica_1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;
        Vehiculo vehi[] = null;

        System.out.print("Cuantos vehiculos desea matricular: ");
        int n = sc.nextInt();
        sc.nextLine();

        do {
            System.out.println("\nSISTEMA DE MATRICULACION VEHICULAR");
            System.out.println("1. Ingreso de vehiculos");
            System.out.println("2. Revision vehicular");
            System.out.println("3. Matricular");
            System.out.println("4. Mostrar datos");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:
                    vehi = new Vehiculo[n];

                    for (int i = 0; i < n; i++) {
                        System.out.println("Datos vehiculo " + (i + 1));

                        System.out.print("Marca: ");
                        String marca = sc.nextLine();

                        System.out.print("Modelo: ");
                        String modelo = sc.nextLine();

                        System.out.print("Estado: ");
                        String estado = sc.nextLine();

                        System.out.print("Anio de fabricacion: ");
                        int anio = sc.nextInt();
                        sc.nextLine();

                        vehi[i] = new Vehiculo(
                            marca, modelo, estado, anio, false
                        );
                    }
                    break;

                case 2:
                    if (vehi != null) {
                        for (int i = 0; i < n; i++) {
                            vehi[i].revisionVehicular();
                        }
                    } else {
                        System.out.println("Primero ingrese los vehiculos.");
                    }
                    break;

                case 3:
                    if (vehi != null) {
                        for (int i = 0; i < n; i++) {
                            vehi[i].matricular();
                        }
                    } else {
                        System.out.println("Primero ingrese los vehiculos.");
                    }
                    break;

                case 4:
                    if (vehi != null) {
                        for (int i = 0; i < n; i++) {
                            vehi[i].mostrarDatos();
                        }
                    } else {
                        System.out.println("Primero ingrese los vehiculos.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (op != 5);

        sc.close();
    }
}
      
            

