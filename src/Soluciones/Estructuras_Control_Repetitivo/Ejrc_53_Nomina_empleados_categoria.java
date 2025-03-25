package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

/*
53. Una empresa requiere realizar el cálculo de la nómina semanal de un conjunto M de empleados; para
ello dispone que los datos de entrada son: nombre, nacionalidad (V o E), edad, tipo de empleado
(1,2,3) y número de horas trabajadas. Con esta información se desea calcular e imprimir:
a. Sueldo básico o bruto. Considere para ello que el pago por hora depende del tipo de
empleado, según la siguiente distribución:
• Si el tipo empleado es 1 Bs. 5000
• Si el tipo empleado es 2 Bs. 10000
• Si el tipo empleado es 3 Bs. 15000
b. Seguro Social, que corresponde al 3% del Sueldo Básico, si este último es mayor a 100000.
c. Total, de venezolanos por tipo de empleado.
d. Total, de Extranjeros cuya edad es impar.
e. Promedio de edad de todos los empleados.
f. Total, general a pagar en sueldos.
 */
public class Ejrc_53_Nomina_empleados_categoria {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        Scanner t = new Scanner(System.in);
        System.out.println("CALCULO NOMINA EMPLEADOS");
        System.out.println("<><><><><><><><><><><><>");
        System.out.println("Ingrese la cantidad de empleados");
        int n_empleados = t.nextInt();
        if (n_empleados >= 1) {


            //tabla de datos
            String[] nombre = new String[n_empleados];
            String[] nacionalidad = new String[n_empleados];
            int[] edad = new int[n_empleados];
            int[] tp_empleado = new int[n_empleados];
            int[] h_trb = new int[n_empleados];
            int[] sueldo = new int[n_empleados];
            double[] sg_sc = new double[n_empleados];
            int total_col = 0;
            int total_venz = 0;
            int total_venz_tp1 = 0;
            int total_venz_tp2 = 0;
            int total_venz_tp3 = 0;
            int total_col_edad_impr = 0;
            double total_sueldos = 0;
            double total_edad = 0;
            //ingreso informacion

            for (int i = 0; i < n_empleados; i++) {
                //NOMBRE
                System.out.println("Ingrese el nombre del empleado");
                t = new Scanner(System.in);
                nombre[i] = t.nextLine();

                //NACIONALIDAD
                System.out.println("Ingrese la nacionalidad\nC(Colombiano)V(Venezolano)");
                nacionalidad[i] = t.nextLine();

                //EDAD
                System.out.println("Ingrese la edad");
                edad[i] = n.nextInt();
                if (edad[i] >= 18) {
                    //TIPO EMPLEADO
                    System.out.println("Ingrese el tipo de empleado\nTipo (1-2-3)");
                    tp_empleado[i] = n.nextInt();
                    if (tp_empleado[i] > 0 && tp_empleado[i] <= 3) {
                        //HORAS TRABAJADAS
                        System.out.println("Ingrese las horas trabajadas");
                        h_trb[i] = n.nextInt();
                        if (h_trb[i] < 1) {
                            System.out.println("Datos incorrectos");
                        }
                    } else {
                        System.out.println("Datos incorrectos");
                    }
                } else {
                    System.out.println("Edad incorrecta");
                }
            }
            //calculo
            for (int i = 0; i < n_empleados; i++) {
                //SUELDO por tipo
                sueldo[i] = tp_empleado[i] == 1 ? h_trb[i] * 5000 :
                        tp_empleado[i] == 2 ? h_trb[i] * 10000 :
                                tp_empleado[i] == 3 ? h_trb[i] * 15000 : 0;
                //Seguro social si aplica
                sg_sc[i] = sueldo[i] > 100000 ? sueldo[i] * 0.03 : 0;
                //Colombianos y venezolanos
                if (nacionalidad[i].equalsIgnoreCase("c")) {
                    total_col++;
                    //colompianos edad par
                    total_col_edad_impr = edad[i] % 2 != 0 ? total_col_edad_impr+1 : total_col_edad_impr;


                } else if (nacionalidad[i].equalsIgnoreCase("v")) {
                    total_venz++;
                    //venezolanos por tipo
                    total_venz_tp1 = tp_empleado[i] == 1 ? total_venz_tp1+1 :total_venz_tp1;
                            total_venz_tp2 = tp_empleado[i] == 2 ? total_venz_tp2+1 :total_venz_tp2;
                            total_venz_tp3 = tp_empleado[i] == 3 ? total_venz_tp3+1 : total_venz_tp3;
                }
                //Suma de los sueldos
                total_sueldos =total_sueldos +sueldo[i];
                total_edad = total_edad + edad[i];

            }
            //promedio de sueldos
            double pr_sueldos = total_sueldos/n_empleados;
            double pr_edad = total_edad/n_empleados;

            System.out.println("Desea conocer el detalle de algun empleado(SI/NO)");
            String dtll = t.nextLine();
            if (dtll.equalsIgnoreCase("Si")){
                System.out.println("Ingrese el numero de empleado");
                int id = n.nextInt();
                if(id<n_empleados) {
                    System.out.println("Nombre\n"+nombre[id]);
                    System.out.println("Nacionalidad\n"+nacionalidad[id]);
                    System.out.println("Edad\n"+edad[id]);
                    System.out.println("Seguro social\n"+sg_sc[id]);
                    System.out.println("Sueldo\n"+sueldo[id]);
                }else{
                    System.out.println("Valor erroneo de id empleado");
                }
            }
            System.out.println("Total empleados tipo 1 venezolanos\n"+total_venz_tp1);
            System.out.println("Total empleados tipo 2 venezolanos\n"+total_venz_tp2);
            System.out.println("Total empleados tipo 3 venezolanos\n"+total_venz_tp3);
            System.out.println("Total empleados venezolacons\n"+total_venz);
            System.out.println("<><><><><><><><><><><><><>><><><><><><><><>><><>><>");
            System.out.println("Total colombianos\n"+total_col);
            System.out.println("Total empleados de edad impar colombianos\n"+total_col_edad_impr);
            System.out.println("<><><><><><><><><><><><><>><><><><><><><><>><><>><>");
            System.out.println("Edad promedio de todos los empleaddos\n"+pr_edad);
            System.out.println("<><><><><><><><><><><><><>><><><><><><><><>><><>><>");
            System.out.println("Promedio de sueldos en la empresa\n"+pr_sueldos);
            System.out.println("Total a pagar en sueldos\n"+total_sueldos);


        } else {
            System.out.println("Numero de empleados incorrecto");

        }

    }
}


