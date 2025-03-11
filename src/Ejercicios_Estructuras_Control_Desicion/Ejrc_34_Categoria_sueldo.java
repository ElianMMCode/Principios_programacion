package Ejercicios_Estructuras_Control_Desicion;
/*
34. Construya un programa que, dados como datos la categoría y el sueldo del trabajador, calcule el
aumento correspondiente teniendo en cuenta la siguiente tabla:
categoria       aumento
1               15
2               10
3               8
4               7
Como salida, mostrar la categoría del trabajador y su nuevo sueldo.
 */
import java.util.Scanner;

public class Ejrc_34_Categoria_sueldo {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese el sueldo del empleado");
        int sueldo = t.nextInt();
        System.out.println("Categoría del empleado empleado");
        int cat = t.nextInt();
        double aumento;

        //categoria
        switch (cat) {
            case 1:
                aumento = sueldo + sueldo * 0.15;
                System.out.println("Empleado categoría " + cat);
                System.out.println("Nuevo sueldo " + aumento);
                break;
            case 2:
                aumento = sueldo + sueldo * 0.10;
                //aumento
                System.out.println("Empleado categoría " + cat);
                System.out.println("Nuevo sueldo " + aumento);
                break;
            case 3:
                aumento = sueldo + sueldo * 0.08;
                //aumento
                System.out.println("Empleado categoría " + cat);
                System.out.println("Nuevo sueldo " + aumento);
                break;
            case 4:
                aumento = sueldo + sueldo * 0.07;
                //aumento
                System.out.println("Empleado categoría " + cat);
                System.out.println("Nuevo sueldo " + aumento);
                break;
            default:
                System.out.println("Categoría incorrecta");
        }
    }
}
