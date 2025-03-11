package Ejercicios_Principios;

import java.util.Scanner;

public class Ejrc_2_Ganancia_banco {
    public static void main(String[] args) {


        int inversion;
        Scanner teclado = new Scanner(System.in);

        //Ingreso informacion
        System.out.println("Ingrese el monto de la inversion");
        inversion = teclado.nextInt();


        //Calculo ganancia

        double ganancia = inversion * (0.02);

        //Mostrar por pantalla

        System.out.println("Las ganancias del mes fueron "+ganancia);
    }
}
