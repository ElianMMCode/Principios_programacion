package Ejercicios_Estructuras_Control_Desicion;

import java.util.Scanner;

public class Ejrc_45_Ecuacion_segundo_grado {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese el valor de A");
        int a = t.nextInt();
        System.out.println("Ingrese el valor de B");
        int b = t.nextInt();
        System.out.println("Ingrese el valor de C");
        int c = t.nextInt();


        double dis = Math.pow(b, 2) - (4 * a * c);
        double x1,x2;

        //Ecuacion
        if (dis == 0){
            System.out.println("D = "+dis);
            x1 = (double) -b /2*a;
            x2 = x1;
            System.out.println("X1 = "+x1+"\nX2 = "+x2);
        }else if (dis >= 0) {
            System.out.println("D ="+dis);
            x1 = (-b + Math.sqrt(dis))/(2*a) ;
            x2 = (-b - Math.sqrt(dis))/(2*a) ;
            System.out.println("X1 = "+x1+"\nX2 = "+x2);
        } else {
            System.out.println("No hay soluciones en los reales");
        }

    }


}

