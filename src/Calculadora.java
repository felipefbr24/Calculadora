public abstract class Calculadora {
    /** Suma dos números dados como cadenas en el sistema de la calculadora. */
    public abstract String sumar(String a, String b);

    /** Resta dos números dados como cadenas en el sistema de la calculadora. (a - b) */
    public abstract String restar(String a, String b);

    /** Valida el formato de la cadena según el sistema numérico. */
    protected abstract void validar(String s);

    /** Convierte cadena del sistema propio a entero. */
    protected abstract int parse(String s);

    /** Convierte entero a cadena en el sistema propio. */
    protected abstract String formatear(int valor);
}
