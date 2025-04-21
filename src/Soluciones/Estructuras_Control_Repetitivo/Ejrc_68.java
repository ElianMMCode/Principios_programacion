package Soluciones.Estructuras_Control_Repetitivo;
public class Ejrc_68 {
    public static boolean esPerfecto(int n) {
        int suma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }
        return suma == n;
    }

    public static void main() {
        int n =1;
        int perfecto = 0;
        while (perfecto<3){
            if(esPerfecto(n)){
                System.out.println(n+" es un numero perfecto");
                perfecto++;
            }
            n++;
        }


    }

}
