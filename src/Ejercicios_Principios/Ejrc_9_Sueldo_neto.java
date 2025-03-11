package Ejercicios_Principios;
/*9. Calcular el salario neto de un trabajador en función del número de horas trabajadas, el precio de la
hora y considerando un descuento fijo al sueldo base por concepto de impuestos del 20%.*/
import java.util.Scanner;

public class Ejrc_9_Sueldo_neto {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double precio_hora = 5.532;
        int horas;

        //Ingreso de horas
        System.out.println("Ingrese las horas trabajadas");
        horas=teclado.nextInt();

        //calculo sueldo

        double sueldo=precio_hora*horas;
        double descuento=sueldo*0.20;
        double sueldo_neto=sueldo-descuento;

        //Mostrar sueldo neto

        System.out.println("El sueldo neto del empleado es de "+sueldo_neto);



    }


}
