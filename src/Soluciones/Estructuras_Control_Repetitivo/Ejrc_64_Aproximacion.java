package Soluciones.Estructuras_Control_Repetitivo;

public class Ejrc_64_Aproximacion {
    public void main () {
        int n_terminos = 1;
        double suma = 1;
        boolean aprox = false;
        for (double i = 2; !aprox; i *= 2) {
            if (suma >= 1.99) {
                aprox = true;
            }
            int x = 1;
            suma += x + (x / i);
            n_terminos++;
        }
        System.out.println("Serie 1 + 1⁄2 + 1⁄4 + 1/8 + 1/16 + 1/32 + ... hasta aproximarse a 1.99");
        System.out.printf("El total de terminos fue de %d", n_terminos);
        System.out.printf("\nLa suma es de %.2f", suma);
    }
}
