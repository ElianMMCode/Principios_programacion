package Estructuras_Control_Repetitivo;
/*
47. Escriba un programa que imprima todos los enteros positivos impares menores que 100
omitiéndose aquellos que sean divisibles por 7.
*/
public class Ejrc_47_Enteros_no_div_siete {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i += 2) {
            int n = i % 7;
            if (n != 0) {
                System.out.println(i);
            }

        }

    }

}
