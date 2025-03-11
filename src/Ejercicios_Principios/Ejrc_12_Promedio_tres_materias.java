package Ejercicios_Principios;

import java.util.Scanner;

public class Ejrc_12_Promedio_tres_materias {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        double matematica;
        double fisica;
        double quimica;
        double tareas =0;
        double nota;


        System.out.println("CALCULO DE PROMEDIOS");
        System.out.println("======================");

        //MATEMATICAS
        System.out.println("MATEMATICAS");
        System.out.println("======================");
        System.out.println("Ingrese la nota de la evaluacion");
        nota = teclado.nextInt();
        double examen=(nota*0.9);

        for (int i=0; i<=2; i++){
            System.out.println("Ingrese la nota "+(i+1)+" de las tareas");
            nota = teclado.nextInt();
            tareas = tareas + nota;
            }
        double tareas_matematicas=(tareas/3)*0.1;
        matematica=(examen+tareas_matematicas);
        tareas=0;


        //FISICA
        System.out.println("FISICA");
        System.out.println("======================");
        System.out.println("Ingrese la nota de la evaluacion");
        nota = teclado.nextInt();
        examen =(nota*0.8);

        for (int i=0; i<=1; i++){
            System.out.println("Ingrese la nota "+(i+1)+" de las tareas");
            nota = teclado.nextInt();
            tareas = tareas + nota;
        }
        double tareas_fisica=(tareas/2)*0.2;
        fisica=(examen +tareas_fisica);
        tareas=0;


        //QUIMICA
        System.out.println("QUIMICA");
        System.out.println("======================");
        System.out.println("Ingrese la nota de la evaluacion");
        nota = teclado.nextInt();
        examen =(nota*0.85);

        for (int i=0; i<=2; i++){
            System.out.println("Ingrese la nota "+(i+1)+" de las tareas");
            nota = teclado.nextInt();
            tareas = tareas + nota;
        }
        double tareas_quimica=(tareas/3)*0.15;
        quimica=(examen +tareas_quimica);


        //PROMEDIO FINAL

        double promedio_final=(matematica+fisica+quimica)/3;

        //NOTA FINAL
        System.out.println("==========================");
        System.out.println("PROMEDIO MATEMATICAS: "+matematica);
        System.out.println("PROMEDIO FISICA: "+quimica);
        System.out.println("PROMEDIO QUIMICA: "+quimica);
        System.out.println("==========================");
        System.out.println("PROMEDIO FINAL: "+promedio_final);



    }

}
