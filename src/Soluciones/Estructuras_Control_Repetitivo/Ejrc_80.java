package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

public class Ejrc_80 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estados: ");
        int numEstados = t.nextInt();

        int estadoConMayorPorcentaje = 0;
        double mayorPorcentajeProfDesemp = 0;

        for (int e = 1; e <= numEstados; e++) {
            System.out.print("\nCódigo del estado (2 dígitos): ");
            int codEstado = t.nextInt();

            System.out.print("Cantidad de ciudades en el estado: ");
            int numCiudades = t.nextInt();

            int totalProfesionales = 0;
            int profesionalesDesemp = 0;

            for (int c = 1; c <= numCiudades; c++) {
                System.out.print("\nCódigo de la ciudad (4 dígitos, termina en " + codEstado + "): ");
                int codCiudad = t.nextInt();

                System.out.print("Cantidad de municipios en la ciudad: ");
                int numMunicipios = t.nextInt();

                int totalCiudad = 0;
                int totalCumplenCiudad = 0;

                for (int m = 1; m <= numMunicipios; m++) {
                    System.out.print("\nCódigo del municipio (6 dígitos): ");
                    int codMunicipio = t.nextInt();

                    System.out.print("Cantidad de personas (>18 años) en el municipio: ");
                    int numPersonas = t.nextInt();

                    int contadorCumplen = 0;

                    for (int p = 1; p <= numPersonas; p++) {
                        System.out.print("Edad: ");
                        int edad = t.nextInt();

                        System.out.print("Nivel educativo (N/B/S/P): ");
                        char nivel = t.next().toUpperCase().charAt(0);

                        System.out.print("Situación laboral (D/E): ");
                        char situacion = t.next().toUpperCase().charAt(0);

                        totalCiudad++;

                        if (nivel == 'P' && situacion == 'D') {
                            profesionalesDesemp++;
                        }
                        if (nivel == 'P') {
                            totalProfesionales++;
                        }

                        if (edad > 25 && nivel == 'N' && situacion == 'D') {
                            contadorCumplen++;
                        }
                    }

                    System.out.println("→ Municipio " + codMunicipio + ": " + contadorCumplen + " personas con las 3 condiciones.");
                    totalCumplenCiudad += contadorCumplen;
                }

                double porcentajeCiudad = (double) totalCumplenCiudad / totalCiudad * 100;

                if (porcentajeCiudad > 50) {
                    System.out.println("⚠ La ciudad " + codCiudad + " supera el 50% de personas con las 3 condiciones.");
                }
            }

            double porcentajeProfDesemp = (totalProfesionales > 0)
                    ? (double) profesionalesDesemp / totalProfesionales * 100
                    : 0;

            if (porcentajeProfDesemp > mayorPorcentajeProfDesemp) {
                mayorPorcentajeProfDesemp = porcentajeProfDesemp;
                estadoConMayorPorcentaje = codEstado;
            }
        }

        System.out.println("\n--- Resultado Nacional ---");
        System.out.println("Estado con mayor porcentaje de profesionales desempleados: " + estadoConMayorPorcentaje);
        System.out.printf("Porcentaje: %.2f%%\n", mayorPorcentajeProfDesemp);
    }
}

