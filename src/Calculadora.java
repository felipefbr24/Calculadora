public class Calculadora {
    protected double numero1;
    protected double numero2;
    protected double resultado;

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void suma() {
        resultado = numero1 + numero2;
    }

    public void resta() {
        resultado = numero1 - numero2;
    }

    // Método a sobrescribir (polimorfismo)
    public String convertir() {
        return String.valueOf((int) resultado); // por defecto decimal
    }
}
