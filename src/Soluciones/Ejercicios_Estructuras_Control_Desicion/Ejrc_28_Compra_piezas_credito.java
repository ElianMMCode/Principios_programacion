package Soluciones.Ejercicios_Estructuras_Control_Desicion;
/*
28. Una empresa quiere hacer una compra de varias piezas de la misma clase a un fabricante de
refacciones. La empresa dependiendo del monto total de la compra, decidirá qué hacer para pagar
al fabricante. Si el monto total de la compra excede de $500000 la empresa tendrá la capacidad
de invertir de su propio dinero un 55% del monto de la compra, pedir presta al banco un 30% y el
resto lo pagará solicitando un crédito al fabricante. Si el monto total de la compra no excede de
$500000 la empresa tendrá capacidad de invertir de su propio dinero un 70% y el restante 30% lo
pagará solicitando crédito al fabricante. El fabricante cobra por concepto de intereses un 20%
sobre la cantidad que se le pague a crédito. Calcule y muestre la cantidad a invertir de los fondos
de la empresa, la cantidad a pagar a crédito, el monto a pagar por intereses y si es necesario, la
cantidad prestada al banco.
*/
import java.util.Scanner;

public class Ejrc_28_Compra_piezas_credito {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese monto total de la compra");
        double monto = t.nextDouble();


        if (monto > 500000) {
            System.out.println("==============================");
            double inv = monto * 0.55;
            System.out.println("Inversion = " + inv);
            double banco = monto * 0.3;
            System.out.println("Prestamo al Banco = " + banco);
            double empresa = monto * 0.15;
            System.out.println("Credito fabricante = " + empresa);
            double interes = empresa * 0.7;
            System.out.println("Intereses crefito fabricante = " + interes);

        } else if (monto < 500000) {
            System.out.println("==============================");
            double inv = monto * 0.70;
            System.out.println("Inversion = " + inv);
            double empresa = monto * 0.3;
            System.out.println("Credito fabricante = " + empresa);
            double interes = empresa * 0.7;
            System.out.println("Intereses crefito fabricante = " + interes);
        }


    }


}
