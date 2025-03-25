package Soluciones.Ejercicios_Principios;
//Suponga que un individuo decide invertir su capital en un banco y desea saber cuánto dinero ganará
//después de un mes si el banco paga a razón de 2% mensual.
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
