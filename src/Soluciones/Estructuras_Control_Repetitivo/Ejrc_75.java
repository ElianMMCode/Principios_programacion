package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

public class Ejrc_75 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        final int totalPersonas = 5;
        final int totalBasculas = 10;

        for (int persona = 1; persona <= totalPersonas; persona++) {
            System.out.print("Ingrese el peso anterior de la persona " + persona + ": ");
            double pesoAnterior = t.nextDouble();

            double sumaPesos = 0;
            System.out.println("Ingrese los 10 pesos actuales de la persona " + persona + ":");

            for (int i = 1; i <= totalBasculas; i++) {
                System.out.print("Peso en báscula " + i + ": ");
                double pesoActual = t.nextDouble();
                sumaPesos += pesoActual;
            }

            double promedioActual = sumaPesos / totalBasculas;
            double diferencia = promedioActual - pesoAnterior;

            System.out.println("\n--- Resultado para persona " + persona + " ---");
            if (diferencia > 0) {
                System.out.printf("SUBIÓ %.2f kilos.\n", diferencia);
            } else if (diferencia < 0) {
                System.out.printf("BAJÓ %.2f kilos.\n", Math.abs(diferencia));//math.abs convierte el numero a positivo
            } else {
                System.out.println("MANTUVO su peso.");
            }

            System.out.println("---------------------------------------");
        }
    }
}

