package Soluciones.Estructuras_Control_Repetitivo;

public class Ejrc_69 {
    public static int sumaDivisores(int x) {
        int suma = 0;
        for (int i =1; i < x ; i++) {
            if (x % i == 0) {
                suma += i;
            }
        }

        return (suma);
    }
    public static void main (){
            int a = 1;
            int pares = 0;


            while (pares<5){
                int b = sumaDivisores(a);//284
                int suma_divisores_b = sumaDivisores(b);//220
                if (suma_divisores_b == a && a != b){
                    System.out.println(a+" | "+b);
                    pares++;
                }
                a++;
            }
    }

}
