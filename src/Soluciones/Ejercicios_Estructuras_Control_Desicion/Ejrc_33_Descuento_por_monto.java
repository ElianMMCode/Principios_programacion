package Soluciones.Ejercicios_Estructuras_Control_Desicion;
/*
33. en una tienda efectúan un descuento a los clientes dependiendo del monto de la compra. El
descuento se efectúa con base en el siguiente criterio:
a. Si el monto es inferior a $500, no hay descuento.
b. Si está comprendido entre $500 y $1000 inclusive, se hace un descuento del 5%
c. Si está comprendido entre $1000 y $7000 inclusive, se hace un descuento del 11%
d. Si está comprendido entre $7000 y $15000 inclusive, el descuento es del
e. Si el monto es mayor a $15000, hay un 25% de descuento.
Calcule y muestre el nombre del cliente, el monto de la compra, monto a pagar y descuento recibido.
18%
 */
import java.util.Scanner;

public class Ejrc_33_Descuento_por_monto {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        System.out.println("Nombre del cliente");
        String nombre = t.nextLine();
        System.out.println("Ingrese el monto de la compra");

        double monto = t.nextDouble();
        double descuento;
        int mnt_descuento;

        //Descuento
        System.out.println("==============================");
        System.out.println("FACTURA");
        System.out.println("Cliente: " + nombre);
        System.out.println("Monto compra:" + monto);

        if (monto < 500) {
            System.out.println("No hay descuento");
        }

        //descuento 5%
        else if (monto <= 1000) {
            descuento = monto * 0.05;
            mnt_descuento = (int) ((int) monto - descuento);
            System.out.println("Descuento de 5%");
            System.out.println(descuento);
            System.out.println("Monto a pagar");
            System.out.println(mnt_descuento);
        }
        //descuento 11%
        else if (monto > 1000 && monto <= 7000) {
            descuento = monto * 0.11;
            mnt_descuento = (int) ((int) monto - descuento);
            System.out.println("Descuento de 11%");
            System.out.println(descuento);
            System.out.println("Monto a pagar");
            System.out.println(mnt_descuento);
        }
        //descuento 18%
        else if (monto > 7000 && monto <= 15000) {
            descuento = monto * 0.18;
            mnt_descuento = (int) ((int) monto - descuento);
            System.out.println("Descuento de 18%");
            System.out.println(descuento);
            System.out.println("Monto a pagar");
            System.out.println(mnt_descuento);
        }
        //descuento 25%
        else if (monto > 15000) {
            descuento = monto * 0.25;
            mnt_descuento = (int) ((int) monto - descuento);
            System.out.println("Descuento de 25%");
            System.out.println(descuento);
            System.out.println("Monto a pagar");
            System.out.println(mnt_descuento);
        }


    }


}
