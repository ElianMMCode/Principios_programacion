package Estructuras_Control_Repetitivo;
/*
51. Calcular el término doceavo y la suma de los doce primeros términos de la sucesión: 6, 11, 16, 21.
Respuesta: a12=61, suma=402.
*/
public class Ejrc_51_Doceavo {
    public static void main(String[] args){
        int n = 6;
        int sum = 0;
        for (int i = 0; i<12; i++){

            System.out.println(n);
            sum=sum+n;
            n=n+5;
        }
        System.out.println("Suma = "+sum);

    }
}
