package Soluciones.Estructuras_Control_Repetitivo;

public class Ejrc_69 {
    public static int esDivisor (int x, int y){
        int suma = 0;
        for(int i =1; suma<y; i++) {
            if(x%i==0){
                suma+=i;
            }
        }
        return(suma);
    }
    public static void main (){
            int a = 220;
            int b = 284;
            int par_a;
            int par_b;
            int pares = 0;

            while (pares<4){

                if(esDivisor(a,b)==b&&esDivisor(b,a)==a){
                    pares++;
                    par_a=esDivisor(a,b);
                    par_b=esDivisor(b,a);
                    System.out.println("Son amigos "+par_a+" "+par_b);
                }
                a+=1;
                b+=1;


            }



    }



}
