public class Binario extends Calculadora {

    public Binario(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public String convertir() {
        return Integer.toBinaryString((int) resultado);
    }
}
