package Ejercicios_Estructuras_Control_Desicion;

import java.util.Scanner;

/*
Una persona se encuentra en la disyuntiva de comprar un automóvil o un terreno, los cuales
cuestan exactamente la misma cantidad de dinero. Sabe que mientras el automóvil se devalúa,
con el terreno sucede lo contrario. Esta persona comprará el automóvil si al cabo de tres años la
devaluación de éste no es mayor que la mitad del incremento del valor del terreno. Ayúdele a esta
persona a determinar si debe o no comprar el automóvil.
*/
public class Ejrc_39_Automovil_vs_terreno {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);


        System.out.println("Valor de compra");
        double pr = t.nextDouble();
        System.out.println("Ingrese el devalúo anual del automóvil");
        double aut = t.nextDouble();
        System.out.println("Ingrese el incremento del valor del terreno");
        double ter = t.nextDouble();
        System.out.println("Ingrese la cantidad de tiempo de referencia");
        int tmp = t.nextInt();


        //calculo devaluo y ganancia
        double dv_aut = aut * tmp;
        double gn_ter = ter * tmp;
        double total_aut = pr - dv_aut;
        double total_ter = pr + gn_ter;

        if (dv_aut < gn_ter / 2) {
            System.out.println("Comprar auto");
            System.out.println("Valor automovil "+total_aut);
            System.out.println("Valor terrno "+total_ter);
        } else {
            System.out.println("NO COMPRAR q-q");
            System.out.println("Valor automovil "+total_aut);
            System.out.println("Valor terrno "+total_ter);
        }


    }


}
