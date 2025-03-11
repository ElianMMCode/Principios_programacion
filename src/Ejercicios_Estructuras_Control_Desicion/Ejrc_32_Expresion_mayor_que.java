package Ejercicios_Estructuras_Control_Desicion;
/*
32. Dados como datos los valores enteros P y Q, determine si los mismos satisfacen la siguiente
expresión: P3 + Q4 – 2*P2 > 680. En caso afirmativo debe mostrar los valores de P y Q, de lo contrario
muestre un mensaje alusivo al hecho.
 */
import java.util.Scanner;

public class Ejrc_32_Expresion_mayor_que {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el valor de P");
        int p = t.nextInt();
        System.out.println("Ingrese el valor de Q");
        int q = t.nextInt();

        //Calculo expresion

        double expresion = Math.pow(p, 3) + Math.pow(q, 4) - (2 * Math.pow(p, 2));

        if (expresion > 680) {
            System.out.println(p + "³" + "+" + q + "⁴" + "-2*" + p + "²" + " > 680");
        } else {
            System.out.println(p + "³" + "+" + q + "⁴" + "-2*" + p + "²" + " < 680");
        }

    }


}
