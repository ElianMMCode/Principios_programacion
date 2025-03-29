package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

public class Ejrc_54_Cuestionarios {
    public static void main(){
        Scanner t = new Scanner(System.in);
        int total_cuestionarios=64;
        int total_preguntas=23;
        int [] promedio  = new int[total_cuestionarios];
        int pt;
        int suma = 0;
        int [][] cuestionarios = new int[total_cuestionarios][total_preguntas];

        //Registro de cuestionarios
        for (int i = 0; i< cuestionarios.length; i++){
            System.out.println("Registro del cuestionario "+(i+1));
            for (int j = 0; j< cuestionarios[0].length ; j++){
                System.out.println("Ingrese la respuesta de la pregunta "+(j+1));
                cuestionarios[i][j] = t.nextInt();
                if (cuestionarios[i][j]<1 || cuestionarios[i][j]>5){
                    System.out.println("Los valores deben estar entre 1 a 5");
                    break;
                }else{
                    System.out.println("Verifique los valores ingresados");
                }
            }
        }

        //Promedio de cada cuestionario
        for (int i = 0; i< cuestionarios.length; i++) {
            pt=0;
            for (int j = 0; j < cuestionarios[0].length; j++) {
                pt += cuestionarios[i][j];
            }
            promedio[i] = pt / total_preguntas;
        }

        //Media de todos los cuestionarios
        for (int[] cuestionario : cuestionarios) {
            for (int j = 0; j < cuestionarios[0].length; j++) {
                suma += cuestionario[j];
            }
        }
        int media = suma / (total_cuestionarios*total_preguntas);
        System.out.println("El promedio de todos los cuestionarios fue de "+media);


        //Promedio mas alto
        int promedio_alto = 0;
        int cuestionario_alto = 0;
        for (int i = 0; i< cuestionarios.length; i++) {
            if (promedio[i]>promedio[i+1]) {
                promedio_alto = promedio[i];
                cuestionario_alto = i+1;
            }
        }
        System.out.println("El promedio mas alto fue de "+promedio_alto);
        System.out.print(" del cuestionario "+ cuestionario_alto);
        //Promedio mas alto
        int promedio_bajo = 0;
        int cuestionario_bajo = 0;
        for (int i = 0; i< cuestionarios.length; i++) {
            if (promedio[i]<promedio[i+1]) {
                promedio_bajo = promedio[i];
                cuestionario_bajo = i+1;
            }
        }
        System.out.println("El promedio mas bajo fue de "+promedio_bajo);
        System.out.print(" del cuestionario "+ cuestionario_bajo);


        //Porcentaje por debajo de 3 y mayor a 4
        int promedio_tres = 0;
        int promedio_cuatro =0;
        int promedio_cuatrocinco =0;
        for (int i = 0; i< cuestionarios.length; i++) {
            if (promedio[i] < 3) {
                promedio_tres++;
            } else if (promedio[i] > 4) {
                promedio_cuatro++;
            } else if (promedio[i]>=4.5){
                promedio_cuatrocinco++;
            }
            System.out.println("Porcentaje de cuestionarios por debajo de 3 "+((promedio_tres/total_cuestionarios)*100));
            System.out.println("Porcentaje de cuestionarios por encima de 4 "+((promedio_cuatro/total_cuestionarios)*100));
            System.out.println("Porcentaje de cuestionarios por encima de 4.5 "+((promedio_cuatrocinco/total_cuestionarios)*100));


        }
        }
}
