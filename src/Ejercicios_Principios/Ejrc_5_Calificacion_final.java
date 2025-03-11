package Ejercicios_Principios;
/*5. Un alumno desea saber cuál será su calificación final en la materia de computación. Dicha calificación
se compone de los siguientes porcentajes: 55% del promedio de sus tres calificaciones parciales,
        30% de la calificación del examen final y 15% de la calificación de un trabajo final.*/

import java.util.Scanner;

public class Ejrc_5_Calificacion_final {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        double[] calificacion = new double [3];
        double promedio=0;
        double calificacion_parcial;
        double trabajo_final;

        System.out.println("Calificaciones parciales");
        System.out.println("------------------------");

        //Ingreso calificaciones
        for(int i = 0; 3 > i; i++){
            System.out.println("Ingrese la calificacion " + (i+1));
            calificacion[i]= teclado.nextInt();
        }

        System.out.println("Examen final");
        System.out.println("------------------------");
        System.out.println("Ingrese la calificacion de su examen final");
        double examen_final = (teclado.nextDouble() * 0.30);
        System.out.println(examen_final);


        System.out.println("Trabajo final");
        System.out.println("------------------------");
        System.out.println("Ingrese la calificacion de su trabajo final");
        trabajo_final=(teclado.nextDouble()*0.15);
        System.out.println(trabajo_final);

        //Calculo notas

        for(int i = 0; 3 > i; i++){
             promedio=promedio+calificacion[i];
        }
        calificacion_parcial=(promedio /3)*0.55;

        double nota_final = (calificacion_parcial+examen_final+trabajo_final);

        //Mostrar nota final

        System.out.println("-------------------------");
        System.out.println("Su NOTA FINAL fue de "+nota_final);


    }

}
