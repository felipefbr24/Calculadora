public class Octal extends Calculadora {

    public Octal(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public String convertir() {
        return Integer.toOctalString((int) resultado);
    }
}
