package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

public class Ejrc_78 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        final double PVP1 = 15000;
        final double PVP2 = 18000;
        final double PVP3 = 21000;

        System.out.print("Ingrese la cantidad de sucursales: ");
        int totalSucursales = t.nextInt();
        t.nextLine(); // limpiar

        int sucursalesCumplenMeta = 0;

        for (int i = 1; i <= totalSucursales; i++) {
            System.out.print("\nCódigo de la sucursal (2 dígitos): ");
            int codSucursal = t.nextInt();
            t.nextLine(); // limpiar

            System.out.print("Descripción de la sucursal: ");
            String descripcion = t.nextLine();

            System.out.print("Monto de venta esperado: ");
            double ventaEsperada = t.nextDouble();

            System.out.print("Cantidad de puntos de venta de esta sucursal: ");
            int puntosVenta = t.nextInt();

            double sumaVentasSucursal = 0;
            double mayorComision = 0;
            int codPVMayorComision = 0;

            for (int j = 1; j <= puntosVenta; j++) {
                System.out.print("\nCódigo del punto de venta (4 dígitos): ");
                int codPV = t.nextInt();

                System.out.println("Unidades vendidas por producto:");
                System.out.print("  Producto 1: ");
                int u1 = t.nextInt();
                System.out.print("  Producto 2: ");
                int u2 = t.nextInt();
                System.out.print("  Producto 3: ");
                int u3 = t.nextInt();

                int totalUnidades = u1 + u2 + u3;

                double totalVentaBruta = (u1 * PVP1) + (u2 * PVP2) + (u3 * PVP3);
                double comision = totalVentaBruta * 0.10;
                double ventaNeta = totalVentaBruta - comision;

                sumaVentasSucursal += totalVentaBruta;

                int menor = u1;
                int codMenor = 1;
                if (u2 < menor) {
                    menor = u2;
                    codMenor = 2;
                }
                if (u3 < menor) {
                    codMenor = 3;
                }

                if (comision > mayorComision) {
                    mayorComision = comision;
                    codPVMayorComision = codPV;
                }

                System.out.println("\n--- Punto de Venta ---");
                System.out.println("Código: " + codPV);
                System.out.println("Total unidades vendidas: " + totalUnidades);
                System.out.printf("Monto neto de venta: %.2f\n", ventaNeta);
                System.out.printf("Comisión total pagada: %.2f\n", comision);
                System.out.println("Producto menos vendido: " + codMenor);
            }

            double porcentajeCumplimiento = (sumaVentasSucursal / ventaEsperada) * 100;

            if (sumaVentasSucursal >= ventaEsperada) {
                sucursalesCumplenMeta++;
            }

            System.out.println("\n--- Resumen Sucursal ---");
            System.out.println("Código: " + codSucursal);
            System.out.println("Descripción: " + descripcion);
            System.out.printf("Total vendido: %.2f\n", sumaVentasSucursal);
            System.out.printf("Porcentaje alcanzado: %.2f%%\n", porcentajeCumplimiento);
            System.out.println("Punto de venta con mayor comisión: " + codPVMayorComision + " (comisión: " + mayorComision + ")");
        }

        double porcentajeSucursalesExitosas = (double) sucursalesCumplenMeta / totalSucursales * 100;

        System.out.println("\n--- Informe Nacional ---");
        System.out.printf("Porcentaje de sucursales que alcanzaron la meta: %.2f%%\n", porcentajeSucursalesExitosas);
    }
}

