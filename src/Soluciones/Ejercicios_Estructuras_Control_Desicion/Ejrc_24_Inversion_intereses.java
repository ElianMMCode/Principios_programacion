package Soluciones.Ejercicios_Estructuras_Control_Desicion;
/*
24. Un hombre desea saber cuánto dinero se generará por concepto de intereses sobre la cantidad
que tiene en inversión en el banco. El decidirá reinvertir los intereses siempre y cuando éstos
excedan a $7000 y en ese caso, desea saber cuánto dinero tendrá finalmente en su cuenta.
 */
import java.util.Scanner;

public class Ejrc_24_Inversion_intereses {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("GANANCIA INTERESES");
        System.out.println("Ingrese su inversion");
        double inv = teclado.nextDouble();
        System.out.println("Intereses de la inversion");
        double interes = teclado.nextDouble() / 100;

        double ganancia = inv * interes;

        if (ganancia > 7000) {

            System.out.println("Sus ganancias seran de:");
            System.out.println(ganancia);
            System.out.println("Total Dinero");
            double total = inv + ganancia;
            System.out.println(total);
        } else {
            System.out.println("Ganancias por debajo de 7000");
        }


    }


}
