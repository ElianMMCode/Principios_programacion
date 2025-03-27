package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

public class Ejrc_56_Restas_Sucesivas {

    private static int resta(int x, int y){
        int cociente;
        for(cociente = 0; x>0; cociente++){
            x = x - y;
            System.out.println(x);
        }
        return cociente;
    }


    public static void main (){
        Scanner t = new Scanner(System.in);
        int x,y,resultado;

        System.out.println("Ingrese el primer entero");
        x = t.nextInt();
        System.out.println("Ingrese el segundo entero");
        y = t.nextInt();
        resultado=resta(x,y);
        System.out.println("El resultado de la division es "+resultado);
    }
}
