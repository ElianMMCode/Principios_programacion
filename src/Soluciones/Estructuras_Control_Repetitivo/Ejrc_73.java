package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

public class Ejrc_73 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Ingrese la fecha de corte (dd/mm/aaaa): ");
        String fechaCorte = t.nextLine();

        double sumaMaximosAgencias = 0;
        int cantidadAgenciasNacionales = 0;

        String continuarEstado;
        do {
            System.out.print("\nCódigo del Estado: ");
            String codEstado = t.nextLine();

            double montoTotalEstado = 0;
            double mayorDeudaAgencia = -1, menorDeudaAgencia = Double.MAX_VALUE;
            String codAgenciaMayor = "", codAgenciaMenor = "";

            String continuarAgencia;
            do {
                System.out.print("\nCódigo de la Agencia: ");
                String codAgencia = t.nextLine();

                int clientesPendientes = 0;
                double deudaTotalAgencia = 0;
                double deudaClienteMax = -1;
                String codClienteMax = "";

                String continuarCliente;
                do {
                    System.out.print("\nCódigo del Cliente: ");
                    String codCliente = t.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = t.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = t.nextLine();

                    int pagaresPendientes = 0;
                    double deudaCliente = 0;

                    String continuarPagare;
                    do {
                        System.out.print("Número del pagaré: ");
                        String numPagare = t.nextLine();
                        System.out.print("Fecha de vencimiento (dd/mm/aaaa): ");
                        String fechaPagare = t.nextLine();
                        System.out.print("Monto: ");
                        double monto = Double.parseDouble(t.nextLine());

                        if (fechaPagare.compareTo(fechaCorte) <= 0) {
                            pagaresPendientes++;
                            deudaCliente += monto;
                            deudaTotalAgencia += monto;
                            montoTotalEstado += monto;
                        }

                        System.out.print("¿Agregar otro pagaré? (s/n): ");
                        continuarPagare = t.nextLine();

                    } while (continuarPagare.equalsIgnoreCase("s"));

                    if (pagaresPendientes > 0) {
                        clientesPendientes++;
                        System.out.println("\n--- Recibo Cliente ---");
                        System.out.println("Código: " + codCliente);
                        System.out.println("Nombre: " + nombre);
                        System.out.println("Dirección: " + direccion);
                        System.out.println("Estado: " + codEstado);
                        System.out.println("Agencia: " + codAgencia);
                        System.out.println("Pagarés vencidos: " + pagaresPendientes);
                        System.out.printf("Monto total: %.2f\n", deudaCliente);
                    }

                    if (deudaCliente > deudaClienteMax) {
                        deudaClienteMax = deudaCliente;
                        codClienteMax = codCliente;
                    }

                    System.out.print("¿Agregar otro cliente? (s/n): ");
                    continuarCliente = t.nextLine();

                } while (continuarCliente.equalsIgnoreCase("s"));

                System.out.println("\n--- Resumen Agencia ---");
                System.out.println("Código Agencia: " + codAgencia);
                System.out.println("Código Estado: " + codEstado);
                System.out.println("Clientes con pagarés pendientes: " + clientesPendientes);
                System.out.printf("Monto total adeudado: %.2f\n", deudaTotalAgencia);
                System.out.println("Cliente con mayor deuda: " + codClienteMax);

                if (deudaTotalAgencia > mayorDeudaAgencia) {
                    mayorDeudaAgencia = deudaTotalAgencia;
                    codAgenciaMayor = codAgencia;
                }
                if (deudaTotalAgencia < menorDeudaAgencia) {
                    menorDeudaAgencia = deudaTotalAgencia;
                    codAgenciaMenor = codAgencia;
                }

                sumaMaximosAgencias += deudaClienteMax;
                cantidadAgenciasNacionales++;

                System.out.print("¿Agregar otra agencia? (s/n): ");
                continuarAgencia = t.nextLine();

            } while (continuarAgencia.equalsIgnoreCase("s"));

            System.out.println("\n--- Resumen Estado ---");
            System.out.println("Código Estado: " + codEstado);
            System.out.printf("Monto total adeudado en el estado: %.2f\n", montoTotalEstado);
            System.out.println("Agencia con mayor deuda: " + codAgenciaMayor);
            System.out.println("Agencia con menor deuda: " + codAgenciaMenor);

            System.out.print("¿Agregar otro estado? (s/n): ");
            continuarEstado = t.nextLine();

        } while (continuarEstado.equalsIgnoreCase("s"));

        double promedioMaximos = (cantidadAgenciasNacionales > 0) ?
                sumaMaximosAgencias / cantidadAgenciasNacionales : 0;

        System.out.println("\n--- Resumen Nacional ---");
        System.out.printf("Monto promedio de los máximos adeudados por agencias: %.2f\n", promedioMaximos);
    }
}
