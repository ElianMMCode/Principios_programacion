package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

public class Ejrc_71 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int totalNinos = 0;
        int tachira = 0, distritoCapital = 0;
        int grupo1 = 0, grupo2 = 0, grupo3 = 0, grupo4 = 0;
        int totalNinas = 0, totalNinitos = 0;

        System.out.println("Ingrese los datos del niño (escriba 'fin' como nombre del orfanato para terminar):");

        while (true) {
            System.out.print("\nNombre del orfanato: ");
            String orfanato = t.nextLine();
            if (orfanato.equalsIgnoreCase("fin")) break;

            System.out.print("Estado del orfanato: ");
            String estado = t.nextLine();

            System.out.print("Sexo (M o F): ");
            String sexo = t.nextLine().trim().toUpperCase();

            System.out.print("Edad del niño: ");
            int edad = Integer.parseInt(t.nextLine());

            totalNinos++;

            if (estado.equalsIgnoreCase("Táchira")) {
                tachira++;
            } else if (estado.equalsIgnoreCase("Distrito Capital")) {
                distritoCapital++;
            }

            if (edad < 1) {
                grupo1++;
            } else if (edad <= 3) {
                grupo2++;
            } else if (edad <= 6) {
                grupo3++;
            } else {
                grupo4++;
            }

            if (sexo.equals("M")) {
                totalNinitos++;
            } else if (sexo.equals("F")) {
                totalNinas++;
            }
        }

        double porcentajeTachira = (totalNinos > 0) ? (double) tachira / totalNinos * 100 : 0;
        double porcentajeDistrito = (totalNinos > 0) ? (double) distritoCapital / totalNinos * 100 : 0;
        double porcentajeNinitos = (totalNinos > 0) ? (double) totalNinitos / totalNinos * 100 : 0;
        double porcentajeNinas = (totalNinos > 0) ? (double) totalNinas / totalNinos * 100 : 0;

        System.out.println("\n--- Resultados UNICEF ---");
        System.out.printf("a. Porcentaje de huérfanos en Táchira: %.2f%%\n", porcentajeTachira);
        System.out.printf("   Porcentaje de huérfanos en Distrito Capital: %.2f%%\n", porcentajeDistrito);

        System.out.println("b. Número de huérfanos por grupo de edad:");
        System.out.println("   Grupo 1 (<1 año): " + grupo1);
        System.out.println("   Grupo 2 (1-3 años): " + grupo2);
        System.out.println("   Grupo 3 (4-6 años): " + grupo3);
        System.out.println("   Grupo 4 (>6 años): " + grupo4);

        System.out.println("c. Cantidad por sexo:");
        System.out.println("   Niños: " + totalNinitos + " (" + String.format("%.2f", porcentajeNinitos) + "%)");
        System.out.println("   Niñas: " + totalNinas + " (" + String.format("%.2f", porcentajeNinas) + "%)");
    }
}
