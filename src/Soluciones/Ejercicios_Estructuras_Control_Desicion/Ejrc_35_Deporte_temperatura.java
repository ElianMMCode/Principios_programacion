package Soluciones.Ejercicios_Estructuras_Control_Desicion;

import java.util.Scanner;

/*
Desarrolle un algoritmo, que dado como dato una temperatura en grados Fahrenheit, determine
el deporte que es apropiado practicar a esa temperatura, teniendo en cuenta la siguiente tabla:
deporte     temperatura
natacion    temp > 85
tenis       70< temp < 85
golf        32< temp < 70
esqi        10< temp < 32
marcha      temp <= 10
*/
public class Ejrc_35_Deporte_temperatura {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        //temperatura
        System.out.println("Ingrese la temperatura");
        int temp = t.nextInt();

        //natacion
        if (temp > 85) {
            System.out.println("Puede practicar Natación");
        } //tenis
        else if (temp > 70 && temp < 85) {
            System.out.println("Puede practicar Tenis");
        } //golf
        else if (temp > 32 && temp < 70) {
            System.out.println("Puede practicar Golf");
        } //esquí
        else if (temp > 10 && temp < 32) {
            System.out.println("Puede practicar Esquí");
        } //marcha
        else if (temp <= 10) {
            System.out.println("Puede practicar Marcha");
        }
    }
}