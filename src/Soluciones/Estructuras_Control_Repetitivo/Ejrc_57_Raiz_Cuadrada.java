package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

public class Ejrc_57_Raiz_Cuadrada {

    public static double heron(double n, double x) {
        double rn;
        double diferencia;
        do {
            rn = ((x + n / x) / 2);
            diferencia = Math.abs(rn - x);
            x = rn;
        } while (diferencia >=0.000001);


        return (rn);
    }

    public static void main() {
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el numero del cual quiere encontrar la raiz");
        double n = t.nextInt();
        double x = 0.1;

        int raiz = (int) heron(n, x);
        System.out.println("La raiz de "+n+" es de "+ raiz);

    }

}