package Ejercicios_Estructuras_Control_Desicion;

import java.util.Scanner;

public class Ejrc_41_Reforestacion {
    /*
    41. El gobierno del estado de México desea reforestar un bosque que mide determinado número de
    hectáreas. Si la superficie del terreno excede a 1 millón de metros cuadrados, entonces decidirá
    sembrar de la siguiente manera:
    PORCENTAJE DE LA SUPERFICIE DEL BOSQUE TIPO DE ÁRBOL
    70% Pino
    20% Oyamel
    10% Cedro
    Si la superficie del terreno es menor o igual a un millón de metros cuadrados, entonces decidirá
    sembrar de la siguiente manera:
    PORCENTAJE DE LA SUPERFICIE DEL BOSQUE TIPO DE ÁRBOL
    50% Pino
    30% Oyamel
    20% Cedro
    El gobierno desea saber el número de pinos, oyameles y cedros que tendrá que sembrar en el bosque,
    si se sabe que en 10 metros cuadrados caben 8 pinos, en 15 metros cuadrados caben 15 oyameles y
    7 en 18 metros cuadrados caben 10 cedros. También se sabe que una hectárea equivale a 10 mil
    metros cuadrados.
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("REFORESTACION");
        System.out.println("<><><><><><><>");
        System.out.println("Ingrese la longitud del terreno en Metros(m)");
        int lng = t.nextInt();
        System.out.println("Ingrese el ancho del terreno en Metros(m)");
        int wd = t.nextInt();
        int terreno = lng * wd;
        double tr_pino;
        double tr_oyamel;
        double tr_cedro;


        if (terreno > 1000000) {
            tr_pino = terreno * 0.7;
            tr_oyamel = terreno * 0.3;
            tr_cedro = terreno * 0.1;
        } else {
            tr_pino = terreno * 0.5;
            tr_oyamel = terreno * 0.3;
            tr_cedro = terreno * 0.2;
        }
        int pino = (int) ((tr_pino / 10) * 8);
        int oyamel = (int) tr_oyamel;
        int cedro = (int) ((tr_cedro / 18) * 10);

        System.out.println("Dentro del terreno podra plantar");
        System.out.println("Pino " + pino);
        System.out.println("Oyamel " + oyamel);
        System.out.println("Cedro " + cedro);

    }

}
