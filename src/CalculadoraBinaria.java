public class CalculadoraBinaria extends Calculadora {

    @Override
    public String sumar(String a, String b) {
        validar(a); validar(b);
        int x = parse(a), y = parse(b);
        return formatear(x + y);
    }

    @Override
    public String restar(String a, String b) {
        validar(a); validar(b);
        int x = parse(a), y = parse(b);
        return formatear(x - y);
    }

    @Override
    protected void validar(String s) {
        // Permitimos signo opcional y dígitos 0/1
        if (!s.matches("[-]?[01]+"))
            throw new NumberFormatException("Binario inválido: " + s);
    }

    @Override
    protected int parse(String s) {
        boolean negativo = s.startsWith("-");
        String mag = negativo ? s.substring(1) : s;
        int val = Integer.parseInt(mag, 2);
        return negativo ? -val : val;
    }

    @Override
    protected String formatear(int valor) {
        if (valor < 0) return "-" + Integer.toBinaryString(-valor);
        return Integer.toBinaryString(valor);
    }
}
