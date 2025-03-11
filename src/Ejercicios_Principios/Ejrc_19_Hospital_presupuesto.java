package Ejercicios_Principios;

import java.util.Scanner;

public class Ejrc_19_Hospital_presupuesto {
    public static void main(String[] args) {
        int presupuesto;
        Scanner teclado = new Scanner(System.in);

        System.out.println("REPARTICION PRESUPUESTO");
        System.out.println("<><><><><><><><><><><><>");
        System.out.println("Ingrese el monto del presupuesto obtenido");
        presupuesto = teclado.nextInt();


        int ginecologia = (int) (presupuesto * 0.4);
        int traumatologia = (int) (presupuesto * 0.3);
        int pediatria = (int) (presupuesto * 0.3);


        System.out.println("<><><><><><><><><><><><>");
        System.out.println("Presupuesto Ginecologia: " + ginecologia);
        System.out.println("Presupuesto Traumatologia: " + traumatologia);
        System.out.println("Presupuesto Pediatria: " + pediatria);
    }
}
