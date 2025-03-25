package Soluciones.Ejercicios_Principios;
/*17. Dados como datos el precio final pagado por un producto y su precio de venta al público (PVP), se
requiere que calcule y muestre el porcentaje de descuento que le ha sido aplicado.*/
import java.util.Scanner;

public class Ejrc_17_Porcentaje_descuento {
    public static void main (String[] args){
            Scanner teclado=new Scanner(System.in);
            double precio_final;
            double precio_venta;


            System.out.println("Calculo de descuento");
            System.out.println("=====================");
            System.out.println("Ingrese el precio pagodo producto");
            precio_venta= teclado.nextDouble();
            System.out.println("=====================");
            System.out.println("Ingrese el precio de venta del producto");
            precio_final= teclado.nextDouble();

            //Calculo descuento

            if (precio_venta>precio_final){

                double descuento=(precio_final/precio_venta)*100;
                System.out.println("==============================");
                System.out.println("DESCUENTO DE "+descuento+"%");

            }else{

                System.out.println("El precio de compra debe ser menor que el valor de venta para calcular el descuento");
            }
        }
    }
