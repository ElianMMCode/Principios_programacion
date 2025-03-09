import java.util.Scanner;

public class Promedio_edades {
    public static void main (String[] args){

        int edad1, edad2, edad3;

        Scanner teclado=new Scanner (System.in);

        //Ingreso de edades
        System.out.println("Ingrese una edad");
        edad1=teclado.nextInt();
        System.out.println("Ingrese una edad");
        edad2=teclado.nextInt();
        System.out.println("Ingrese una edad");
        edad3=teclado.nextInt();
        //Promedio edades

        int promedio= (edad1+edad2+edad3)/3;


        //Mostrar promedio

        System.out.println("El promedio de las edades "+edad1+" ,"+edad2+" ,"+edad3+" "+"es igual a "+promedio);

    }
}
