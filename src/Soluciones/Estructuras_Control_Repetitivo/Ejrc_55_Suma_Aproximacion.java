package Soluciones.Estructuras_Control_Repetitivo;

public class Ejrc_55_Suma_Aproximacion {

    private static int suma(int k){
        return (int) ((Math.pow(k, 2)+1)/k);
    }

    public static void main (){

        int k;
        int sumatoria=0;
        for(k = 1; sumatoria<=1000; k++){
            sumatoria = sumatoria + suma(k);
            if (sumatoria<=1000) {
                System.out.println(sumatoria);
            }
            }
        System.out.println("Fueron necesarios "+k+" terminos para aproximarse a 1000");
        }

    }

