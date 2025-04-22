package Soluciones.Vectores;

import java.util.Scanner;

public class Ejrc_82 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int totalAlumnos = t.nextInt();
        t.nextLine(); // Limpiar

        String[] estudiantes = new String[totalAlumnos];
        double[][] notas = new double[totalAlumnos][5];
        double[] promedios = new double[totalAlumnos];
        double sumaPromedios = 0;

        for (int i = 0; i < totalAlumnos; i++) {
            System.out.print("\nIngrese el nombre del alumno " + (i + 1) + ": ");
            estudiantes[i] = t.nextLine();

            double sumaNotas = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese la nota " + (j + 1) + " de " + estudiantes[i] + ": ");
                notas[i][j] = t.nextDouble();
                sumaNotas += notas[i][j];
            }
            t.nextLine(); // limpiar

            promedios[i] = sumaNotas / 5;
            sumaPromedios += promedios[i];
        }

        double promedioClase = sumaPromedios / totalAlumnos;

        System.out.println("\nNúmero\tNombre\t\tPromedio");
        for (int i = 0; i < totalAlumnos; i++) {
            System.out.printf("%d\t%-12s\t%.2f\n", (i + 1), estudiantes[i], promedios[i]);
        }

        int menor = 0, mayor = 0;
        for (int i = 0; i < totalAlumnos; i++) {
            if (promedios[i] < promedioClase) {
                menor++;
            } else if (promedios[i] > promedioClase) {
                mayor++;
            }
        }

        System.out.printf("\nPromedio de la clase: %.2f\n", promedioClase);
        System.out.println("Alumnos con definitiva menor al promedio: " + menor);
        System.out.println("Alumnos con definitiva mayor al promedio: " + mayor);
    }
}

