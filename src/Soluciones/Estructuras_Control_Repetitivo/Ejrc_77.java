package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

public class Ejrc_77 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        final int totalEstados = 5;

        String estadoMayor = "", estadoMenor = "";
        int poblacionMayor = Integer.MIN_VALUE;
        int poblacionMenor = Integer.MAX_VALUE;

        int totalHabitantes5Estados = 0;

        System.out.print("Ingrese el total de habitantes del país: ");
        int totalPais = t.nextInt();
        t.nextLine(); // limpiar

        for (int i = 1; i <= totalEstados; i++) {
            System.out.print("\nNombre del Estado " + i + ": ");
            String nombreEstado = t.nextLine();

            System.out.print("Cantidad de municipios en " + nombreEstado + ": ");
            int m = t.nextInt();

            int sumaMunicipios = 0;

            for (int j = 1; j <= m; j++) {
                System.out.print("  Habitantes en municipio " + j + ": ");
                int habitantes = t.nextInt();
                sumaMunicipios += habitantes;
            }

            t.nextLine(); // limpiar
            System.out.println("→ Total habitantes en " + nombreEstado + ": " + sumaMunicipios);

            totalHabitantes5Estados += sumaMunicipios;

            if (sumaMunicipios > poblacionMayor) {
                poblacionMayor = sumaMunicipios;
                estadoMayor = nombreEstado;
            }

            if (sumaMunicipios < poblacionMenor) {
                poblacionMenor = sumaMunicipios;
                estadoMenor = nombreEstado;
            }
        }

        double promedioPorEstado = (double) totalHabitantes5Estados / totalEstados;
        double porcentaje5Estados = (double) totalHabitantes5Estados / totalPais * 100;

        System.out.println("\n--- Resultados Finales ---");
        System.out.println("a. Estado con mayor población: " + estadoMayor + " (" + poblacionMayor + " habitantes)");
        System.out.println("b. Estado con menor población: " + estadoMenor + " (" + poblacionMenor + " habitantes)");
        System.out.printf("c. Porcentaje que representan los 5 estados sobre el total nacional: %.2f%%\n", porcentaje5Estados);
        System.out.printf("d. Promedio de habitantes por Estado: %.2f\n", promedioPorEstado);
    }
}
