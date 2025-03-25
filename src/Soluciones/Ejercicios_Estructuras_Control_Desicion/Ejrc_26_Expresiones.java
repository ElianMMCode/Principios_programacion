package Soluciones.Ejercicios_Estructuras_Control_Desicion;

import java.util.Scanner;
/*
26. Dados los datos A, B, C y D que representan números enteros; escriba un algoritmo que calcule el
resultado de las siguientes expresiones:
Si D=0 (A-C)2
Si D>0 (A-B )3
       -------
          D
 */

public class Ejrc_26_Expresiones {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("EXPRESIÓN");
        System.out.println("Valor de A");
        int a = t.nextInt();
        System.out.println("Valor de B");
        int b = t.nextInt();
        System.out.println("Valor de C");
        int c = t.nextInt();
        System.out.println("Valor de D");
        int d = t.nextInt();


        //Calculo expresion

        if (d == 0) {
            int resultado = (int) Math.pow((a - c), 2);
            System.out.println("(A-C)^2= " + resultado);

        } else if (d > 0) {
            int resultado = (int) Math.pow((a - b), 3) / d;
            System.out.println(" (A-B)^3");
            System.out.println("--------- = " + resultado);
            System.out.println("    D   ");
        } else {
            System.out.println("los Valores de D no pueden ser negativos");
        }


    }


}
