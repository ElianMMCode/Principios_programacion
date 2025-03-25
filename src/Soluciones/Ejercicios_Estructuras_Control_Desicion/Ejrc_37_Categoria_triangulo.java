package Soluciones.Ejercicios_Estructuras_Control_Desicion;

import java.util.Scanner;

public class Ejrc_37_Categoria_triangulo {

/*
37. Dados tres datos enteros positivos, que representan las longitudes de los lados de un probable
triángulo, desarrolle un algoritmo que determine si los datos corresponden a un triángulo. En caso
de que sí correspondan, escriba si el triángulo es equilátero, isósceles o escaleno. Calcule además
su área. Considere que es triángulo si se cumple que la suma de los dos lados menores es mayor
que la del lado mayor. Tome en cuenta además que el área de un triángulo la calculamos como:
area = √S(S­A)(S­B)(S­C) donde S es la mitad de la suma de los lados A, B y C.
Recuerde:
Equilátero: todos los lados son iguales.
Isósceles: 2 lados iguales y 1 diferente.
Escaleno: Todos los lados diferentes.
 */

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Escriba el valor de A");
        double a = t.nextInt();

        System.out.println("Escriba el valor de B");
        double b = t.nextInt();

        System.out.println("Escriba el valor de C");
        double c = t.nextInt();


        if (a + b > c && a + c > b && b + c > a || a + b == c / 2 || a + c == b / 2 || b + c == a / 2) {
            //equilátero
            if ((a == c) && (b == c)) {
                System.out.println("Es un triangulo equilátero");
            }//isosceles
            if (a == c || b == c) {
                if (a != c || a != b) {
                    System.out.println("En un triangulo isosceles");
                }
            }//escaleno
            if (a != c || a != b) {
                System.out.println("Es un triangulo escaleno");
            }
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println(area);
        } else {
            System.out.println("Los datos ingresado no corresponden a un triangulo");
        }

    }
}
