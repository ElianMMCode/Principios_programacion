package Ejercicios_Estructuras_Control_Desicion;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejrc_25_Aumento_salario {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("AUMENTO SALARIO");
        System.out.println("Cuanto es el sueldo del trabajador");
        double sueldo = teclado.nextDouble();
        double aumento = 0;

        if(sueldo<40000 && sueldo>0){
            aumento=(sueldo*0.15)+sueldo;
        }else if (sueldo<0){
            System.out.println("Verifique los datos ingresados");
        }else {
            aumento = (sueldo * 0.12) + sueldo;
        }
        DecimalFormat dc = new DecimalFormat("#");
        if(sueldo>0) {
            System.out.println("El nuevo salario del trabajador sera de: ");
            System.out.println(dc.format(aumento));
        }
    }
}
