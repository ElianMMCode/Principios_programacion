import java.util.Scanner;

public class Ejrc_11_Sueldo_neto_trabajador {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        //Ingreso de informacion

        System.out.println("Nombre del empleado");
        String nombre = teclado.nextLine();

        System.out.println("Numero de horas trabajadas");
        teclado= new Scanner(System.in);
        int horas = teclado.nextInt();

        System.out.println("Valor de la hora");
        int valor_hora = teclado.nextInt();

        System.out.println("Horas extras");
        int horas_extras = teclado.nextInt();

        System.out.println("Numero de actualizaciónes académicas");
        int act_academica= teclado.nextInt();

        System.out.println("Numero de hijos");
        int hijos = teclado.nextInt();

        System.out.println("Numero de hogares");
        int hogares= teclado.nextInt();


        //Calculos

        double sueldo_base=horas*valor_hora;
        double total_horas_extras= (valor_hora*0.25)*horas_extras;
        double paro_forzoso= sueldo_base*0.05;
        double politica_habitacionl=sueldo_base*0.02;
        double caja_ahorro=sueldo_base*0.07;
        double total_act_academica=act_academica*25000;
        double total_hijos=hijos*17300;
        double total_hogares=hogares*18000;
        double sueldo_neto=sueldo_base+total_horas_extras-paro_forzoso-politica_habitacionl-caja_ahorro+total_act_academica+total_hijos+total_hogares;

        //Mostrar info
        System.out.println("=============================");
        System.out.println("ASIGNACIONES Y DEDUCCION");
        System.out.println("Nombre = "+nombre);
        System.out.println("Sueldo base = "+sueldo_base);
        System.out.println("Horas extras = "+total_horas_extras);
        System.out.println("==============================");
        System.out.println("Deduccion paro forzoso = "+paro_forzoso);
        System.out.println("Deduccion politica habitacional = "+politica_habitacionl);
        System.out.println("Deduccion caja de ahorro = "+caja_ahorro);
        System.out.println("==============================");
        System.out.println("Asgnacion por actualizacion academica = "+total_act_academica);
        System.out.println("Asgnacion por hijo = "+total_hijos);
        System.out.println("Asgnacion por hogar = "+total_hogares);
        System.out.println("==============================");
        System.out.println("SUELDO NETO");
        System.out.println(sueldo_neto);




    }

}
