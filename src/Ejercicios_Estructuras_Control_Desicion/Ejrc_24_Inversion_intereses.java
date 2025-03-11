package Ejercicios_Estructuras_Control_Desicion;

import java.util.Scanner;

public class Ejrc_24_Inversion_intereses {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("GANANCIA INTERESES");
        System.out.println("Ingrese su inversion");
        double inv = teclado.nextDouble();
        System.out.println("Intereses de la inversion");
        double interes = teclado.nextDouble() / 100;

        double ganancia = inv * interes;

        if (ganancia > 7000) {

            System.out.println("Sus ganancias seran de:");
            System.out.println(ganancia);
            System.out.println("Total Dinero");
            double total = inv + ganancia;
            System.out.println(total);
        } else {
            System.out.println("Ganancias por debajo de 7000");
        }


    }


}
