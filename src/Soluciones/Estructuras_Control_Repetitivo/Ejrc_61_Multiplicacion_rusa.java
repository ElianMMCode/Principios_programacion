package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

public class Ejrc_61_Multiplicacion_rusa {

    public static void rusa(int x, int y){
        System.out.println(x+" | "+y);
        System.out.println("---------");
        int suma=0;
        do {
            if (x%2!=0){
                suma += y;
                System.out.println(suma);
            }
            x/=2;
            y*=2;



            System.out.println(x+" | "+y);
        }while (x>1);
        if (x%2!=0){
            suma += y;
        }
        System.out.println("El resultado de la multiplicacion es:\n"+suma);
    }


public static void main (){
    Scanner t = new Scanner(System.in);
    System.out.println("Ingrese el primer numero");
    int x = t.nextInt();
    System.out.println("Ingrese el segundo numero");
    int y = t.nextInt();

    rusa(x,y);
}


}
