package Soluciones.Ejercicios_Estructuras_Control_Desicion;

import java.util.Scanner;

/*
Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos, un médico
determina si una persona tiene anemia o no, lo cual depende de su nivel de hemoglobina en la
sangre, de su edad y de su sexo. Si el nivel de hemoglobina que tiene una persona es menor que
el rango que le corresponde, se determina su resultado como positivo y en caso contrario como
negativo. La tabla en la que el médico se basa para obtener el resultado es la siguiente:
EDAD NIVEL DE HEMOGLOBINA
0 - 1 mes 13 - 26 g%
Mayor de 1 y menor o igual de 6 meses 10 - 18 g%
Mayor de 6 y menor o igual de 12 meses 11 - 15 g%
Mayor de 1 y menor o igual que 5 años 11.5 - 15 g%
Mayor de 5 y menor o igual que 10 años 12.6 – 15.5 g%
Mayor de 10 y menor o igual que 15 años 13 - 15.5 g%
Mujeres mayores de 15 años 12 - 16 g%
Hombres mayores de 15 años 14 - 18 g%
Desarrolle un algoritmo que indique, si una persona tiene Anemia o no.
 */
public class Ejrc_42_Anemia {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        System.out.println("Nivel de hemoglobina");
        double hmg = t.nextInt();
        System.out.println("Paciente menor de uno año(Si o No)");
        t = new Scanner(System.in);
        String menor = t.nextLine();
        boolean bb = menor.equalsIgnoreCase("si");
        int edad;
        String anemia;

        //Paciente menor de 1 año
        if (bb) {
            System.out.println("Ingrese los meses del paciente");
            edad = t.nextInt();
            if (edad < 0) {
                System.out.println("Datos incorrectos");
                return;
            }
            //Calculo Resultado
            anemia = edad <= 1 && hmg < 13 ? "POSITIVO" :
                    edad > 6 && edad < 12 && hmg < 13 ? "POSITIVO" : "NEGATIVO";
        }
        //Paciente mayor de 1 año
        else {
            System.out.println("Ingrese la edad del paciente");
            edad = t.nextInt();
            if (edad < 1) {
                System.out.println("Datos incorrecto");
                return;
            }
            //Calculo Resultado
            anemia = edad < 5 && hmg < 11.5 ? "POSITIVO" :
                    edad >= 5 && edad < 10 && hmg < 12.6 ? "POSITIVO" :
                            edad >= 10 && edad < 15 && hmg < 13 ? "POSITIVO" : "NEGATIVO";

            //Mayor de 15
            if (edad > 15) {
                //determinacion sexo
                System.out.println("Ingrese el sexo del paciente");
                System.out.println("Mujer(M) ó Hombre(H)");
                t = new Scanner(System.in);
                String sex = t.nextLine();
                boolean m = sex.equalsIgnoreCase("mujer") || sex.equalsIgnoreCase("m");
                boolean h = sex.equalsIgnoreCase("hombre") || sex.equalsIgnoreCase("h");
                //Resultado
                if (m) {
                    anemia = hmg < 12 ? "POSITIVO" : "NEGATIVO";
                } else if (h) {
                    anemia = hmg < 14 ? "POSITIVO" : "NEGATIVO";
                } else {
                    return;
                }
            }
        }
        //Resultado final
        System.out.println(anemia);
    }
}
