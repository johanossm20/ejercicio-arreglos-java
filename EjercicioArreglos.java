import java.util.Scanner;

public class EjercicioArreglos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arreglo1 = new int[7];
        int[] arreglo2 = new int[7];
        int[] arreglo3 = new int[7];

        int suma = 0;

        // Llenar primer arreglo
        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese numero para arreglo1 posicion " + i + ": ");
            arreglo1[i] = scanner.nextInt();
            suma += arreglo1[i];
        }

        // Llenar segundo arreglo
        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese numero para arreglo2 posicion " + i + ": ");
            arreglo2[i] = scanner.nextInt();
            suma += arreglo2[i];
        }

        // Calcular diferencia
        for (int i = 0; i < 7; i++) {
            arreglo3[i] = arreglo1[i] - arreglo2[i];
        }

        // Mostrar tercer arreglo
        System.out.println("\nContenido del tercer arreglo:");
        for (int i = 0; i < 7; i++) {
            System.out.println(arreglo3[i]);
        }

        // Calcular promedio
        double promedio = (double) suma / 14;
        System.out.println("\nPromedio de todos los datos: " + promedio);

        scanner.close();
    }
}