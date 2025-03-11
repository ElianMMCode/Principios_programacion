package Ejercicios_Estructuras_Control_Desicion;

import java.util.Scanner;

public class Ejrc_28_Compra_piezas_credito {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese monto total de la compra");
        double monto = t.nextDouble();


        if (monto > 500000) {
            System.out.println("==============================");
            double inv = monto * 0.55;
            System.out.println("Inversion = " + inv);
            double banco = monto * 0.3;
            System.out.println("Prestamo al Banco = " + banco);
            double empresa = monto * 0.15;
            System.out.println("Credito fabricante = " + empresa);
            double interes = empresa * 0.7;
            System.out.println("Intereses crefito fabricante = " + interes);

        } else if (monto < 500000) {
            System.out.println("==============================");
            double inv = monto * 0.70;
            System.out.println("Inversion = " + inv);
            double empresa = monto * 0.3;
            System.out.println("Credito fabricante = " + empresa);
            double interes = empresa * 0.7;
            System.out.println("Intereses crefito fabricante = " + interes);
        }


    }


}
