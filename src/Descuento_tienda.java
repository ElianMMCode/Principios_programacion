import java.util.Scanner;

public class Descuento_tienda {

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
