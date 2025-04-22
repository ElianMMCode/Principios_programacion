package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

public class Ejrc_65_Calculo_sueldos {
    public static void main() {
        Scanner t = new Scanner(System.in);

        String nombre, cedula, tipoEmpleado;
        int hijos, diasAsistidos;
        double sueldoBasico;

        System.out.print("Nombre del empleado: ");
        nombre = t.nextLine();

        System.out.print("Cédula del empleado: ");
        cedula = t.nextLine();

        System.out.print("Tipo de empleado (obrero/administrativo/ejecutivo): ");
        tipoEmpleado = t.nextLine().toLowerCase();

        switch (tipoEmpleado) {
            case "obrero":
                sueldoBasico = 100000;
                break;
            case "administrativo":
                sueldoBasico = 165500;
                break;
            case "ejecutivo":
                sueldoBasico = 250000;
                break;
            default:
                System.out.println("Tipo de empleado inválido.");
                return;
        }

        System.out.print("Cantidad de hijos (máximo 5): ");
        hijos = t.nextInt();
        if (hijos > 5) hijos = 5;  // máximo 5 hijos

        System.out.print("Días asistidos este mes (de 30): ");
        diasAsistidos = t.nextInt();

        // --- ASIGNACIONES ---
        double aportePorHijos = hijos * (0.10 * sueldoBasico);
        double aporteAsistencia = (diasAsistidos > 28) ? 0.05 * sueldoBasico : 0;

        // --- DEDUCCIONES ---
        double deduccionCaja = 0.10 * sueldoBasico;
        double deduccionSeguro = 0.02 * sueldoBasico;

        // --- SUELDO NETO ---
        double sueldoNeto = sueldoBasico + aportePorHijos + aporteAsistencia - deduccionCaja - deduccionSeguro;

        // --- RESULTADO ---
        System.out.println("\n--- Registro del Empleado ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println("Tipo: " + tipoEmpleado.toUpperCase());
        System.out.printf("Sueldo Básico: $%.2f\n", sueldoBasico);
        System.out.printf("Aporte por Hijos: $%.2f\n", aportePorHijos);
        System.out.printf("Aporte por Asistencia: $%.2f\n", aporteAsistencia);
        System.out.printf("Deducción Caja de Ahorros: $%.2f\n", deduccionCaja);
        System.out.printf("Deducción Seguro Social: $%.2f\n", deduccionSeguro);
        System.out.printf("Sueldo Neto: $%.2f\n", sueldoNeto);
    }
}
