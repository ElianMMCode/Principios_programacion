package Estructuras_Control_Repetitivo;

/*
50. Desarrolle un algoritmo o programa que permita calcular y mostrar la suma de todos los números
pares comprendidos entre 97 y 1003. Respuesta: 249150
*/
public class Ejrc_50_Suma_pares {
    public static void main(String[] args) {


        int sum_par = 0;
        for (int i = 97; i <= 1003; i++) {
            int par = i%2;
            if (par == 0){
                sum_par=sum_par+i;
            }
            System.out.println(sum_par);
        }

    }


}
