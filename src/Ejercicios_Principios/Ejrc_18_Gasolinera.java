package Ejercicios_Principios;
/*18. Resuelva el problema que tienen en una gasolinera. Los surtidores de la misma registran lo que
surten en galones, pero el precio de la gasolina está fijado en litros. Se requiere que calcule y muestre
lo que hay que cobrarle a un cliente, considerando que: (a) cada galón tiene 3.785 litros; (b) el precio
del litro es de 100 Bolívares.*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejrc_18_Gasolinera {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        double galon =3.785;
        double litro=1/galon;
        double precio=litro*100;


        System.out.println("PRECIO GASOLINA");
        System.out.println("==================");
        System.out.println("Ingrese la cantidad de litros surtidos al cliente");
        double cantidad_litros= teclado.nextInt();


        //Calculo precio

        DecimalFormat dc = new DecimalFormat("#.000");

        double precio_venta=cantidad_litros*precio;
        System.out.println("=============================");
        System.out.println("El precio es de: "+(dc.format(precio_venta)));

    }

}
