package Soluciones.Ejercicios_Estructuras_Control_Desicion;
/*
31. Una compañía de alquiler de automóviles sin conductor, desea calcular y mostrar lo que debe pagar
cada cliente, de acuerdo a las siguientes condiciones:
a. Si no se rebasan los 300 km, se cancelan 5000 Bolívares
b. Si la distancia recorrida es superior a 300 km
 Pero inferior a 1000 se cobran 5000 Bolívares más 200 Bolívares por cada kilómetro
superior a 300.
 Si es superior a 1000 se cobran 5000 Bolívares más 200 Bolívares por cada kilómetro,
para las distancias entre 300 y 1000 kilómetros y 150 Bolívares por cada kilómetro para
las distancias mayores a 1000.
 */
import java.util.Scanner;

public class Ejrc_31_Alquiler_Automoviles {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);

        System.out.println("COSTO ALQUILER");
        System.out.println("==============");
        System.out.println("Ingrese los Km recorridos");
        int recorrido = t.nextInt();
        int precio;
        int dst_extra;

        if (recorrido<=300){
            precio = 5000;
            System.out.println("Precio alquiler");
            System.out.println(precio);
        } else if (recorrido<1000) {
            dst_extra = recorrido-300;
            precio=5000+(dst_extra*200);
            System.out.println("Precio alquiler");
            System.out.println(precio);
        } else if (recorrido>1000) {
            dst_extra =1000-300;
            precio=5000+(dst_extra*200);
            int dst_extra_mil = recorrido-1000;
            int precio_extra = precio+dst_extra_mil*150;
            System.out.println("Precio alquiler");
            System.out.println(precio_extra);
        }


    }



}
