package Estructuras_Control_Repetitivo;

import java.util.Scanner;

/*46. Sea N y K dos enteros positivos, con K < N. Se desea escribir un programa que escriba el valor de
N,N-1,N-2,..., y así sucesivamente hasta llegar al valor de K.
*/
public class Ejrc_46_Conteo_NK {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int n = t.nextInt();
        System.out.println("Ingrese un numero mayor que el anterior");
        int k = t.nextInt();


        //Números positivos
        if (k >= 0 && n >= 0) {
            //Numero N>K
            if (n < k) {
                do {
                    System.out.print(n+" , ");
                    n++;
                } while (n <= k);
                System.out.print("FIN");
            } else {
                System.out.println("El segundo numero no debe ser\nmenor o igual al anterior");
            }
        } else {
            System.out.println("Los numero ingresados deben\nser enteros positivos");
        }


    }


}
