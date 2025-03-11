package Ejercicios_Estructuras_Control_Desicion;
/*
30. Se tienen 4 dígitos en las variables A, B, C, D que forman un entero positivo N. Se desea redondear
N a la centena más próxima y mostrar el resultado. Considere los siguientes ejemplos: Si A es 2, B
es 3, C es 6 y D es 2, entonces N es 2362 y el resultado redondeado es 2400. Si N es 2342, el
resultado redondeado será 2300 y si N es 2962, el resultado redondeado será 3000.
 */

import java.util.Scanner;

public class Ejrc_30_Redondeo_centena {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
        int[] dig = new int[4];
        for (int i = 0; i < dig.length; i++) {
            System.out.println("Ingrese el digito " + (i + 1));
            dig[i] = t.nextInt();
        }
        if (dig[2] >= 5) {
            dig[3] = 0;
            dig[2] = 0;
            dig[1]++;
        } else {
            dig[3] = 0;
            dig[2] = 0;
        }
        if (dig[1] >= 5) {
            dig[1] = 0;
            dig[0]++;
        }
        System.out.println("El numero rendondeado es: ");
        int i = 0;
        while (i < dig.length) {
            System.out.print(dig[i]);
            i++;
        }
    }
}
