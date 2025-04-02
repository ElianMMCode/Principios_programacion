package Soluciones.Estructuras_Control_Repetitivo;
import java.util.Scanner;

public class Ejrc_62_Actividad_empresa {
        public static void main(){
            Scanner sc = new Scanner(System.in);

            int NUM_ACTIVIDADES = 5;
            int NUM_LOCALIZACIONES = 4;

            int totalEmpresas = 0;
            int totalAgricolas = 0;
            int totalMineras = 0;
            int totalMinerasSur = 0;

            int[] empresasPorActividad = new int[NUM_ACTIVIDADES];
            int[] trabajadoresPorActividad = new int[NUM_ACTIVIDADES];
            int[] industriasPorLocalizacion = new int[NUM_LOCALIZACIONES];

            String continuar;

            do {
                System.out.println("\nIngrese datos de la empresa:");

                System.out.print("Actividad (1=Agro, 2=Ind, 3=Min, 4=Pesq, 5=Otra): ");
                int actividad = sc.nextInt();

                System.out.print("Localización (1=Norte, 2=Sur, 3=Este, 4=Oeste): ");
                int localizacion = sc.nextInt();

                System.out.print("Número de trabajadores: ");
                int trabajadores = sc.nextInt();

                totalEmpresas++;

                // Índices
                int idxActividad = actividad - 1;
                int idxLocalizacion = localizacion - 1;

                empresasPorActividad[idxActividad]++;
                trabajadoresPorActividad[idxActividad] += trabajadores;

                if (actividad == 1) {
                    totalAgricolas++;
                }

                if (actividad == 3) {
                    totalMineras++;
                    if (localizacion == 2) {
                        totalMinerasSur++;
                    }
                }

                if (actividad == 2) {
                    industriasPorLocalizacion[idxLocalizacion]++;
                }

                System.out.print("¿Desea ingresar otra empresa? (s/n): ");
                continuar = sc.next();
            } while (continuar.equalsIgnoreCase("s"));

            System.out.println("\n--- Resultados ---");

            //Porcentaje de empresas agrícolas
            double porcentajeAgricolas = (totalEmpresas > 0) ? (totalAgricolas * 100.0 / totalEmpresas) : 0;
            System.out.printf("Porcentaje de empresas agrícolas: %.2f%%\n", porcentajeAgricolas);

            //Porcentaje de mineras del sur
            if (totalMineras > 0) {
                double porcentajeMinerasSur = (totalMinerasSur * 100.0 / totalMineras);
                System.out.printf("Porcentaje de empresas mineras del sur: %.2f%%\n", porcentajeMinerasSur);
            } else {
                System.out.println("No hay empresas mineras registradas.");
            }

            //Promedio de trabajadores por tipo de actividad
            String[] nombresActividades = {"Agrícola", "Industrial", "Minera", "Pesquera", "Otra"};
            for (int i = 0; i < NUM_ACTIVIDADES; i++) {
                if (empresasPorActividad[i] > 0) {
                    double promedio = trabajadoresPorActividad[i] * 1.0 / empresasPorActividad[i];
                    System.out.printf("Promedio de trabajadores (%s): %.2f\n", nombresActividades[i], promedio);
                } else {
                    System.out.printf("No hay empresas registradas en actividad %s.\n", nombresActividades[i]);
                }
            }

            //Localización con más industrias
            int maxIndustriales = 0;
            int locMaxIndustriales = 0;
            for (int i = 0; i < NUM_LOCALIZACIONES; i++) {
                if (industriasPorLocalizacion[i] > maxIndustriales) {
                    maxIndustriales = industriasPorLocalizacion[i];
                    locMaxIndustriales = i;
                }
            }

            String[] nombresLocalizaciones = {"Norte", "Sur", "Este", "Oeste"};
            System.out.println("Localización con más empresas industriales: " + nombresLocalizaciones[locMaxIndustriales]);


        }
    }