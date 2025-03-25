package Soluciones.Ejercicios_Principios;
/*23. Suponga que a partir de una Tonelada de maíz una planta productora obtiene M kilogramos de
harina y N litros de aceite. La planta vende cada bulto de 24 paquetes de un kilogramo de harina en
Bs. B1 y cada caja de 15 envases de aceite en Bs. B2. Suponiendo que la planta vende lo que
produce, calcular el ingreso total por la venta de cada tonelada de maíz, sabiendo además que cada
kilogramo de harina y cada litro de aceite que restan del embalaje se venden al detal a los precios de
Bs. B3 y Bs. B4 respectivamente. Pruebe su algoritmo o programa con los sig. Valores: M=452,
N=197, B1=132, B2= 180, B3= 7,50 y B4= 14,50. Respuesta: 4895
 */
import java.util.Scanner;

public class Ejrc_23_Tonelada_maiz {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);


        System.out.println("PRECIO TONELADA MAIZ");
        System.out.println();
        System.out.println("<><><><><><><><><><>");

        //Tonelada
        System.out.println("Ingrese los Kg de harina");
        double kg= teclado.nextDouble();
        System.out.println("Ingrese los lt de aceite");
        double lt= teclado.nextDouble();

        //precio bulto y caja
        System.out.println("Precio del bulto");
        double pr_bulto= teclado.nextDouble();
        int bulto= (int) (((int)(kg/24))*pr_bulto);

        //*pr_bulto);
        System.out.println("Precio de la caja");
        int pr_caja = teclado.nextInt();
        int caja=(((int)(lt/15))*pr_caja);

        //Precio detal
        System.out.println("Precio al detal del bulto");
        double prdt_bulto = teclado.nextDouble();
        int dt_bulto = (int) (((int)(kg%24))*prdt_bulto);

        System.out.println("Precio al detal de la caja");
        double prdt_caja = teclado.nextDouble();
        int dt_caja=(int)((int)(lt%15)*prdt_caja);

        //Total
        int total =(bulto+caja+dt_caja+dt_bulto);
        System.out.println("PRECIO TOTAL");
        System.out.println(total);





    }


}
