package Ejercicios_Principios;

import java.util.Scanner;

public class Ejrc_23_Tonelada_maiz {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);


        System.out.println("PRECIO TONELADA MAIZ");
        System.out.println();
        System.out.println("<><><><><><><><><><>");

        //Tonelada
        System.out.println("Ingrese los Kg de harina");
        double kg= teclado.nextDouble();
        System.out.println("Ingrese los lt de aceite");
        double lt= teclado.nextDouble();

        //precio bulto y caja
        System.out.println("Precio del bulto");
        double pr_bulto= teclado.nextDouble();
        int bulto= (int) (((int)(kg/24))*pr_bulto);

        //*pr_bulto);
        System.out.println("Precio de la caja");
        int pr_caja = teclado.nextInt();
        int caja=(((int)(lt/15))*pr_caja);

        //Precio detal
        System.out.println("Precio al detal del bulto");
        double prdt_bulto = teclado.nextDouble();
        int dt_bulto = (int) (((int)(kg%24))*prdt_bulto);

        System.out.println("Precio al detal de la caja");
        double prdt_caja = teclado.nextDouble();
        int dt_caja=(int)((int)(lt%15)*prdt_caja);

        //Total
        int total =(bulto+caja+dt_caja+dt_bulto);
        System.out.println("PRECIO TOTAL");
        System.out.println(total);





    }


}
