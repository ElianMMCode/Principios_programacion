package Ejercicios_Estructuras_Control_Desicion;

import java.util.Scanner;

/*
El dueño de una empresa desea planificar las decisiones financieras que tomará en el siguiente
año. La manera de planificarlas depende de lo siguiente: Si actualmente su capital se encuentra
con saldo negativo, pedirá un préstamo bancario para que su nuevo saldo sea de $10000. si su
capital tiene actualmente un saldo positivo pedirá un préstamo bancario para tener un nuevo saldo
de $20000, pero si su capital tiene actualmente un saldo superior a los $20000 no pedirá ningún
préstamo.
Posteriormente, repartirá su presupuesto de la siguiente manera:
$5000 para equipo de cómputo
$2000 para mobiliario y del resto la mitad será para la compra de insumos y la otra para
otorgar incentivos al personal.
Desplegar qué cantidades se destinarán para la compra de insumos e incentivos al personal y, en caso
de que fuera necesario, a cuánto ascendería la cantidad que se pediría al banco.
*/
public class Ejrc_43_Planificar_empresa {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese el monto del capital actual");
        double cpt = t.nextDouble();

        //double prestamo;

        //if(capital<0){
        //    prestamo = cpt+1000;
        //}
        double prestamo = cpt<0 ? cpt+1000 : 2000-cpt;
        System.out.println(prestamo);

    }
}
