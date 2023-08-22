import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FechaNacimiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa tu fecha de nacimiento (dd/mm/aaaa): ");
        String fechaNacimientoStr = scanner.nextLine();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = dateFormat.parse(fechaNacimientoStr);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Usa dd/mm/aaaa.");
            System.exit(1);
        }
        
        Date fechaActual = new Date();
        
        int edad = calcularEdad(fechaNacimiento, fechaActual);
        
        System.out.println("Tu edad es: " + edad + " años.");
        
        scanner.close();
    }
    
    public static int calcularEdad(Date fechaNacimiento, Date fechaActual) {
        int edad = 0;
        
        // Calculamos la edad restando los años de la fecha de nacimiento a la fecha actual.
        edad = fechaActual.getYear() - fechaNacimiento.getYear();
        
        // Verificamos si la fecha de nacimiento ya ocurrió este año.
        if (fechaNacimiento.getMonth() > fechaActual.getMonth() || (fechaNacimiento.getMonth() == fechaActual.getMonth() && fechaNacimiento.getDate() > fechaActual.getDate())) {
            edad--;
        }
        
        return edad;
    }

    @Override
    public String toString() {
        return "FechaNacimiento []";
    }
}