package Ejercicios_Estructuras_Control_Desicion;

import java.time.LocalDate;
import java.util.Scanner;

/*
Desarrolle un algoritmo que reciba como dato de entrada la fecha de nacimiento de una persona
y a continuación escriba el nombre del signo del zodiaco correspondiente; así como su edad.
Considere la siguiente tabla de signos:
*/
public class Ejrc_38_Zodiaco {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        LocalDate hoy = LocalDate.now();

        System.out.println("Zodiaco");
        System.out.println("<><><><><>");
        System.out.println("Ingrese su dia de nacimiento");
        int dia = t.nextInt();
        if (dia > 0 && dia <= 31) {
            System.out.println("Ingrese su mes de nacimiento");
            int mes = t.nextInt();

            if (mes == 2 && dia > 28 || mes == 4 && dia > 30 || mes == 6 && dia > 30 || mes == 9 && dia > 30 || mes == 11 && dia > 30) {
                System.out.println("Fecha mal ingresada");
            } else if (mes > 0 && mes <= 12) {
                System.out.println("Ingrese su año de nacimiento");
                int anno = t.nextInt();
                if (anno <= hoy.getYear() && anno > 1900) {
                    System.out.print("Su signo zodiacal es ");
                    if (dia >= 22 && mes == 11 || dia <= 21 && mes == 12) {
                        System.out.println("Sagitario");
                    }
                    if (dia >= 22 && mes == 12 || dia <= 20 && mes == 1) {
                        System.out.println("Capricornio");
                    }
                    if (dia >= 21 && mes == 1 || dia <= 19 && mes == 2) {
                        System.out.println("Acuario");
                    }
                    if (dia >= 20 && mes == 2 || dia <= 19 && mes == 3) {
                        System.out.println("Piscis");
                    }
                    if (dia >= 21 && mes == 3 || dia <= 20 && mes == 4) {
                        System.out.println("Aries");
                    }
                    if (dia >= 21 && mes == 4 || dia <= 21 && mes == 5) {
                        System.out.println("Tauro");
                    }
                    if (dia >= 22 && mes == 5 || dia <= 21 && mes == 6) {
                        System.out.println("Géminis");
                    }
                    if (dia >= 22 && mes == 6 || dia <= 22 && mes == 7) {
                        System.out.println("Cáncer");
                    }
                    if (dia >= 23 && mes == 7 || dia <= 23 && mes == 8) {
                        System.out.println("Leo");
                    }
                    if (dia >= 24 && mes == 8 || dia <= 22 && mes == 9) {
                        System.out.println("Virgo");
                    }
                    if (dia >= 23 && mes == 9 || dia <= 22 && mes == 10) {
                        System.out.println("Libra");
                    }
                    if (dia >= 23 && mes == 11 || dia <= 21 && mes == 12) {
                        System.out.println("Escorpión");
                    }
                } else {
                    System.out.println("Año incorrecto");
                }
                //calculo fecha de nacimiento


                if (anno <= 1999) {
                    int gen_z = 2000 - anno;
                    int edad = hoy.getYear() - 2000 + gen_z;
                    if ((hoy.getDayOfMonth()<dia) && (hoy.getMonthValue()<=mes)){
                        edad--;
                        System.out.println("Su edad es "+edad);
                    }else {
                        System.out.println("Su edad es "+edad);
                    }
                } else {
                    int edad = hoy.getYear() - anno;
                    if (hoy.getDayOfMonth()<dia && hoy.getMonthValue()<=mes){
                        edad--;
                        System.out.println("Su edad es de "+edad);
                    }else {
                        System.out.println("Su edad es "+edad);
                    }
                }

            } else {
                System.out.println("Mes incorrecto");
            }

        } else {
            System.out.println("Dia incorrecto");
        }

    }
}
