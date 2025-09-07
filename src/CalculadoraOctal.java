public class CalculadoraOctal extends Calculadora {

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
        // Permitimos signo opcional y dígitos 0-7
        if (!s.matches("[-]?[0-7]+"))
            throw new NumberFormatException("Octal inválido: " + s);
    }

    @Override
    protected int parse(String s) {
        boolean negativo = s.startsWith("-");
        String mag = negativo ? s.substring(1) : s;
        int val = Integer.parseInt(mag, 8);
        return negativo ? -val : val;
    }

    @Override
    protected String formatear(int valor) {
        if (valor < 0) return "-" + Integer.toOctalString(-valor);
        return Integer.toOctalString(valor);
    }
}
