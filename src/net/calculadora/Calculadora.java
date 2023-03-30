package net.calculadora;


public class Calculadora {
    public static int n;
    private static int resultadoFactorial = 1;
    private static float resultadoMedia = 0;

    public static int factorialDeN(int n) {
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                resultadoFactorial *= i;
            }
        }
        return resultadoFactorial;
    }

    public static float mediaHastaN(int n) {
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                resultadoMedia += i;
            }
            resultadoMedia = resultadoMedia / n;
        }
        return resultadoMedia;
    }

    public static String[] obtenerPasosFibonacci(int n) {
        String[] pasosFibonacci = new String[n];
        int sumaFibonacci;
        int numFibonacci1 = 0;
        int numFibonacci2 = 1;
        int indiceArray = 0;

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                pasosFibonacci[indiceArray] = String.valueOf(numFibonacci1);
                sumaFibonacci = numFibonacci1 + numFibonacci2;
                numFibonacci1 = numFibonacci2;
                numFibonacci2 = sumaFibonacci;
                indiceArray++;
            }
        }
        return pasosFibonacci;
    }
}
