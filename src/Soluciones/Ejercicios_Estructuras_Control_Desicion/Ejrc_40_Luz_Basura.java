package Soluciones.Ejercicios_Estructuras_Control_Desicion;

/*
Desarrolle un programa que calcule y muestre el monto que debe pagar un suscriptor por concepto
de consumo de luz eléctrica y servicio de aseo urbano. Dicho monto se calcula multiplicando la
diferencia de la lectura anterior y la lectura actual por el costo de cada Kilovatio hora, según la
siguiente escala:
0 - 100 2.622,00 Bs.
101 - 300 79,78 Bs. / Kwh
301 – 500 89,52 Bs. /Kwh
501 – en adelante 97,95 Bs. / Khw
*/

import java.util.Scanner;

public class Ejrc_40_Luz_Basura {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);


        System.out.println("FACTURA ELECTRICIDAD Y ASEO");
        System.out.println("Valor de la lecuta anterior");
        double lc_ant = t.nextDouble();
        System.out.println("Valor de la lectura actual");
        double lc_act = t.nextDouble();
        double costo_elc = 0;
        if (lc_act > lc_ant) {
            System.out.println("Ingrese el costo de aseo urbano");
            double aseo = t.nextDouble();
            System.out.println("===============================");

            //Valor factura electricidad
            double lc_dfr = lc_act - lc_ant;
            if (lc_dfr > 0 && lc_dfr < 100) {
                costo_elc = 2622;
                System.out.println("El valor por electricidad sera de: " + costo_elc);
            } else if (lc_dfr > 101 && lc_dfr < 300) {
                costo_elc = lc_dfr * 79.78;
                System.out.println("El valor por electricidad sera de: " + costo_elc);
            } else if (lc_dfr > 301 && lc_dfr < 500) {
                costo_elc = lc_dfr * 89.52;
                System.out.println("El valor por electricidad sera de: " + costo_elc);
            } else if (lc_dfr > 501) {
                costo_elc = lc_dfr * 97.95;
                System.out.println("El valor por electricidad sera de: " + costo_elc);
            }
            double total = costo_elc + aseo;
            System.out.println("El costo total de la factura con el valor de aseo urbano es:");
            System.out.println(total);
        } else {
            System.out.println("Verifique los valores ingresados");
        }


    }


}
