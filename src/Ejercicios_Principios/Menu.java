package Ejercicios_Principios;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Menu {
    public static int ejercicio1(int edad1, int edad2, int edad3){
        return (edad1+edad2+edad3)/3;
    }
    public static double ejercicio2(int inversion){
        return (inversion * (0.02));
    }
    public static double ejercicio3(double sueldo, double ventas){
        return (ventas*(sueldo*0.10));
    }
    public static double ejercicio4(double precio_compras){
        double descuento = precio_compras * 0.15;
        precio_compras -= descuento;
        return (precio_compras);
    }
    public static double ejercicio5(double [] calificacion, double examen_final, double trabajo_final){
        double promedio = 0;
        for(int i = 0; 3 > i; i++){
            promedio = promedio+calificacion[i];
        }
        double calificacion_parcial=(promedio/3)*0.55;
        return ((calificacion_parcial+examen_final+trabajo_final));
    }
    public static void ejercicio6(int mujeres, int hombres, int estudiantes){

        double porcentaje_mujeres = ((double) mujeres /estudiantes)* 100;
        double porcentaje_hombres = ((double) hombres /estudiantes)* 100;
        System.out.println("El porcentaje de mujeres en el curso es de " + porcentaje_mujeres +"\n"+"El porcentaje de hombres en el curso es de " + porcentaje_hombres);
    }
    public static void ejercicio7(double metro){
        double pulgadas = 39.27*metro;
        double pies = 12*pulgadas;
        System.out.println(pulgadas+" pulgadas");
        System.out.println(pies+" pies");
    }
    public static void ejercicio8(double a, double b, double c){
        //Calculo area

        double p = (a+b+c)/2;

        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        DecimalFormat df = new DecimalFormat("#.000");

        System.out.println("El area del triangulo es de "+df.format(area));
    }
    public static double ejercicio9(double precio_hora, double horas){
        //calculo sueldo

        double sueldo=precio_hora*horas;
        double descuento=sueldo*0.20;
        return (sueldo-descuento);
    }
    public static double ejercicio10 (double cambio, double moneda){
        return(cambio*moneda);
    }





    public static void main(String[] args){
        int op;
        String salir;
        Scanner t = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Ingrese el ejercicio que desea ver");
            op = t.nextInt();
            switch (op) {

                case 1:
                    int edad1, edad2, edad3;
                    System.out.println("Ingrese una edad");
                    edad1 = t.nextInt();
                    System.out.println("Ingrese una edad");
                    edad2 = t.nextInt();
                    System.out.println("Ingrese una edad");
                    edad3 = t.nextInt();

                    System.out.println("El promedio de las edades " + edad1 + " ," + edad2 + " ," + edad3 + " " + "es igual a " + ejercicio1(edad1,edad2,edad3));
                    break;
                case 2:
                    int inversion;
                    //Ingreso informacion
                    System.out.println("Ingrese el monto de la inversion");
                    inversion = t.nextInt();
                    //Mostrar por pantalla
                    double ganancia = ejercicio2(inversion);
                    System.out.println("Las ganancias del mes fueron " + ganancia);
                    break;
                case 3:
                    //Ingreso informacion
                    System.out.println("Ingrese el sueldo base");
                    double sueldo = t.nextDouble();

                    //Reinicio del Scanner
                    t = new Scanner(System.in);

                    System.out.println("Ingrese el numero de ventas realizadas");
                    double ventas = t.nextInt();

                    //Mostrar total
                    double comisiones = ejercicio3(sueldo,ventas);
                    double total_sueldo = comisiones + sueldo;

                    System.out.println("Su ganancias en base a "+ventas+" ventas fueron de "+comisiones+"\n");

                    System.out.println("Su sueldo total fue de "+total_sueldo);
                    break;
                case 4:
                    int precio_compras;

                    //Ingreso informacin
                    System.out.println("Ingrese el valor de las compras");
                    precio_compras = t.nextInt();

                    //Mostrar total
                    double total = ejercicio4(precio_compras);
                    System.out.println("El total de las compras con descuento es de "+total);
                    break;
                case 5:
                    double[] calificacion = new double [3];
                    double trabajo_final;

                    System.out.println("Calificaciones parciales");
                    System.out.println("------------------------");

                    //Ingreso calificaciones
                    for(int i = 0; 3 > i; i++){
                        System.out.println("Ingrese la calificacion " + (i+1));
                        calificacion[i]= teclado.nextInt();
                    }

                    System.out.println("Examen final");
                    System.out.println("------------------------");
                    System.out.println("Ingrese la calificacion de su examen final");
                    double examen_final = (teclado.nextDouble() * 0.30);


                    System.out.println("Trabajo final");
                    System.out.println("------------------------");
                    System.out.println("Ingrese la calificacion de su trabajo final");
                    trabajo_final=(teclado.nextDouble()*0.15);

                    //Mostrar nota final
                    double nota_final = ejercicio5(calificacion,examen_final,trabajo_final);
                    System.out.println("-------------------------");
                    System.out.println("Su NOTA FINAL fue de "+nota_final);

                case 6:

                    int estudiantes, hombres, mujeres;

                    //Ingreso de informacion
                    System.out.println("Ingrese el numero de estudiantes del curso");
                    estudiantes=t.nextInt();

                    System.out.println("Ingrese el numero de mujeres");
                    mujeres= t.nextInt();

                    System.out.println("Ingrese el numero de hombres");
                    hombres= t.nextInt();

                    if(estudiantes==mujeres+hombres) {
                       ejercicio6(mujeres,hombres,estudiantes);
                    }else {
                        System.out.println("Verfique los datos ingresados");
                    }
                    break;
                case 7:
                    double metro;

                    System.out.println("CONVERSION METROS A PULGADAS Y PIES");
                    System.out.println("===================================");
                    System.out.println("Ingrese los metros a convertir");
                    metro=t.nextDouble();

                    //CONVERSION

                    System.out.println("====================================");
                    System.out.println(metro+" metros es equivalentes a:");
                    ejercicio7(metro);
                    break;
                case 8:
                    //Ingreso de medidas
                    System.out.println("Ingrese la medida del lado a");
                    double a = t.nextDouble();

                    System.out.println("Ingrese la medida del lado b");
                    double b = t.nextDouble();

                    System.out.println("Ingrese la medida del lado c");
                    double c = t.nextDouble();

                    ejercicio8(a,b,c);

                    break;
                case 9:
                    double precio_hora = 5.532;
                    int horas;

                    //Ingreso de horas
                    System.out.println("Ingrese las horas trabajadas");
                    horas=t.nextInt();



                    //Mostrar sueldo neto

                    System.out.println("El sueldo neto del empleado es de "+ejercicio9(precio_hora,horas));
                    break;
                case 10:
                    DecimalFormat df = new DecimalFormat("#.00");
                    //divisas a 1 peseta
                    double pesetas=1;
                    double ch_austriacos=0.0010450729513173667;
                    double dolar=0.008163331945566904;
                    double drac_griegos=0.011285790061733272;
                    double fr_belga=0.003089012998566698;
                    double fr_francesa=0.04972650422675286;
                    double lb_esterlina=0.005588527869988488;
                    double lb_italiana=0.10765421466250404;
                    double moneda= 0;

                    //Seleccion de divisas a cambiar

                    System.out.println("Cambio de divisas");
                    System.out.println("=================");
                    System.out.println("Ingrese el monto a realizar el cambio");
                    double monto = t.nextDouble();

                    System.out.println("Ingrese con un numero el tipo de moneda");
                    System.out.println("Peseta(1)");
                    System.out.println("Chelin austriaco(2)");
                    System.out.println("Dolar(3)");
                    System.out.println("Dracma(4)");
                    System.out.println("Franco Belga(5)");
                    System.out.println("Franco Frances(6)");
                    System.out.println("Libra Esterlina(7)");
                    System.out.println("Libra Italiana(8)");

                    teclado=new Scanner(System.in);
                    int opcion= (t.nextInt()-1);

                    //Moneda1
                    switch (opcion) {
                        case 0:
                            moneda=pesetas;
                            break;
                        case 1:
                            moneda= ch_austriacos;
                            break;
                        case 2:
                            moneda= dolar;
                            break;
                        case 3:
                            moneda= drac_griegos;
                            break;
                        case 4:
                            moneda= fr_belga;
                            break;
                        case 5:
                            moneda= fr_francesa;
                            break;
                        case 6:
                            moneda= lb_esterlina;
                            break;
                        case 7:
                            moneda= lb_italiana;
                            break;
                        default:
                            System.out.println("Valor ingresado incorrecto");
                            break;
                    }
                    if (opcion>=0&&opcion<=7) {
                        //Monto a pesetas
                        System.out.println(moneda);
                        double cambio = monto / moneda;



                        //Seleccion de divisas a cambiar
                        System.out.println("Ingrese con un numero la moneda a la cual quiere hacer el cambio");
                        System.out.println("Peseta(1)");
                        System.out.println("Chelin austriaco(2)");
                        System.out.println("Dolar(3)");
                        System.out.println("Dracma(4)");
                        System.out.println("Franco Belga(5)");
                        System.out.println("Franco Frances(6)");
                        System.out.println("Libra Esterlina(7)");
                        System.out.println("Libra Italiana(8)");
                        opcion= (t.nextInt()-1);

                        switch (opcion) {
                            case 0:
                                moneda=pesetas;
                                System.out.println(moneda);
                                System.out.println("==============================");
                                System.out.println("El cambio es "+df.format(ejercicio10(cambio,moneda))+" pesetas");
                                break;
                            case 1:
                                moneda= ch_austriacos;
                                System.out.println(moneda);
                                System.out.println(monto);

                                System.out.println("==============================");
                                System.out.println("El cambio es "+df.format(ejercicio10(cambio,moneda))+" chelines austriacos");
                                break;
                            case 2:
                                moneda= dolar;
                                System.out.println("==============================");
                                System.out.println("El cambio es "+df.format(ejercicio10(cambio,moneda))+" dolares");
                                break;
                            case 3:
                                moneda= drac_griegos;
                                System.out.println("==============================");
                                System.out.println("El cambio es "+df.format(ejercicio10(cambio,moneda))+" dracmas");
                                break;
                            case 4:
                                moneda= fr_belga;
                                System.out.println("==============================");
                                System.out.println("El cambio es "+df.format(ejercicio10(cambio,moneda))+" francos belgas");
                                break;
                            case 5:
                                moneda= fr_francesa;
                                System.out.println("==============================");
                                System.out.println("El cambio es "+df.format(ejercicio10(cambio,moneda))+" francos franceses");
                                break;
                            case 6:
                                moneda= lb_esterlina;
                                System.out.println("==============================");
                                System.out.println("El cambio es "+df.format(ejercicio10(cambio,moneda))+" libras esterlinas");
                                break;
                            case 7:
                                moneda= lb_italiana;
                                System.out.println("==============================");
                                System.out.println("El cambio es "+df.format(ejercicio10(cambio,moneda))+" libra italiana");
                                break;
                            default:
                                System.out.println("Valor ingresado incorrecto");
                        }

                    }
                break;
                default:
                    System.out.println("Ejercicio no valido");
            }
            System.out.println("Desea ver otro ejercicio (Y/N)");
            salir = teclado.nextLine();


        }while(salir.equalsIgnoreCase("Y"));


    }

}

