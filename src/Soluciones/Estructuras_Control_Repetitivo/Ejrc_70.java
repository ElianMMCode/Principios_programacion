package Soluciones.Estructuras_Control_Repetitivo;

       import java.util.Scanner;

        public class Ejrc_70 {

            public static void main(String[] args) {
                Scanner t = new Scanner(System.in);

                double tempMax, tempMin;
                int diasValidos = 0;
                int errores = 0;
                double sumaMax = 0;
                double sumaMin = 0;
                int totalRegistros = 0;

                System.out.println("Ingrese la temperatura máxima y mínima (0 0 para finalizar):");

                while (true) {
                    System.out.print("Temperatura máxima: ");
                    tempMax = t.nextDouble();

                    System.out.print("Temperatura mínima: ");
                    tempMin = t.nextDouble();

                    if (tempMax == 0 && tempMin == 0) {
                        break;
                    }

                    totalRegistros++;

                    if (tempMax >= 14 && tempMax <= 30 && tempMin >= 14 && tempMin <= 30) {
                        diasValidos++;
                        sumaMax += tempMax;
                        sumaMin += tempMin;
                    } else {
                        errores++;
                    }
                }

                double mediaMax = (diasValidos > 0) ? sumaMax / diasValidos : 0;
                double mediaMin = (diasValidos > 0) ? sumaMin / diasValidos : 0;

                double porcentajeErrores = (totalRegistros > 0) ? ((double) errores / totalRegistros) * 100 : 0;

                System.out.println("\n--- Resultados ---");
                System.out.println("g. Días válidos registrados: " + diasValidos);
                System.out.printf("h. Media máxima: %.2f °C\n", mediaMax);
                System.out.printf("   Media mínima: %.2f °C\n", mediaMin);
                System.out.println("i. Número de errores: " + errores);
                System.out.printf("j. Porcentaje de errores: %.2f%%\n", porcentajeErrores);
            }
        }

