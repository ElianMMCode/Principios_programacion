package Estructuras_Control_Repetitivo;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Escriba un algoritmo para producir una tabla de conversión de temperatura para convertir valores
en grados Fahrenheit a su equivalente en grados Celsius, grados Kelvin y grados Rankine.
Las ecuaciones de conversión son:
C = 5(F-32) / 9
R = F + 459.67
K = C + 273.15
Donde F = temperatura en grados Fahrenheit
C = temperatura en grados Celsius
R = temperatura en grados Rankine
K = temperatura en grados Kelvin
Haga que el programa imprima encabezados para cada columna en la tabla.
Datos muestra:
de 28 a 54 oF en intervalos de 1 oF
de 450 a 950 oF en intervalos de 50 oF
de –50 a 250 oF en intervalos de 10 oF
*/
public class Ejrc_48_Conversion_temperaturas {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");

        System.out.println("RANGOS DE TEMPERATURA");
        System.out.println("======================");
        System.out.println("Primera temperatura en F");
        double f = t.nextDouble();
        System.out.println("Segunda temperatura en F");
        double f2 = t.nextDouble();
        System.out.println("Ingrese el intervalo de F");
        int intr = t.nextInt();


        //tabla
        System.out.println("Fahrenheit   |Celsius      |Rankine     |Kelvin");
        System.out.println("------------------------------------------------------");
        for (double i = f; i <= f2; i += intr) {
            double c = 5 * (f - 32) / 9;
            double r = f + 459.67;
            double k = c + 273.15;
            f = i;
            System.out.println(dc.format(f) + "     | " + dc.format(c) + "     | " + dc.format(r) + "     | " + dc.format(k) + "     | ");
            System.out.println("------------------------------------------------------");
        }


    }
}
