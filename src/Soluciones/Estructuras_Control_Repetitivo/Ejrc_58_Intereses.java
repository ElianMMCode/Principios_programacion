package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

public class Ejrc_58_Intereses {

    public static double capital_total(double capital, int t_interes, int semanas){
        return ((capital*(((double) t_interes/100))/365)*((double) semanas*7));
    }


    public static void main(){

        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese su capital a depositar");
        double capital = t.nextDouble();
        System.out.println("Ingrese la tasa de interes");
        int t_interes = t.nextInt();
        System.out.println("Ingrese la duracion del deposito en semanas");
        int semanas = t.nextInt();

        double capital_total = capital+capital_total (capital, t_interes, semanas);

        System.out.println("El capital total acumulado sera de "+capital_total+" en el plazo de "+semanas+" semanas");
    }
}
