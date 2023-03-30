import net.vehiculos.*;
import net.vehiculos.camion.Camion;
import net.vehiculos.ciclomotor.Ciclomotor;
import net.calculadora.Calculadora;

import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        final Scanner TECLADO = new Scanner(System.in);

        System.out.println(("Introduzca el valor de N, recuerde que debe ser entero"));
        Calculadora.n = TECLADO.nextInt();

        System.out.println(Calculadora.factorialDeN(Calculadora.n));
        System.out.println(Calculadora.mediaHastaN(Calculadora.n));
        System.out.println(Arrays.toString(Calculadora.obtenerPasosFibonacci(Calculadora.n)));

        Ciclomotor ciclomotorDeAdri = new Ciclomotor("Wolksvagen", 500, 50, 2, true);
        ciclomotorDeAdri.acelerar();
        ciclomotorDeAdri.acelerar();
        System.out.println(ciclomotorDeAdri);

        Camion camionDeAdri = new Camion("Mercedes", 2500, 600, 2, 2000);
        camionDeAdri.acelerar();
        camionDeAdri.acelerar();
        System.out.println(camionDeAdri);


    }
}
