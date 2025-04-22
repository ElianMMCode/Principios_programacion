package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

public class Ejrc_81 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estados: ");
        int totalEstados = t.nextInt();
        t.nextLine(); // limpiar
        for (int est = 1; est <= totalEstados; est++) {
            System.out.print("\nCódigo del estado (2 dígitos): ");
            int codEstado = t.nextInt();
            t.nextLine();
            System.out.print("Nombre del estado: ");
            String nombreEstado = t.nextLine();

            System.out.print("Cantidad de ciudades en este estado: ");
            int numCiudades = t.nextInt();
            t.nextLine();

            double montoNetoEstado = 0;
            int ciudadesNoCumplen = 0;
            int ciudades40a60Porc = 0;

            for (int c = 1; c <= numCiudades; c++) {
                System.out.print("\nCódigo de la ciudad (3 dígitos, termina en " + codEstado + "): ");
                int codCiudad = t.nextInt();
                t.nextLine();
                System.out.print("Nombre de la ciudad: ");
                String nombreCiudad = t.nextLine();

                System.out.print("Cantidad de unidades esperadas para esta ciudad: ");
                int unidadesEsperadas = t.nextInt();

                System.out.print("Cantidad de canales de comercialización: ");
                int canales = t.nextInt();

                int totalUnidadesCiudad = 0;
                double totalBrutoCiudad = 0;
                double comisionTienda = 0;
                double comisionCalle = 0;
                double mayorMontoNetoCanal = 0;
                int canalMayorNeto = 0;
                int vendedorMenorUnidades = Integer.MAX_VALUE;
                int vendedorMenorCod = 0;

                for (int canal = 1; canal <= canales; canal++) {
                    System.out.print("\nCódigo del canal de comercialización (4 dígitos): ");
                    int codCanal = t.nextInt();

                    System.out.print("Cantidad de vendedores en este canal: ");
                    int vendedores = t.nextInt();

                    double montoBrutoCanal = 0;

                    for (int v = 1; v <= vendedores; v++) {
                        System.out.print("Código del vendedor (5 dígitos): ");
                        int codVendedor = t.nextInt();

                        System.out.print("Unidades vendidas: ");
                        int unidades = t.nextInt();
                        System.out.print("Monto total de ventas: ");
                        double monto = t.nextDouble();

                        totalUnidadesCiudad += unidades;
                        totalBrutoCiudad += monto;
                        montoBrutoCanal += monto;

                        if (codVendedor / 1000 == 11) {
                            comisionTienda += monto * 0.10;
                        } else if (codVendedor / 1000 == 12) {
                            comisionCalle += monto * 0.15;
                        }

                        if (unidades < vendedorMenorUnidades) {
                            vendedorMenorUnidades = unidades;
                            vendedorMenorCod = codVendedor;
                        }
                    }

                    double netoCanal = montoBrutoCanal;

                    if (netoCanal > mayorMontoNetoCanal) {
                        mayorMontoNetoCanal = netoCanal;
                        canalMayorNeto = codCanal;
                    }
                }

                System.out.println("\n--- Resumen de la ciudad " + nombreCiudad + " ---");
                System.out.println("Código ciudad: " + codCiudad);
                System.out.println("Unidades vendidas: " + totalUnidadesCiudad);
                System.out.printf("Monto total bruto: %.2f\n", totalBrutoCiudad);
                System.out.printf("Comisión total vendedores tienda: %.2f\n", comisionTienda);
                System.out.printf("Comisión total vendedores calle: %.2f\n", comisionCalle);
                System.out.println("Canal con mayor venta neta: " + canalMayorNeto);
                System.out.println("Vendedor con menor unidades: " + vendedorMenorCod);

                montoNetoEstado += totalBrutoCiudad;

                if (totalUnidadesCiudad < unidadesEsperadas) {
                    ciudadesNoCumplen++;
                }

                double exceso = totalUnidadesCiudad - unidadesEsperadas;
                double porcentajeExceso = (exceso / unidadesEsperadas) * 100;
                if (porcentajeExceso >= 40 && porcentajeExceso <= 60) {
                    ciudades40a60Porc++;
                }
            }

            double porcentajeNoCumplen = ((double) ciudadesNoCumplen / numCiudades) * 100;

            System.out.println("\n=== Resumen del Estado " + nombreEstado + " ===");
            System.out.println("Código del estado: " + codEstado);
            System.out.printf("Monto neto vendido en el estado: %.2f\n", montoNetoEstado);
            System.out.printf("Porcentaje de ciudades que no cumplieron meta: %.2f%%\n", porcentajeNoCumplen);
            System.out.println("Cantidad de ciudades que superaron entre 40% y 60% la meta: " + ciudades40a60Porc);
        }
    }
}
