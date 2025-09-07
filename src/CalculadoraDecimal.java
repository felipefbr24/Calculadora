public class CalculadoraDecimal extends Calculadora {

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
        if (!s.matches("[-]?\\d+"))
            throw new NumberFormatException("Decimal inválido: " + s);
    }

    @Override
    protected int parse(String s) {
        return Integer.parseInt(s, 10);
    }

    @Override
    protected String formatear(int valor) {
        return Integer.toString(valor);
    }
}

