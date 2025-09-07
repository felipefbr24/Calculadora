import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese primer número decimal: ");
        double n1 = sc.nextDouble();

        System.out.print("Ingrese segundo número decimal: ");
        double n2 = sc.nextDouble();

        System.out.println("Elija operación: 1.Suma  2.Resta");
        int op = sc.nextInt();

        System.out.println("Formato: 1.Binario  2.Octal");
        int formato = sc.nextInt();

        Calculadora calc;

        if (formato == 1) {
            calc = new Binario(n1, n2);
        } else {
            calc = new Octal(n1, n2);
        }

        if (op == 1) {
            calc.suma();
        } else {
            calc.resta();
        }

        System.out.println("Resultado: " + calc.convertir());
    }
}
