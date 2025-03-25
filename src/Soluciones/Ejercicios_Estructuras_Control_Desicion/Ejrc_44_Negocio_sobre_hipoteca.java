package Soluciones.Ejercicios_Estructuras_Control_Desicion;
/*Una persona desea iniciar un negocio, para lo cual piensa verificar cuánto dinero le prestaría el
banco por hipotecar su casa. Tiene una cuenta bancaria, pero no quiere disponer de ella a menos
que el monto por hipotecar su casa sea muy pequeño. Si el monto de la hipoteca es menor que
$1.000.000 entonces invertirá el 50% de la inversión total, y un socio invertirá el otro 50%. Si el
monto de la hipoteca es de $1.000.000 o más, entonces invertirá el monto total de la hipoteca y
el resto del dinero que se necesite para cubrir la inversión total se repartirá a partes iguales entre el
socio y él.*/

import java.util.Scanner;

public class Ejrc_44_Negocio_sobre_hipoteca {

public static void main(String[] args){

    Scanner t = new Scanner(System.in);
    System.out.println("Valor de la inversion requerida");
    double inversion_total = t.nextDouble();
    System.out.println("Ingrese el valor de tasación de la casa");
    double tasacion = t.nextDouble();
    System.out.println("Ingrese el porcentaje de préstamo del banco");
    double pr_prestamo = t.nextDouble();

    double hipoteca = tasacion*(pr_prestamo/100);
    double socio;
    double inversion;
    System.out.println("La hipoteca sera de "+hipoteca);

    if (hipoteca <1000000){
        inversion = inversion_total *0.5;
        socio = inversion_total *0.5;

        System.out.printf("La inversion suya sera de %.0f\n",inversion);
        System.out.printf("La inversion del socio debera ser %.0f\n",socio);
    }else if(hipoteca >=1000000){
        double faltante = inversion_total-hipoteca;
        inversion=hipoteca+(faltante/2);
        socio=faltante/2;
        System.out.printf("La inversion suya sera de %.0f\n",inversion);
        System.out.printf("La inversion del socio debera ser %.0f\n",socio);
    }
}
}
