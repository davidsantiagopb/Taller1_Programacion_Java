import java.util.Scanner;
import java.util.Arrays;

public class NúmerosOrdenados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los cuatro números
        System.out.println("Ingrese cuatro números:");
        int[] numeros = new int[4];
        for (int i = 0; i < 4; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Ordenar los números de menor a mayor
        Arrays.sort(numeros);

        // Mostrar los números ordenados
        System.out.println("Números ordenados de menor a mayor:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        // Cerrar el escáner
        scanner.close();
    }
} 