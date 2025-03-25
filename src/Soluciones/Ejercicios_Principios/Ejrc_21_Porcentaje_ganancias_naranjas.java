package Soluciones.Ejercicios_Principios;
/*21. Un mayorista compra a un agricultor un lote de X naranjas a Bs. Y la docena. Después de vender
todas las naranjas a los detallistas, obtiene Bs. K. Calcular el porcentaje de ganancia obtenida en la
inversión. Pruebe su programa con los siguientes valores: X=48000, Y=6, K=42000 para obtener 75%
como resultado.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejrc_21_Porcentaje_ganancias_naranjas {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        //lote
        System.out.println("PORCENTAJE GANANCIAS LOTE NARANJAS");
        System.out.println("Ingrese la cantidad de naranjas en lote");
        int lote = teclado.nextInt();

        //docena
        System.out.println("Ingrese el valor de la docena");
        int docena = teclado.nextInt();

        //precio
        System.out.println("Ingrese el precio total de la venta");
        int venta = teclado.nextInt();

        //porcentaje
        int inversion =(lote/12)*docena;
        int ganancia = venta-inversion;
        double porcentaje_ganancia=(double) ganancia/inversion*100;

        DecimalFormat dc = new DecimalFormat("#");


        System.out.println("El porcentaje de ganancia es de: ");
        System.out.println(dc.format(porcentaje_ganancia)+"%");

    }

}
