package Soluciones.Ejercicios_Principios;
/*13. Determine cuánto dinero hay en un banco que contiene N1 billetes de 50000, N2 billetes de 20000,
N3 billetes de 10000, N4 billetes de 5000, N5 billetes de 2000, N6 billetes 1000, N7 billetes de 500 y
N8 billetes de 100.*/
import java.util.Scanner;

public class Ejrc_13_Dinero_banco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            int ncincuentamil;
            int nveintemil;
            int ndiezmil;
            int ncincomil;
            int ndosmil;
            int nquinientos;
            int nmil;
            int ncien;


            System.out.println("CANTIDAD DINERO");
            System.out.println("Ingrese la cantidad de billetes de 50000");
            int billetes= teclado.nextInt();
            ncincuentamil=billetes*50000;
            System.out.println("Ingrese la cantidad de billetes de 20000");
            billetes= teclado.nextInt();
            nveintemil=billetes*20000;
            System.out.println("Ingrese la cantidad de billetes de 10000");
            billetes= teclado.nextInt();
            ndiezmil=billetes*10000;
            System.out.println("Ingrese la cantidad de billetes de 5000");
            billetes= teclado.nextInt();
            ncincomil=billetes*5000;
            System.out.println("Ingrese la cantidad de billetes de 2000");
            billetes= teclado.nextInt();
            ndosmil=billetes*2000;
            System.out.println("Ingrese la cantidad de billetes de 1000");
            billetes= teclado.nextInt();
            nmil=billetes*1000;
            System.out.println("Ingrese la cantidad de billetes de 500");
            billetes= teclado.nextInt();
            nquinientos=billetes*500;
            System.out.println("Ingrese la cantidad de billetes de 100");
            billetes= teclado.nextInt();
            ncien=billetes*100;


            int total=ncincuentamil+nveintemil+ndiezmil+ncincomil+ndosmil+nquinientos+nmil+ncien;

            //TOTAL
            System.out.println("=======================================");
            System.out.println("TOTAL DINERO EN EL BANCO");
            System.out.println(total);


    }




}

