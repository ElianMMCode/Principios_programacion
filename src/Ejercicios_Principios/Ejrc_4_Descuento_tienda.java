package Ejercicios_Principios;
/*4. Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuánto
deberá pagar finalmente por su compra.*/
import java.util.Scanner;

public class Ejrc_4_Descuento_tienda {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        int precio_compras;


        //Ingreso informacin
        System.out.println("Ingrese el valor de las compras");
        precio_compras = teclado.nextInt();

        //Calculo descuento

        double descuento = precio_compras * 0.15;
        double total = precio_compras - descuento;

        //Mostrar total

        System.out.println("El total de las compras con descuento es de "+total);


    }


}
