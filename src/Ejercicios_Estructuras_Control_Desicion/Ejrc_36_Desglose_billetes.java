package Ejercicios_Estructuras_Control_Desicion;

import java.util.Scanner;

/*
36. Dada una cantidad entera de Bolívares, desarrolle un algoritmo que permita desglosar dicha
cantidad en los billetes de curso legal en el País. Recuerde que estos son: 50000, 20000, 10000,
5000, 2000, 1000, 500, 100, 50, 20, 10.
*/
public class Ejrc_36_Desglose_billetes {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese un cantidad de dinero");
        int dinero = t.nextInt();

        int ct_ml = dinero / 50000;
        int rst = dinero % 50000;
        int vt_ml = rst / 20000;
        rst = rst % 20000;
        int dz_ml = rst / 10000;
        rst = rst % 10000;
        int c_ml = rst / 5000;
        rst = rst % 5000;
        int ds_ml = rst / 2000;
        rst = rst % 2000;
        int ml = rst / 1000;
        rst = rst % 1000;
        int qts = rst / 500;
        rst = rst % 500;
        int cn = rst / 100;
        rst = rst % 100;
        int ct = rst / 50;
        rst = rst % 50;
        int vt = rst / 20;
        rst = rst % 20;
        int dz = rst / 10;


        System.out.println("El cambio en billetes sera de: ");
        if (ct_ml > 0) {
            System.out.println(ct_ml + " de 50000");
        }
        if (vt_ml > 0) {
            System.out.println(vt_ml + " de 20000");
        }
        if (dz_ml > 0) {
            System.out.println(dz_ml + " de 10000");
        }
        if (c_ml > 0) {
            System.out.println(c_ml + " de 5000");
        }
        if (ds_ml > 0) {
            System.out.println(ds_ml + " de 2000");
        }
        if (ml > 0) {
            System.out.println(ml + " de 1000");
        }
        if (qts > 0) {
            System.out.println(qts + " de 500");
        }
        if (cn > 0) {
            System.out.println(cn + " de 100");
        }
        if (ct > 0) {
            System.out.println(ct + " de 50");
        }
        if (vt > 0) {
            System.out.println(vt + " de 20");
        }
        if (dz > 0) {
            System.out.println(dz + " de 10");
        }


    }

}
