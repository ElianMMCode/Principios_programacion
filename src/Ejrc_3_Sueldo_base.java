import java.util.Scanner;

public class Ejrc_3_Sueldo_base {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        double sueldo;
        int ventas;

        //Ingreso informacion
        System.out.println("Ingrese el sueldo base");
        sueldo = teclado.nextDouble();

        //Reinicio del Scanner
        teclado = new Scanner(System.in);

        System.out.println("Ingrese el numero de ventas realizadas");
        ventas = teclado.nextInt();

        //Calculo ganancias

        double comisiones = ventas*(sueldo*0.10);
        double total_sueldo = sueldo + comisiones;

        //Mostrar total

        System.out.println("Su ganancias en base a "+ventas+" ventas fueron de "+comisiones+"\n");

        System.out.println("Su sueldo total fue de "+total_sueldo);


    }


}
