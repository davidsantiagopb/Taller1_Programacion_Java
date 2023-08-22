import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un año
        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();
        
        // Verificar si el año es bisiesto
        boolean esBisiesto = esBisiesto(año);
        
        // Mostrar el resultado
        if (esBisiesto) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
    
    // Método para verificar si un año es bisiesto
    public static boolean esBisiesto(int anio) {
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}