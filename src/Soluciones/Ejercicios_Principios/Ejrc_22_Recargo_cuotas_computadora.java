package Soluciones.Ejercicios_Principios;
/*22. Un comerciante de computadores ofrece P precio por compra al contado ó 12 cuotas de T Bolívares
cada una. Desarrolle un programa para calcular y mostrar cuál es el porcentaje que se cobra por el
recargo en el pago del computador por cuotas.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejrc_22_Recargo_cuotas_computadora {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("RECARGO PAGO CUOTAS");
        System.out.println("Valor de la computadora");
        double pr_compu = teclado.nextDouble();

        //cuotas
        System.out.println("Valor de las cuotas");
        double cuotas = teclado.nextDouble();

        //recargo
        double pr_recargo= cuotas*12;
        double por_recargo= ((pr_recargo-pr_compu)/pr_compu)*100;

        DecimalFormat dc = new DecimalFormat("#");
        System.out.println("El valor de la compo con su recargo");
        System.out.println(dc.format(pr_recargo));
        System.out.println("Porcentaje de recargo");
        System.out.println(dc.format(por_recargo)+"%");



    }


}
