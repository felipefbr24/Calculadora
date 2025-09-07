import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Seleccione el sistema numérico:");
            System.out.println("1. Decimal");
            System.out.println("2. Binario");
            System.out.println("3. Octal");
            System.out.print("Opción: ");

            int opcion = sc.nextInt();
            Calculadora calc;

            switch (opcion) {
                case 1:
                    calc = new CalculadoraDecimal();
                    break;
                case 2:
                    calc = new CalculadoraBinaria();
                    break;
                case 3:
                    calc = new CalculadoraOctal();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    return;
            }

            System.out.print("Ingrese el primer número: ");
            String a = sc.next();   

            System.out.print("Ingrese el segundo número: ");
            String b = sc.next();  

            System.out.println("Seleccione la operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.print("Opción: ");

            int op = sc.nextInt();
            String resultado;

            switch (op) {
                case 1:
                    resultado = calc.sumar(a, b);
                    break;
                case 2:
                    resultado = calc.restar(a, b);
                    break;
                default:
                    System.out.println("Operación inválida.");
                    return;
            }

            System.out.println("Resultado: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Entrada no válida. Asegúrate de ingresar números y opciones correctas.");
        } catch (NumberFormatException e) {
            // Viene de validar/parsear en las clases hijas
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
