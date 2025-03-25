package Soluciones.Estructuras_Control_Repetitivo;


import java.util.Scanner;

/*
52. Una persona debe realizar un muestreo con 100 personas para determinar el promedio de peso de
los niños, jóvenes, adultos y viejos que existen en su zona habitacional. Para ello, conforme
encuentra a las personas introduce los datos a su computadora, la cual mediante un programa las
clasifica y despliega los cuatro promedios que la persona requiere. Las categorías se trabajan de
acuerdo a la siguiente tabla:
*/
public class Ejrc_52_Promedios_pesos {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("PROMEDIO DE PESO DE LA POBLACION");
        System.out.println("<><><><<><><><><><><><><>>><>><>");


        int n = 0;
        int j = 0;
        int a = 0;
        int v = 0;
        int n_peso = 0;
        int j_peso = 0;
        int a_peso = 0;
        int v_peso = 0;


        String on;
        System.out.println("Inicio de toma de datos");
        do {

            System.out.println("Edad de la persona");
            int edad = t.nextInt();
            if (edad >= 0) {
                System.out.println("Peso de la persona");
                int peso = t.nextInt();
                if (peso > 0) {
                    //Promedios
                    if (edad <= 12) {
                        n++;
                        n_peso = n_peso + peso;
                    } else if (edad <= 29) {
                        j++;
                        j_peso = j_peso + peso;
                    } else if (edad <= 59) {
                        a++;
                        a_peso = a_peso + peso;
                    } else if (edad > 60) {
                        v++;
                        v_peso = v_peso + peso;
                    }

                } else {
                    System.out.println("Datos incorrectos");
                }
            } else {
                System.out.println("Datos incorrectos");
            }
            System.out.println("Desea ingresar los datos de una persona");
            t = new Scanner(System.in);
            on = t.nextLine();
            t = new Scanner(System.in);

        } while (on.equalsIgnoreCase("si"));
        //Promedio
        if (n > 0) {
            int pr_n = n_peso / n;
            System.out.println("Promedio de peso de niños: " + pr_n);
        } else {
            System.out.println("No se ingresaron datos para niños.");
        }

        if (j > 0) {
            int pr_j = j_peso / j;
            System.out.println("Promedio de peso de jóvenes: " + pr_j);
        } else {
            System.out.println("No se ingresaron datos para jóvenes.");
        }

        if (a > 0) {
            int pr_a = a_peso / a;
            System.out.println("Promedio de peso de adultos: " + pr_a);
        } else {
            System.out.println("No se ingresaron datos para adultos.");
        }

        if (v > 0) {
            int pr_v = v_peso / v;
            System.out.println("Promedio de peso de viejos: " + pr_v);
        } else {
            System.out.println("No se ingresaron datos para viejos.");


        }

    }
}





