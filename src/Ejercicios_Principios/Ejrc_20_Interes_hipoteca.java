package Ejercicios_Principios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejrc_20_Interes_hipoteca {
    public static void main(String[] args){

        Scanner teclado=new Scanner(System.in);

        System.out.println("CALCULO DE INTERESES HIPOTECA");
        System.out.println("-----------------------------");
        System.out.println("Ingrese el valor del prestamo");
        double prestamo = teclado.nextDouble();
        System.out.println("Inrgese el valor de los intereses pagados");
        double pago_intereses = teclado.nextDouble();
        System.out.println("Ingrese el tiempo (años) pagados");
        int tiempo = teclado.nextInt();

        //CALCULO DE INTERESES AÑO

        DecimalFormat dc= new DecimalFormat("#");
        double razon = 100*pago_intereses/prestamo*tiempo;

        System.out.println("Los intereses anuales fueron de: ");
        System.out.println(dc.format(razon)+"%");

    }



}
