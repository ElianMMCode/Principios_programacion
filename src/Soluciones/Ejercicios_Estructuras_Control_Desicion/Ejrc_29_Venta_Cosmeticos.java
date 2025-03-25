package Soluciones.Ejercicios_Estructuras_Control_Desicion;
/*
29. Una empresa que comercializa cosméticos tiene organizados a sus vendedores en tres
departamentos y ha establecido un programa de incentivos para incrementar su productividad. El
gerente, al final del mes, pide el importe global de las ventas de los tres departamentos y aquellos
que excedan el 33% de las ventas totales se les paga una cantidad extra equivalente al 20% de su
salario mensual. Si todos los vendedores ganan lo mismo, determinar cuánto recibirán los
vendedores de los tres departamentos al finalizar el mes.
*/
import java.util.Scanner;

public class Ejrc_29_Venta_Cosmeticos {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.println("Salario de lo vendedores");
        double sl_vendedor = t.nextDouble();

        //Ingreso valores ventas
        double total_ventas = 0;
        double[] dpt = new double[3];
        for (int i = 0; i < dpt.length; i++) {
            System.out.println("Ventas deparmento " + (i + 1));
            dpt[i] = t.nextDouble();
            total_ventas = total_ventas + dpt[i];
        }

        //Dpt sobre 33%
        double up_ventas = total_ventas * 0.33;
        double[] vendedor = new double[3];
        for (int i = 0; i < vendedor.length; i++) {
            if (dpt[i] > up_ventas) {
                vendedor[i] = (sl_vendedor * 0.2) + sl_vendedor;
            } else {
                vendedor[i] = sl_vendedor;
            }
        }
        //Salario por departamento
        for (int i = 0; i < dpt.length; i++) {
            System.out.println("Salario Departamento" + (i + 1));
            System.out.println(vendedor[i]);
        }


    }


}
