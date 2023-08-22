import java.util.Scanner;

public class CalculoRiesgo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la edad de la persona
        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        // Pedir el índice de masa corporal (IMC) de la persona
        System.out.print("Ingrese el IMC de la persona: ");
        double imc = scanner.nextDouble();

        // Calcular el riesgo de enfermedades coronarias (usando una fórmula de ejemplo)
        double riesgo = calcularRiesgoCoronario(edad, imc);

        // Mostrar el resultado
        System.out.println("El riesgo de enfermedad es: " + riesgo);

        scanner.close();
    }

    // Función para calcular el riesgo de enfermedades coronarias (ejemplo)
    public static double calcularRiesgoCoronario(int edad, double imc) {
        // En este ejemplo, simplemente calculamos un valor de riesgo ficticio
        // utilizando una fórmula simple. Puedes ajustar esta fórmula según tus necesidades.
        double riesgo = 0.0;

        // Ejemplo de fórmula ficticia (cambiar según tus necesidades)
        riesgo = 0.5 * edad + 0.3 * imc;

        return riesgo;
    }
} 