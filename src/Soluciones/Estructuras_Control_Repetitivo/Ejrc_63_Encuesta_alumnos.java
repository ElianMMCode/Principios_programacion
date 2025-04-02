package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

public class Ejrc_63_Encuesta_alumnos {
    public static void main() {
        Scanner t = new Scanner(System.in);

        int totalEstudiantes = 0;
        int totalHombres = 0, totalMujeres = 0;
        int sumaEdadHombres = 0, sumaEdadMujeres = 0;
        int casados = 0, solteros = 0, otrosEstados = 0;
        int mujeresAdultas = 0;
        int hombresJovenes = 0;
        int hombresSolteros = 0, mujeresSolteras = 0;

        // Especialidades
        int especialidadSistemas = 0, especialidadDiseno = 0, especialidadContabilidad = 0;

        String continuar;

        do {
            System.out.println("\nIngrese datos del estudiante:");
            System.out.print("Edad: ");
            int edad = t.nextInt();
            t.nextLine();

            System.out.print("Sexo (M/F): ");
            String sexo = t.nextLine().toUpperCase();

            System.out.print("Estado civil (soltero/casado/otro): ");
            String estadoCivil = t.nextLine().toLowerCase();

            System.out.print("Especialidad (sistemas/diseno/contabilidad): ");
            String especialidad = t.nextLine().toLowerCase();

            totalEstudiantes++;

            // Promedios de edad
            if (sexo.equals("M")) {
                totalHombres++;
                sumaEdadHombres += edad;

                // hombres jóvenes
                if (edad > 17 && edad < 21) {
                    hombresJovenes++;
                }

                // hombres solteros
                if (estadoCivil.equals("soltero")) {
                    hombresSolteros++;
                }

            } else if (sexo.equals("F")) {
                totalMujeres++;
                sumaEdadMujeres += edad;

                // mujeres adultas
                if (edad >= 21) {
                    mujeresAdultas++;
                }

                // mujeres solteras
                if (estadoCivil.equals("soltero")) {
                    mujeresSolteras++;
                }
            }

            // Estado civil
            switch (estadoCivil) {
                case "soltero":
                    solteros++;
                    break;
                case "casado":
                    casados++;
                    break;
                default:
                    otrosEstados++;
            }

            // Especialidades
            switch (especialidad) {
                case "sistemas":
                    especialidadSistemas++;
                    break;
                case "diseno":
                    especialidadDiseno++;
                    break;
                case "contabilidad":
                    especialidadContabilidad++;
                    break;
                default:
                    System.out.println("Especialidad no reconocida.");
            }

            System.out.print("¿Desea ingresar datos de otro estudiante? (s/n): ");
            continuar = t.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\n--- ESTADÍSTICAS ---");

        // Promedio edad mujeres
        if (totalMujeres > 0) {
            System.out.printf("a. Promedio edad mujeres: %.2f\n", (double) sumaEdadMujeres / totalMujeres);
        } else {
            System.out.println("a. No se ingresaron mujeres.");
        }

        //  Promedio edad hombres
        if (totalHombres > 0) {
            System.out.printf("b. Promedio edad hombres: %.2f\n", (double) sumaEdadHombres / totalHombres);
        } else {
            System.out.println("b. No se ingresaron hombres.");
        }

        // Total hombres y mujeres
        System.out.println("c. Hombres: " + totalHombres + " | Mujeres: " + totalMujeres);

        // Porcentaje por estado civil
        System.out.printf("d. Solteros: %.2f%% | Casados: %.2f%% | Otros: %.2f%%\n",
                (solteros * 100.0 / totalEstudiantes),
                (casados * 100.0 / totalEstudiantes),
                (otrosEstados * 100.0 / totalEstudiantes));

        // Cantidad por especialidad y porcentaje
        System.out.printf("e. Sistemas: %d (%.2f%%), Diseño: %d (%.2f%%), Contabilidad: %d (%.2f%%)\n",
                especialidadSistemas, (especialidadSistemas * 100.0 / totalEstudiantes),
                especialidadDiseno, (especialidadDiseno * 100.0 / totalEstudiantes),
                especialidadContabilidad, (especialidadContabilidad * 100.0 / totalEstudiantes));

        //  Mujeres adultas
        System.out.printf("f. Mujeres adultas (21+): %.2f%%\n",
                totalMujeres > 0 ? (mujeresAdultas * 100.0 / totalMujeres) : 0);

        //  Hombres jóvenes
        System.out.printf("g. Hombres jóvenes (18-20): %.2f%%\n",
                totalHombres > 0 ? (hombresJovenes * 100.0 / totalHombres) : 0);

        //Hombres y mujeres solteros
        System.out.println("h. Hombres solteros: " + hombresSolteros + " | Mujeres solteras: " + mujeresSolteras);
        }


    }

