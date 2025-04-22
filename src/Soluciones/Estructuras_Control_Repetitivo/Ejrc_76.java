package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

public class Ejrc_76 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de grupos: ");
        int g = t.nextInt();

        double sumaPromediosGrupos = 0;

        for (int grupo = 1; grupo <= g; grupo++) {
            System.out.println("\n--- Grupo " + grupo + " ---");
            System.out.print("Ingrese la cantidad de alumnos del grupo: ");
            int n = t.nextInt();

            double sumaPromediosAlumnos = 0;

            for (int alumno = 1; alumno <= n; alumno++) {
                System.out.println("\nAlumno " + alumno + ":");
                System.out.print("Ingrese el número de materias: ");
                int m = t.nextInt();

                double sumaMaterias = 0;

                for (int materia = 1; materia <= m; materia++) {
                    double sumaNotas = 0;

                    System.out.println("  Materia " + materia + ":");
                    for (int cal = 1; cal <= 3; cal++) {
                        System.out.print("    Ingrese calificación " + cal + ": ");
                        double nota = t.nextDouble();
                        sumaNotas += nota;
                    }

                    double promedioMateria = sumaNotas / 3;
                    sumaMaterias += promedioMateria;
                }

                double promedioAlumno = sumaMaterias / m;
                sumaPromediosAlumnos += promedioAlumno;
                System.out.printf("→ Promedio del alumno %d: %.2f\n", alumno, promedioAlumno);
            }

            double promedioGrupo = sumaPromediosAlumnos / n;
            sumaPromediosGrupos += promedioGrupo;
            System.out.printf("→ Promedio del grupo %d: %.2f\n", grupo, promedioGrupo);
        }

        double promedioGeneral = sumaPromediosGrupos / g;
        System.out.printf("\n=== Promedio general de todos los grupos: %.2f ===\n", promedioGeneral);
    }
}

