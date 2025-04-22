package Soluciones.Estructuras_Control_Repetitivo;
import java.util.Scanner;

public class Ejrc_74 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de obreros: ");
        int totalObreros = t.nextInt();
        t.nextLine(); // Limpiar buffer

        System.out.print("Ingrese la meta semanal de bloques por obrero: ");
        int metaSemanal = t.nextInt();
        t.nextLine(); // Limpiar buffer

        int obrerosQueCumplieron = 0;
        int produccionTotalBloquera = 0;
        String mejorObrero = "";
        int mayorProduccion = -1;

        for (int i = 1; i <= totalObreros; i++) {
            System.out.print("\nNombre del obrero " + i + ": ");
            String nombre = t.nextLine();

            int sumaSemanal = 0;

            for (int dia = 1; dia <= 6; dia++) {
                System.out.print("  Bloques producidos el día " + dia + ": ");
                int produccion = t.nextInt();
                sumaSemanal += produccion;
            }
            t.nextLine(); // Limpiar buffer

            double porcentaje = (double) sumaSemanal / metaSemanal * 100;
            produccionTotalBloquera += sumaSemanal;

            System.out.println("\n--- Resumen del obrero ---");
            System.out.println("Nombre: " + nombre);
            System.out.println("Total semanal: " + sumaSemanal);
            System.out.printf("Porcentaje respecto a la meta: %.2f%%\n", porcentaje);

            if (sumaSemanal >= metaSemanal) {
                obrerosQueCumplieron++;
            }

            if (sumaSemanal > mayorProduccion) {
                mayorProduccion = sumaSemanal;
                mejorObrero = nombre;
            }
        }

        // Cálculos generales
        double porcentajeCumplieron = (double) obrerosQueCumplieron / totalObreros * 100;
        double promedioProduccion = (double) produccionTotalBloquera / totalObreros;

        // Resultados finales
        System.out.println("\n--- Resumen General de la Bloquera ---");
        System.out.printf("Porcentaje de obreros que cumplieron o superaron la meta: %.2f%%\n", porcentajeCumplieron);
        System.out.println("Obrero que más produjo: " + mejorObrero + " (" + mayorProduccion + " bloques)");
        System.out.printf("Promedio de producción semanal: %.2f bloques\n", promedioProduccion);
    }
}
