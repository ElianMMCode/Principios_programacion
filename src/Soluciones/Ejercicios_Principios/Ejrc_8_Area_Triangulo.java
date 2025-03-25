package Soluciones.Ejercicios_Principios;
/*8. Calcule el área de un triángulo en función de las longitudes de sus lados, utilizando la fórmula:
√p(p­a)(p­b)(p­c) donde p = (a+b+c) / 2*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejrc_8_Area_Triangulo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Ingreso de medidas
        System.out.println("Ingrese la medida del lado a");
        double a = teclado.nextDouble();

        System.out.println("Ingrese la medida del lado b");
        double b = teclado.nextDouble();

        System.out.println("Ingrese la medida del lado c");
        double c = teclado.nextDouble();


        //Calculo area

        double p = (a + b + c) / 2;

        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        DecimalFormat df = new DecimalFormat("#.000");

        System.out.println("El area del triangulo es de " + df.format(area));
    }


}
