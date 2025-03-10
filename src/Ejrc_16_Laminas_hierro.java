import java.util.Scanner;

public class Ejrc_16_Laminas_hierro {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double largo = 4;
        double ancho = 1.5;
        double pieza = 0.5;


        double lamina = largo * ancho;

        System.out.println("PIEZAS FABRICADAS");
        System.out.println("<><><><><><><><><><><><><>");
        System.out.println("Ingrese la cantidad de laminas");
        int unidad = teclado.nextInt();


        //calculo
        if (unidad >= 0) {
            double total_piezas = (lamina/pieza)*unidad;
                    double desperdicio = (lamina%pieza)*unidad;

            System.out.println("Piezas fabricas; "+total_piezas);
            System.out.println("Desperdicio Total; "+desperdicio);
                    }else{
            System.out.println("Verfique los valores ingresados");
        }
        }


}
