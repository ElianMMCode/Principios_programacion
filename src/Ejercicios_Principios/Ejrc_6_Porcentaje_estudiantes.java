package Ejercicios_Principios;
/*6. Un maestro desea saber qué porcentaje de hombres y qué porcentaje de mujeres hay en un grupo
de estudiantes.*/
import java.util.Scanner;

public class Ejrc_6_Porcentaje_estudiantes {

    public static void main(String[] args){


        Scanner teclado= new Scanner(System.in);
        int estudiantes, hombres, mujeres;


        //Ingreso de informacion
        System.out.println("Ingrese el numero de estudiantes del curso");
        estudiantes=teclado.nextInt();

        System.out.println("Ingrese el numero de mujeres");
        mujeres= teclado.nextInt();

        System.out.println("Ingrese el numero de hombres");
        hombres= teclado.nextInt();

        if(estudiantes==mujeres+hombres) {
            //Calculo porcentaje de estudiantes

            int porcentaje_mujeres = mujeres * (estudiantes / 100);
            int porcentaje_hombres = hombres * (estudiantes / 100);

            System.out.println("El porcentaje de mujeres en el curso es de " + porcentaje_mujeres);
            System.out.println("El porcentaje de mujeres en el curso es de " + porcentaje_hombres);
        }
        System.out.println("Verfique los datos ingresados");


    }

}
