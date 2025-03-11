package Ejercicios_Estructuras_Control_Desicion;


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
