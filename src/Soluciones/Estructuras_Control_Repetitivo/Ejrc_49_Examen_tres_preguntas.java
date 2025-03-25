package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

/*
100 personas presentaron una prueba constituida por 3 preguntas. Se requiere desarrollar un
algoritmo o programa que permita determinar la cantidad de personas que respondieron:

9

a. correctamente las tres preguntas.
b. Correctamente solamente la primera y la segunda pregunta.
c. Correctamente solamente la primera y la tercera pregunta.
d. Correctamente solamente la segunda y la tercera pregunta.
e. Correctamente la primera pregunta por lo menos.
f. Correctamente la segunda pregunta por lo menos.
g. Correctamente la tercera pregunta por lo menos.
h. Además, cuántos no respondieron correctamente ninguna pregunta.
*/
public class Ejrc_49_Examen_tres_preguntas {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de persona que contestaron bien la pregunta 1");
        int p1 = t.nextInt();
        System.out.println("Ingrese la cantidad de persona que contestaron bien la pregunta 2");
        int p2 = t.nextInt();
        System.out.println("Ingrese la cantidad de persona que contestaron bien la pregunta 3");
        int p3 = t.nextInt();
        System.out.println("Ingrese la cantidad de persona que contestaron bien la pregunta 1 y 2");
        int p1_p2 = t.nextInt();
        System.out.println("Ingrese la cantidad de persona que contestaron bien la pregunta 1 y 3");
        int p1_p3 = t.nextInt();
        System.out.println("Ingrese la cantidad de persona que contestaron bien la pregunta 2 y 3");
        int p2_p3 = t.nextInt();
        System.out.println("Ingrese la cantidad de persona que contestaron bien la pregunta 1, 2 y 3");
        int p3_p3 = t.nextInt();


        System.out.println("Las personas que cotestaron bien 1 pregunta\n"+(p1+p2+p3));
        System.out.println("Las personas que cotestaron bien 2 preguntas\n"+(p1_p2+p1_p3+p2_p3));
        System.out.println("Las personas que cotestaron bien 3 preguntas\n"+(p3_p3));
        System.out.println("Las personas que no contestaron ninguna bien");
        System.out.println(100-(p1+p2+p3+p1_p2+p1_p3+p2_p3+p3_p3));



    }




}
