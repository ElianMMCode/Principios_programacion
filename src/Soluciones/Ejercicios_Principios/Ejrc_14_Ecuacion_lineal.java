package Soluciones.Ejercicios_Principios;
/*14. El siguiente sistema de ecuaciones lineales:
aX + bY = c
dX + eY = f
se resuelve con las fórmulas:
     ce - bf       af - cd
X = --------- Y = --------- calcule y muestre el valor de X e Y.
     ae – bd       ae – bd
*/
import java.util.Scanner;

public class Ejrc_14_Ecuacion_lineal {
    public static void main(String[] args){

        float c, e, b, f, a, d;
        Scanner teclado = new Scanner(System.in);


        System.out.println("Ecuacion lineal");
        System.out.println("-");
        System.out.println("| aX + bY = c");
        System.out.println("-");
        System.out.println("| dX + eY = f");
        System.out.println("-");

        System.out.println("<><><><><><><><><><><<><>");
        System.out.println("Ingrese el valor de a");
        a= teclado.nextFloat();
        System.out.println("Ingrese el valor de b");
        b= teclado.nextFloat();
        System.out.println("Ingrese el valor de c");
        c= teclado.nextFloat();
        System.out.println("Ingrese el valor de d");
        d= teclado.nextFloat();
        System.out.println("Ingrese el valor de e");
        e= teclado.nextFloat();
        System.out.println("Ingrese el valor de f");
        f= teclado.nextFloat();


        float x1 = (c*e)-b*f;
        float y1 = (a*f)-c*d;

        float x2 = ((a*e)-(b*d));
        float y2 = ((a*e)-(b*d));

        if (y2 !=0 || x2 != 0){
            float x = x1 / x2;
            float y = y1 / y2;
            System.out.println("<><><><><><><><><><><<><>");
            System.out.println(" X = "+x);
            System.out.println(" Y = "+y);
        }else {
            System.out.println("No se puede dividir entre 0");
        }

    }


}
