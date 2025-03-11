package Ejercicios_Estructuras_Control_Desicion;

import java.util.Scanner;

public class Ejrc_27_Calculo_figura {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("FIGURAS");
        System.out.println("Ingrese los valores a comparar");
        System.out.println("A");
        double a = t.nextDouble();
        System.out.println("B");
        double b = t.nextDouble();
        System.out.println("C");
        double c = t.nextDouble();

        //Calculo de areas

        double area1 = a * b / 2;
        double area2 = a * Math.pow(b, 2);
        double area3 = a * b;


        if (c == area1) {
            System.out.println("La figura es un triangulo");
        } else if (c == area2) {
            System.out.println("La figura es un circulo");
        } else if (c == area3) {
            System.out.println("La figura es un rectángulo");
        } else if (c != area1 && c != area2 && c != area3){
            System.out.println("La figura no es valida");
        }
    }
}
