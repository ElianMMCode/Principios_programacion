package Ejercicios_Principios;
/*15. Calcular y mostrar el monto total a pagar en un mes de luz eléctrica, teniendo como dato la lectura
anterior, la lectura actual y el costo por kilovatio.*/
import java.util.Scanner;

public class Ejrc_15_Factura_energia {
    public static void main(String[] args){

        int ant_lectura;
        int act_lectura;
        int kwh;
        Scanner teclado = new Scanner(System.in);

            System.out.println("PRECIO FACTURA");
            System.out.println("Ingrese el valor de la lectura anterior");
            ant_lectura = teclado.nextInt();
            System.out.println("Ingrese el valor de la lectura actual");
            act_lectura = teclado.nextInt();
        if (ant_lectura<act_lectura) {
            System.out.println("Ingrese el precio del kilovatio hora (kWh)");
            kwh = teclado.nextInt();

            int precio = (act_lectura - ant_lectura) * kwh;
            System.out.println("============================================");
            System.out.println("VALOR FACTURA ACTUAL");
            System.out.println(precio);
        }else{
            System.out.println("Revise los valores de lectura ingresados");
        }
    }


}
