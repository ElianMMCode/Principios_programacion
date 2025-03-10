import java.util.Scanner;

public class Ejrc_7_Pies_pulgadas {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double metro;

        System.out.println("CONVERSION METROS A PULGADAS Y PIES");
        System.out.println("===================================");
        System.out.println("Ingrese los metros a convertir");
        metro=teclado.nextDouble();

        //CONVERSION
        double pulgadas = 39.27*metro;
        double pies = 12*pulgadas;
        System.out.println("====================================");
        System.out.println(metro+" metros es equivalentes a:");
        System.out.println(pulgadas+" pulgadas");
        System.out.println(pies+" pies");
    }
}
