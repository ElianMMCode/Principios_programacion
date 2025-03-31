import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicios {

    private void Ejercicio1(){
        int edad1, edad2, edad3;

        Scanner teclado=new Scanner (System.in);

        //Ingreso de edades
        System.out.println("Ingrese una edad");
        edad1=teclado.nextInt();
        System.out.println("Ingrese una edad");
        edad2=teclado.nextInt();
        System.out.println("Ingrese una edad");
        edad3=teclado.nextInt();
        //Promedio edades
        int promedio = (edad1 + edad2 + edad3) / 3;


        //Mostrar promedio

        System.out.println("El promedio de las edades "+edad1+" ,"+edad2+" ,"+edad3+" "+"es igual a "+promedio);
    }
    private void Ejercicio2(){
        int inversion;
        Scanner teclado = new Scanner(System.in);

        //Ingreso informacion
        System.out.println("Ingrese el monto de la inversion");
        inversion = teclado.nextInt();


        //Calculo ganancia

        double ganancia = inversion * (0.02);

        //Mostrar por pantalla

        System.out.println("Las ganancias del mes fueron "+ganancia);
    }

    private void Ejercicio3(){
        Scanner teclado = new Scanner(System.in);
        double sueldo;
        int ventas;

        //Ingreso informacion
        System.out.println("Ingrese el sueldo base");
        sueldo = teclado.nextDouble();

        //Reinicio del Scanner
        teclado = new Scanner(System.in);

        System.out.println("Ingrese el numero de ventas realizadas");
        ventas = teclado.nextInt();

        //Calculo ganancias

        double comisiones = ventas*(sueldo*0.10);
        double total_sueldo = sueldo + comisiones;

        //Mostrar total

        System.out.println("Su ganancias en base a "+ventas+" ventas fueron de "+comisiones+"\n");

        System.out.println("Su sueldo total fue de "+total_sueldo);

    }
    private void Ejercicio4(){
        int precio_compras;

        Scanner teclado = new Scanner(System.in);
        //Ingreso informacin
        System.out.println("Ingrese el valor de las compras");
        precio_compras = teclado.nextInt();

        //Calculo descuento

        double descuento = precio_compras * 0.15;
        double total = precio_compras - descuento;

        //Mostrar total

        System.out.println("El total de las compras con descuento es de "+total);}
    private void Ejercicio5(){
        Scanner teclado = new Scanner(System.in);
        double[] calificacion = new double [3];
        double promedio=0;
        double calificacion_parcial;
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
        System.out.println(examen_final);


        System.out.println("Trabajo final");
        System.out.println("------------------------");
        System.out.println("Ingrese la calificacion de su trabajo final");
        trabajo_final=(teclado.nextDouble()*0.15);
        System.out.println(trabajo_final);

        //Calculo notas

        for(int i = 0; 3 > i; i++){
            promedio=promedio+calificacion[i];
        }
        calificacion_parcial=(promedio /3)*0.55;

        double nota_final = (calificacion_parcial+examen_final+trabajo_final);

        //Mostrar nota final

        System.out.println("-------------------------");
        System.out.println("Su NOTA FINAL fue de "+nota_final);
    }
    private void Ejercicio6(){
        Scanner teclado= new Scanner(System.in);
        int estudiantes, hombres, mujeres;


        //Ingreso de informacion
        System.out.println("Ingrese el numero de estudiantes del curso");
        estudiantes=teclado.nextInt();

        System.out.println("Ingrese el numero de mujeres");
        mujeres= teclado.nextInt();

        System.out.println("Ingrese el numero de hombres");
        hombres= teclado.nextInt();

        if(estudiantes==mujeres+hombres) {
            //Calculo porcentaje de estudiantes

            double porcentaje_mujeres = (double) mujeres /estudiantes* 100;
            double porcentaje_hombres = (double) hombres /estudiantes* 100;

            System.out.println("El porcentaje de mujeres en el curso es de " + porcentaje_mujeres);
            System.out.println("El porcentaje de mujeres en el curso es de " + porcentaje_hombres);
        }
        System.out.println("Verfique los datos ingresados");
    }
    private void Ejercicio7(){
        Scanner teclado = new Scanner(System.in);
        double metro;

        System.out.println("CONVERSION METROS A PULGADAS Y PIES");
        System.out.println("===================================");
        System.out.println("Ingrese los metros a convertir");
        metro=teclado.nextDouble();

        //CONVERSION
        double pulgadas = 39.27*metro;
        double pies = 12*pulgadas;
        System.out.println("====================================");
        System.out.println(metro+" metros es equivalentes a:");
        System.out.println(pulgadas+" pulgadas");
        System.out.println(pies+" pies");
    }
    private void Ejercicio8(){
        Scanner teclado = new Scanner(System.in);

        //Ingreso de medidas
        System.out.println("Ingrese la medida del lado a");
        double a = teclado.nextDouble();

        System.out.println("Ingrese la medida del lado b");
        double b = teclado.nextDouble();

        System.out.println("Ingrese la medida del lado c");
        double c = teclado.nextDouble();


        //Calculo area

        double p = (a + b + c) / 2;

        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        DecimalFormat df = new DecimalFormat("#.000");

        System.out.println("El area del triangulo es de " + df.format(area));
    }
    private void Ejercicio9(){
        Scanner teclado = new Scanner(System.in);
        double precio_hora = 5.532;
        int horas;

        //Ingreso de horas
        System.out.println("Ingrese las horas trabajadas");
        horas=teclado.nextInt();

        //calculo sueldo

        double sueldo=precio_hora*horas;
        double descuento=sueldo*0.20;
        double sueldo_neto=sueldo-descuento;

        //Mostrar sueldo neto

        System.out.println("El sueldo neto del empleado es de "+sueldo_neto);
    }
    private void Ejercicio10(){
        Scanner teclado = new Scanner(System.in);
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
        double conversion;

        //Seleccion de divisas a cambiar

        System.out.println("Cambio de divisas");
        System.out.println("=================");
        System.out.println("Ingrese el monto a realizar el cambio");
        double monto = teclado.nextDouble();

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
        int opcion= (teclado.nextInt()-1);

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
            opcion= (teclado.nextInt()-1);

            switch (opcion) {
                case 0:
                    moneda=pesetas;
                    conversion=cambio*moneda;
                    System.out.println("==============================");
                    System.out.println("El cambio es "+df.format(conversion)+" pesetas");
                    break;
                case 1:
                    moneda= ch_austriacos;
                    conversion=cambio*moneda;
                    System.out.println("==============================");
                    System.out.println("El cambio es "+df.format(conversion)+" chelines austriacos");
                    break;
                case 2:
                    moneda= dolar;
                    conversion=cambio*moneda;
                    System.out.println("==============================");
                    System.out.println("El cambio es "+df.format(conversion)+" dolares");
                    break;
                case 3:
                    moneda= drac_griegos;
                    conversion=cambio*moneda;
                    System.out.println("==============================");
                    System.out.println("El cambio es "+df.format(conversion)+" dracmas");
                    break;
                case 4:
                    moneda= fr_belga;
                    conversion=cambio*moneda;
                    System.out.println("==============================");
                    System.out.println("El cambio es "+df.format(conversion)+" francos belgas");
                    break;
                case 5:
                    moneda= fr_francesa;
                    conversion=cambio*moneda;
                    System.out.println("==============================");
                    System.out.println("El cambio es "+df.format(conversion)+" francos franceses");
                    break;
                case 6:
                    moneda= lb_esterlina;
                    conversion=cambio*moneda;
                    System.out.println("==============================");
                    System.out.println("El cambio es "+df.format(conversion)+" libras esterlinas");
                    break;
                case 7:
                    moneda= lb_italiana;
                    conversion=cambio*moneda;
                    System.out.println("==============================");
                    System.out.println("El cambio es "+df.format(conversion)+" libra italiana");
                    break;
                default:
                    System.out.println("Valor ingresado incorrecto");
            }

        }
    }
    private void Ejercicio11(){
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
    private void Ejercicio12(){
        Scanner teclado = new Scanner(System.in);
        double matematica;
        double fisica;
        double quimica;
        double tareas =0;
        double nota;


        System.out.println("CALCULO DE PROMEDIOS");
        System.out.println("======================");

        //MATEMATICAS
        System.out.println("MATEMATICAS");
        System.out.println("======================");
        System.out.println("Ingrese la nota de la evaluacion");
        nota = teclado.nextInt();
        double examen=(nota*0.9);

        for (int i=0; i<=2; i++){
            System.out.println("Ingrese la nota "+(i+1)+" de las tareas");
            nota = teclado.nextInt();
            tareas = tareas + nota;
        }
        double tareas_matematicas=(tareas/3)*0.1;
        matematica=(examen+tareas_matematicas);
        tareas=0;


        //FISICA
        System.out.println("FISICA");
        System.out.println("======================");
        System.out.println("Ingrese la nota de la evaluacion");
        nota = teclado.nextInt();
        examen =(nota*0.8);

        for (int i=0; i<=1; i++){
            System.out.println("Ingrese la nota "+(i+1)+" de las tareas");
            nota = teclado.nextInt();
            tareas = tareas + nota;
        }
        double tareas_fisica=(tareas/2)*0.2;
        fisica=(examen +tareas_fisica);
        tareas=0;


        //QUIMICA
        System.out.println("QUIMICA");
        System.out.println("======================");
        System.out.println("Ingrese la nota de la evaluacion");
        nota = teclado.nextInt();
        examen =(nota*0.85);

        for (int i=0; i<=2; i++){
            System.out.println("Ingrese la nota "+(i+1)+" de las tareas");
            nota = teclado.nextInt();
            tareas = tareas + nota;
        }
        double tareas_quimica=(tareas/3)*0.15;
        quimica=(examen +tareas_quimica);


        //PROMEDIO FINAL

        double promedio_final=(matematica+fisica+quimica)/3;

        //NOTA FINAL
        System.out.println("==========================");
        System.out.println("PROMEDIO MATEMATICAS: "+matematica);
        System.out.println("PROMEDIO FISICA: "+quimica);
        System.out.println("PROMEDIO QUIMICA: "+quimica);
        System.out.println("==========================");
        System.out.println("PROMEDIO FINAL: "+promedio_final);
    }
    private void Ejercicio13(){
        Scanner teclado = new Scanner(System.in);
        int ncincuentamil;
        int nveintemil;
        int ndiezmil;
        int ncincomil;
        int ndosmil;
        int nquinientos;
        int nmil;
        int ncien;


        System.out.println("CANTIDAD DINERO");
        System.out.println("Ingrese la cantidad de billetes de 50000");
        int billetes= teclado.nextInt();
        ncincuentamil=billetes*50000;
        System.out.println("Ingrese la cantidad de billetes de 20000");
        billetes= teclado.nextInt();
        nveintemil=billetes*20000;
        System.out.println("Ingrese la cantidad de billetes de 10000");
        billetes= teclado.nextInt();
        ndiezmil=billetes*10000;
        System.out.println("Ingrese la cantidad de billetes de 5000");
        billetes= teclado.nextInt();
        ncincomil=billetes*5000;
        System.out.println("Ingrese la cantidad de billetes de 2000");
        billetes= teclado.nextInt();
        ndosmil=billetes*2000;
        System.out.println("Ingrese la cantidad de billetes de 1000");
        billetes= teclado.nextInt();
        nmil=billetes*1000;
        System.out.println("Ingrese la cantidad de billetes de 500");
        billetes= teclado.nextInt();
        nquinientos=billetes*500;
        System.out.println("Ingrese la cantidad de billetes de 100");
        billetes= teclado.nextInt();
        ncien=billetes*100;


        int total=ncincuentamil+nveintemil+ndiezmil+ncincomil+ndosmil+nquinientos+nmil+ncien;

        //TOTAL
        System.out.println("=======================================");
        System.out.println("TOTAL DINERO EN EL BANCO");
        System.out.println(total);

    }
    private void Ejercicio14(){
        float c, e, b, f, a, d;
        Scanner teclado = new Scanner(System.in);


        System.out.println("Ecuacion lineal");
        System.out.println("-");
        System.out.println("| aX + bY = c");
        System.out.println("-");
        System.out.println("| dX + eY = f");
        System.out.println("-");

        System.out.println("<><><><><><><><><><><<><>");
        System.out.println("Ingrese el valor de a");
        a= teclado.nextFloat();
        System.out.println("Ingrese el valor de b");
        b= teclado.nextFloat();
        System.out.println("Ingrese el valor de c");
        c= teclado.nextFloat();
        System.out.println("Ingrese el valor de d");
        d= teclado.nextFloat();
        System.out.println("Ingrese el valor de e");
        e= teclado.nextFloat();
        System.out.println("Ingrese el valor de f");
        f= teclado.nextFloat();


        float x1 = (c*e)-b*f;
        float y1 = (a*f)-c*d;

        float x2 = ((a*e)-(b*d));
        float y2 = ((a*e)-(b*d));

        if (y2 !=0 || x2 != 0){
            float x = x1 / x2;
            float y = y1 / y2;
            System.out.println("<><><><><><><><><><><<><>");
            System.out.println(" X = "+x);
            System.out.println(" Y = "+y);
        }else {
            System.out.println("No se puede dividir entre 0");
        }
    }
    private void Ejercicio15(){
        int ant_lectura;
        int act_lectura;
        int kwh;
        Scanner teclado = new Scanner(System.in);

        System.out.println("PRECIO FACTURA");
        System.out.println("Ingrese el valor de la lectura anterior");
        ant_lectura = teclado.nextInt();
        System.out.println("Ingrese el valor de la lectura actual");
        act_lectura = teclado.nextInt();
        if (ant_lectura<act_lectura) {
            System.out.println("Ingrese el precio del kilovatio hora (kWh)");
            kwh = teclado.nextInt();

            int precio = (act_lectura - ant_lectura) * kwh;
            System.out.println("============================================");
            System.out.println("VALOR FACTURA ACTUAL");
            System.out.println(precio);
        }else{
            System.out.println("Revise los valores de lectura ingresados");
        }
    }
    private void Ejercicio16(){
        Scanner teclado = new Scanner(System.in);
        double largo = 4;
        double ancho = 1.5;
        double pieza = 0.5;


        double lamina = largo * ancho;

        System.out.println("PIEZAS FABRICADAS");
        System.out.println("<><><><><><><><><><><><><>");
        System.out.println("Ingrese la cantidad de laminas");
        int unidad = teclado.nextInt();


        //calculo
        if (unidad >= 0) {
            double total_piezas = (lamina/pieza)*unidad;
            double desperdicio = (lamina%pieza)*unidad;

            System.out.println("Piezas fabricas; "+total_piezas);
            System.out.println("Desperdicio Total; "+desperdicio);
        }else{
            System.out.println("Verfique los valores ingresados");
        }
    }
    private void Ejercicio17(){
        Scanner teclado=new Scanner(System.in);
        double precio_final;
        double precio_venta;


        System.out.println("Calculo de descuento");
        System.out.println("=====================");
        System.out.println("Ingrese el precio pagodo producto");
        precio_venta= teclado.nextDouble();
        System.out.println("=====================");
        System.out.println("Ingrese el precio de venta del producto");
        precio_final= teclado.nextDouble();

        //Calculo descuento

        if (precio_venta>precio_final){

            double descuento=(precio_final/precio_venta)*100;
            System.out.println("==============================");
            System.out.println("DESCUENTO DE "+descuento+"%");

        }else{

            System.out.println("El precio de compra debe ser menor que el valor de venta para calcular el descuento");
        }
    }
    private void Ejercicio18(){
        Scanner teclado = new Scanner(System.in);
        double galon =3.785;
        double litro=1/galon;
        double precio=litro*100;


        System.out.println("PRECIO GASOLINA");
        System.out.println("==================");
        System.out.println("Ingrese la cantidad de litros surtidos al cliente");
        double cantidad_litros= teclado.nextInt();


        //Calculo precio

        DecimalFormat dc = new DecimalFormat("#.000");

        double precio_venta=cantidad_litros*precio;
        System.out.println("=============================");
        System.out.println("El precio es de: "+(dc.format(precio_venta)));
    }
    private void Ejercicio19(){
        int presupuesto;
        Scanner teclado = new Scanner(System.in);

        System.out.println("REPARTICION PRESUPUESTO");
        System.out.println("<><><><><><><><><><><><>");
        System.out.println("Ingrese el monto del presupuesto obtenido");
        presupuesto = teclado.nextInt();


        int ginecologia = (int) (presupuesto * 0.4);
        int traumatologia = (int) (presupuesto * 0.3);
        int pediatria = (int) (presupuesto * 0.3);


        System.out.println("<><><><><><><><><><><><>");
        System.out.println("Presupuesto Ginecologia: " + ginecologia);
        System.out.println("Presupuesto Traumatologia: " + traumatologia);
        System.out.println("Presupuesto Pediatria: " + pediatria);
    }
    private void Ejercicio20(){
        Scanner teclado=new Scanner(System.in);

        System.out.println("CALCULO DE INTERESES HIPOTECA");
        System.out.println("-----------------------------");
        System.out.println("Ingrese el valor del prestamo");
        double prestamo = teclado.nextDouble();
        System.out.println("Inrgese el valor de los intereses pagados");
        double pago_intereses = teclado.nextDouble();
        System.out.println("Ingrese el tiempo (años) pagados");
        int tiempo = teclado.nextInt();

        //CALCULO DE INTERESES AÑO

        DecimalFormat dc= new DecimalFormat("#");
        double razon = 100*pago_intereses/prestamo*tiempo;

        System.out.println("Los intereses anuales fueron de: ");
        System.out.println(dc.format(razon)+"%");
    }
    private void Ejercicio21(){
        Scanner teclado = new Scanner(System.in);

        //lote
        System.out.println("PORCENTAJE GANANCIAS LOTE NARANJAS");
        System.out.println("Ingrese la cantidad de naranjas en lote");
        int lote = teclado.nextInt();

        //docena
        System.out.println("Ingrese el valor de la docena");
        int docena = teclado.nextInt();

        //precio
        System.out.println("Ingrese el precio total de la venta");
        int venta = teclado.nextInt();

        //porcentaje
        int inversion =(lote/12)*docena;
        int ganancia = venta-inversion;
        double porcentaje_ganancia=(double) ganancia/inversion*100;

        DecimalFormat dc = new DecimalFormat("#");


        System.out.println("El porcentaje de ganancia es de: ");
        System.out.println(dc.format(porcentaje_ganancia)+"%");
    }
    private void Ejercicio22(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("RECARGO PAGO CUOTAS");
        System.out.println("Valor de la computadora");
        double pr_compu = teclado.nextDouble();

        //cuotas
        System.out.println("Valor de las cuotas");
        double cuotas = teclado.nextDouble();

        //recargo
        double pr_recargo= cuotas*12;
        double por_recargo= ((pr_recargo-pr_compu)/pr_compu)*100;

        DecimalFormat dc = new DecimalFormat("#");
        System.out.println("El valor de la compo con su recargo");
        System.out.println(dc.format(pr_recargo));
        System.out.println("Porcentaje de recargo");
        System.out.println(dc.format(por_recargo)+"%");
    }
    private void Ejercicio23(){
        Scanner teclado = new Scanner(System.in);


        System.out.println("PRECIO TONELADA MAIZ");
        System.out.println();
        System.out.println("<><><><><><><><><><>");

        //Tonelada
        System.out.println("Ingrese los Kg de harina");
        double kg= teclado.nextDouble();
        System.out.println("Ingrese los lt de aceite");
        double lt= teclado.nextDouble();

        //precio bulto y caja
        System.out.println("Precio del bulto");
        double pr_bulto= teclado.nextDouble();
        int bulto= (int) (((int)(kg/24))*pr_bulto);

        //*pr_bulto);
        System.out.println("Precio de la caja");
        int pr_caja = teclado.nextInt();
        int caja=(((int)(lt/15))*pr_caja);

        //Precio detal
        System.out.println("Precio al detal del bulto");
        double prdt_bulto = teclado.nextDouble();
        int dt_bulto = (int) (((int)(kg%24))*prdt_bulto);

        System.out.println("Precio al detal de la caja");
        double prdt_caja = teclado.nextDouble();
        int dt_caja=(int)((int)(lt%15)*prdt_caja);

        //Total
        int total =(bulto+caja+dt_caja+dt_bulto);
        System.out.println("PRECIO TOTAL");
        System.out.println(total);
    }
    private void Ejercicio24(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("GANANCIA INTERESES");
        System.out.println("Ingrese su inversion");
        double inv = teclado.nextDouble();
        System.out.println("Intereses de la inversion");
        double interes = teclado.nextDouble() / 100;

        double ganancia = inv * interes;

        if (ganancia > 7000) {

            System.out.println("Sus ganancias seran de:");
            System.out.println(ganancia);
            System.out.println("Total Dinero");
            double total = inv + ganancia;
            System.out.println(total);
        } else {
            System.out.println("Ganancias por debajo de 7000");
        }
    }
    private void Ejercicio25(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("AUMENTO SALARIO");
        System.out.println("Cuanto es el sueldo del trabajador");
        double sueldo = teclado.nextDouble();
        double aumento = 0;

        if(sueldo<40000 && sueldo>0){
            aumento=(sueldo*0.15)+sueldo;
        }else if (sueldo<0){
            System.out.println("Verifique los datos ingresados");
        }else {
            aumento = (sueldo * 0.12) + sueldo;
        }
        DecimalFormat dc = new DecimalFormat("#");
        if(sueldo>0) {
            System.out.println("El nuevo salario del trabajador sera de: ");
            System.out.println(dc.format(aumento));
        }
    }
    private void Ejercicio26(){
        Scanner t = new Scanner(System.in);

        System.out.println("EXPRESIÓN");
        System.out.println("Valor de A");
        int a = t.nextInt();
        System.out.println("Valor de B");
        int b = t.nextInt();
        System.out.println("Valor de C");
        int c = t.nextInt();
        System.out.println("Valor de D");
        int d = t.nextInt();


        //Calculo expresion

        if (d == 0) {
            int resultado = (int) Math.pow((a - c), 2);
            System.out.println("(A-C)^2= " + resultado);

        } else if (d > 0) {
            int resultado = (int) Math.pow((a - b), 3) / d;
            System.out.println(" (A-B)^3");
            System.out.println("--------- = " + resultado);
            System.out.println("    D   ");
        } else {
            System.out.println("los Valores de D no pueden ser negativos");
        }
    }
    private void Ejercicio27(){
        Scanner t = new Scanner(System.in);

        System.out.println("FIGURAS");
        System.out.println("Ingrese los valores a comparar");
        System.out.println("A");
        double a = t.nextDouble();
        System.out.println("B");
        double b = t.nextDouble();
        System.out.println("C");
        double c = t.nextDouble();

        //Calculo de areas

        double area1 = a * b / 2;
        double area2 = a * Math.pow(b, 2);
        double area3 = a * b;


        if (c == area1) {
            System.out.println("La figura es un triangulo");
        } else if (c == area2) {
            System.out.println("La figura es un circulo");
        } else if (c == area3) {
            System.out.println("La figura es un rectángulo");
        } else if (c != area1 && c != area2 && c != area3){
            System.out.println("La figura no es valida");
        }
    }
    private void Ejercicio28(){
        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese monto total de la compra");
        double monto = t.nextDouble();


        if (monto > 500000) {
            System.out.println("==============================");
            double inv = monto * 0.55;
            System.out.println("Inversion = " + inv);
            double banco = monto * 0.3;
            System.out.println("Prestamo al Banco = " + banco);
            double empresa = monto * 0.15;
            System.out.println("Credito fabricante = " + empresa);
            double interes = empresa * 0.7;
            System.out.println("Intereses crefito fabricante = " + interes);

        } else if (monto < 500000) {
            System.out.println("==============================");
            double inv = monto * 0.70;
            System.out.println("Inversion = " + inv);
            double empresa = monto * 0.3;
            System.out.println("Credito fabricante = " + empresa);
            double interes = empresa * 0.7;
            System.out.println("Intereses crefito fabricante = " + interes);
        }
    }
    private void Ejercicio29(){
        Scanner t = new Scanner(System.in);

        System.out.println("Salario de lo vendedores");
        double sl_vendedor = t.nextDouble();

        //Ingreso valores ventas
        double total_ventas = 0;
        double[] dpt = new double[3];
        for (int i = 0; i < dpt.length; i++) {
            System.out.println("Ventas deparmento " + (i + 1));
            dpt[i] = t.nextDouble();
            total_ventas = total_ventas + dpt[i];
        }

        //Dpt sobre 33%
        double up_ventas = total_ventas * 0.33;
        double[] vendedor = new double[3];
        for (int i = 0; i < vendedor.length; i++) {
            if (dpt[i] > up_ventas) {
                vendedor[i] = (sl_vendedor * 0.2) + sl_vendedor;
            } else {
                vendedor[i] = sl_vendedor;
            }
        }
        //Salario por departamento
        for (int i = 0; i < dpt.length; i++) {
            System.out.println("Salario Departamento" + (i + 1));
            System.out.println(vendedor[i]);
        }
    }
    private void Ejercicio30(){
        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
        int[] dig = new int[4];
        for (int i = 0; i < dig.length; i++) {
            System.out.println("Ingrese el digito " + (i + 1));
            dig[i] = t.nextInt();
        }
        if (dig[2] >= 5) {
            dig[3] = 0;
            dig[2] = 0;
            dig[1]++;
        } else {
            dig[3] = 0;
            dig[2] = 0;
        }
        if (dig[1] >= 5) {
            dig[1] = 0;
            dig[0]++;
        }
        System.out.println("El numero rendondeado es: ");
        int i = 0;
        while (i < dig.length) {
            System.out.print(dig[i]);
            i++;
        }
    }
    private void Ejercicio31(){
        Scanner t = new Scanner(System.in);

        System.out.println("COSTO ALQUILER");
        System.out.println("==============");
        System.out.println("Ingrese los Km recorridos");
        int recorrido = t.nextInt();
        int precio;
        int dst_extra;

        if (recorrido<=300){
            precio = 5000;
            System.out.println("Precio alquiler");
            System.out.println(precio);
        } else if (recorrido<1000) {
            dst_extra = recorrido-300;
            precio=5000+(dst_extra*200);
            System.out.println("Precio alquiler");
            System.out.println(precio);
        } else if (recorrido>1000) {
            dst_extra =1000-300;
            precio=5000+(dst_extra*200);
            int dst_extra_mil = recorrido-1000;
            int precio_extra = precio+dst_extra_mil*150;
            System.out.println("Precio alquiler");
            System.out.println(precio_extra);
        }
    }
    private void Ejercicio32(){
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el valor de P");
        int p = t.nextInt();
        System.out.println("Ingrese el valor de Q");
        int q = t.nextInt();

        //Calculo expresion

        double expresion = Math.pow(p, 3) + Math.pow(q, 4) - (2 * Math.pow(p, 2));

        if (expresion > 680) {
            System.out.println(p + "³" + "+" + q + "⁴" + "-2*" + p + "²" + " > 680");
        } else {
            System.out.println(p + "³" + "+" + q + "⁴" + "-2*" + p + "²" + " < 680");
        }
    }
    private void Ejercicio33(){
        Scanner t = new Scanner(System.in);
        System.out.println("Nombre del cliente");
        String nombre = t.nextLine();
        System.out.println("Ingrese el monto de la compra");

        double monto = t.nextDouble();
        double descuento;
        int mnt_descuento;

        //Descuento
        System.out.println("==============================");
        System.out.println("FACTURA");
        System.out.println("Cliente: " + nombre);
        System.out.println("Monto compra:" + monto);

        if (monto < 500) {
            System.out.println("No hay descuento");
        }

        //descuento 5%
        else if (monto <= 1000) {
            descuento = monto * 0.05;
            mnt_descuento = (int) ((int) monto - descuento);
            System.out.println("Descuento de 5%");
            System.out.println(descuento);
            System.out.println("Monto a pagar");
            System.out.println(mnt_descuento);
        }
        //descuento 11%
        else if (monto > 1000 && monto <= 7000) {
            descuento = monto * 0.11;
            mnt_descuento = (int) ((int) monto - descuento);
            System.out.println("Descuento de 11%");
            System.out.println(descuento);
            System.out.println("Monto a pagar");
            System.out.println(mnt_descuento);
        }
        //descuento 18%
        else if (monto > 7000 && monto <= 15000) {
            descuento = monto * 0.18;
            mnt_descuento = (int) ((int) monto - descuento);
            System.out.println("Descuento de 18%");
            System.out.println(descuento);
            System.out.println("Monto a pagar");
            System.out.println(mnt_descuento);
        }
        //descuento 25%
        else if (monto > 15000) {
            descuento = monto * 0.25;
            mnt_descuento = (int) ((int) monto - descuento);
            System.out.println("Descuento de 25%");
            System.out.println(descuento);
            System.out.println("Monto a pagar");
            System.out.println(mnt_descuento);
        }
    }
    private void Ejercicio34(){
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
    private void Ejercicio35(){
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
    private void Ejercicio36(){
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese un cantidad de dinero");
        int dinero = t.nextInt();

        int ct_ml = dinero / 50000;
        int rst = dinero % 50000;
        int vt_ml = rst / 20000;
        rst = rst % 20000;
        int dz_ml = rst / 10000;
        rst = rst % 10000;
        int c_ml = rst / 5000;
        rst = rst % 5000;
        int ds_ml = rst / 2000;
        rst = rst % 2000;
        int ml = rst / 1000;
        rst = rst % 1000;
        int qts = rst / 500;
        rst = rst % 500;
        int cn = rst / 100;
        rst = rst % 100;
        int ct = rst / 50;
        rst = rst % 50;
        int vt = rst / 20;
        rst = rst % 20;
        int dz = rst / 10;


        System.out.println("El cambio en billetes sera de: ");
        if (ct_ml > 0) {
            System.out.println(ct_ml + " de 50000");
        }
        if (vt_ml > 0) {
            System.out.println(vt_ml + " de 20000");
        }
        if (dz_ml > 0) {
            System.out.println(dz_ml + " de 10000");
        }
        if (c_ml > 0) {
            System.out.println(c_ml + " de 5000");
        }
        if (ds_ml > 0) {
            System.out.println(ds_ml + " de 2000");
        }
        if (ml > 0) {
            System.out.println(ml + " de 1000");
        }
        if (qts > 0) {
            System.out.println(qts + " de 500");
        }
        if (cn > 0) {
            System.out.println(cn + " de 100");
        }
        if (ct > 0) {
            System.out.println(ct + " de 50");
        }
        if (vt > 0) {
            System.out.println(vt + " de 20");
        }
        if (dz > 0) {
            System.out.println(dz + " de 10");
        }
    }
    private void Ejercicio37(){
        Scanner t = new Scanner(System.in);

        System.out.println("Escriba el valor de A");
        double a = t.nextInt();

        System.out.println("Escriba el valor de B");
        double b = t.nextInt();

        System.out.println("Escriba el valor de C");
        double c = t.nextInt();


        if (a + b > c && a + c > b && b + c > a || a + b == c / 2 || a + c == b / 2 || b + c == a / 2) {
            //equilátero
            if ((a == c) && (b == c)) {
                System.out.println("Es un triangulo equilátero");
            }//isosceles
            if (a == c || b == c) {
                if (a != c || a != b) {
                    System.out.println("En un triangulo isosceles");
                }
            }//escaleno
            if (a != c || a != b) {
                System.out.println("Es un triangulo escaleno");
            }
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println(area);
        } else {
            System.out.println("Los datos ingresado no corresponden a un triangulo");
        }
    }
    private void Ejercicio38(){
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
    private void Ejercicio39(){
        Scanner t = new Scanner(System.in);


        System.out.println("Valor de compra");
        double pr = t.nextDouble();
        System.out.println("Ingrese el devalúo anual del automóvil");
        double aut = t.nextDouble();
        System.out.println("Ingrese el incremento del valor del terreno");
        double ter = t.nextDouble();
        System.out.println("Ingrese la cantidad de tiempo de referencia");
        int tmp = t.nextInt();


        //calculo devaluo y ganancia
        double dv_aut = aut * tmp;
        double gn_ter = ter * tmp;
        double total_aut = pr - dv_aut;
        double total_ter = pr + gn_ter;

        if (dv_aut < gn_ter / 2) {
            System.out.println("Comprar auto");
            System.out.println("Valor automovil "+total_aut);
            System.out.println("Valor terrno "+total_ter);
        } else {
            System.out.println("NO COMPRAR q-q");
            System.out.println("Valor automovil "+total_aut);
            System.out.println("Valor terrno "+total_ter);
        }
    }
    private void Ejercicio40(){
        Scanner t = new Scanner(System.in);


        System.out.println("FACTURA ELECTRICIDAD Y ASEO");
        System.out.println("Valor de la lecuta anterior");
        double lc_ant = t.nextDouble();
        System.out.println("Valor de la lectura actual");
        double lc_act = t.nextDouble();
        double costo_elc = 0;
        if (lc_act > lc_ant) {
            System.out.println("Ingrese el costo de aseo urbano");
            double aseo = t.nextDouble();
            System.out.println("===============================");

            //Valor factura electricidad
            double lc_dfr = lc_act - lc_ant;
            if (lc_dfr > 0 && lc_dfr < 100) {
                costo_elc = 2622;
                System.out.println("El valor por electricidad sera de: " + costo_elc);
            } else if (lc_dfr > 101 && lc_dfr < 300) {
                costo_elc = lc_dfr * 79.78;
                System.out.println("El valor por electricidad sera de: " + costo_elc);
            } else if (lc_dfr > 301 && lc_dfr < 500) {
                costo_elc = lc_dfr * 89.52;
                System.out.println("El valor por electricidad sera de: " + costo_elc);
            } else if (lc_dfr > 501) {
                costo_elc = lc_dfr * 97.95;
                System.out.println("El valor por electricidad sera de: " + costo_elc);
            }
            double total = costo_elc + aseo;
            System.out.println("El costo total de la factura con el valor de aseo urbano es:");
            System.out.println(total);
        } else {
            System.out.println("Verifique los valores ingresados");
        }
    }
    private void Ejercicio41(){
        Scanner t = new Scanner(System.in);

        System.out.println("REFORESTACION");
        System.out.println("<><><><><><><>");
        System.out.println("Ingrese la longitud del terreno en Metros(m)");
        int lng = t.nextInt();
        System.out.println("Ingrese el ancho del terreno en Metros(m)");
        int wd = t.nextInt();
        int terreno = lng * wd;
        double tr_pino;
        double tr_oyamel;
        double tr_cedro;


        if (terreno > 1000000) {
            tr_pino = terreno * 0.7;
            tr_oyamel = terreno * 0.3;
            tr_cedro = terreno * 0.1;
        } else {
            tr_pino = terreno * 0.5;
            tr_oyamel = terreno * 0.3;
            tr_cedro = terreno * 0.2;
        }
        int pino = (int) ((tr_pino / 10) * 8);
        int oyamel = (int) tr_oyamel;
        int cedro = (int) ((tr_cedro / 18) * 10);

        System.out.println("Dentro del terreno podra plantar");
        System.out.println("Pino " + pino);
        System.out.println("Oyamel " + oyamel);
        System.out.println("Cedro " + cedro);

    }
    private void Ejercicio42(){
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
    private void Ejercicio43(){
        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese el monto del capital actual");
        double cpt = t.nextDouble();

        double prestamo = cpt;



        System.out.println();
        if(cpt<0){
            prestamo = cpt+10000;
            System.out.println("El préstamo sera de "+prestamo);
        }else if (cpt<20000){
            prestamo = 20000 - cpt;
            System.out.println("El préstamo sera de "+prestamo);
        }else if (cpt>=20000){
            System.out.println("No requiere un préstamo");
        }
        //Repartición del préstamo
        //if (cpt)
        double eqp_compu=5000;
        double mobiliario=2000;
        double insumos=(prestamo-eqp_compu-mobiliario)/2;
        double incentivos=(prestamo-eqp_compu-mobiliario)/2;
        System.out.println("Los insumos saran de "+insumos);
        System.out.println("Los incentivos saran de "+incentivos);

    }
    private void Ejercicio44(){
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
    private void Ejercicio45(){
        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese el valor de A");
        int a = t.nextInt();
        System.out.println("Ingrese el valor de B");
        int b = t.nextInt();
        System.out.println("Ingrese el valor de C");
        int c = t.nextInt();


        double dis = Math.pow(b, 2) - (4 * a * c);
        double x1,x2;

        //Ecuacion
        if (dis == 0){
            System.out.println("D = "+dis);
            x1 = (double) -b /2*a;
            x2 = x1;
            System.out.println("X1 = "+x1+"\nX2 = "+x2);
        }else if (dis >= 0) {
            System.out.println("D ="+dis);
            x1 = (-b + Math.sqrt(dis))/(2*a) ;
            x2 = (-b - Math.sqrt(dis))/(2*a) ;
            System.out.println("X1 = "+x1+"\nX2 = "+x2);
        } else {
            System.out.println("No hay soluciones en los reales");
        }
    }
    //Getters
    public void getEjercicio1() {
        Ejercicio1();
    }
    public void getEjercicio2() { Ejercicio2(); }
    public void getEjercicio3() { Ejercicio3(); }
    public void getEjercicio4() { Ejercicio4(); }
    public void getEjercicio5() { Ejercicio5(); }
    public void getEjercicio6() { Ejercicio6(); }
    public void getEjercicio7() { Ejercicio7(); }
    public void getEjercicio8() { Ejercicio8(); }
    public void getEjercicio9() { Ejercicio9(); }
    public void getEjercicio10() { Ejercicio10(); }
    public void getEjercicio11() { Ejercicio11(); }
    public void getEjercicio12() { Ejercicio12(); }
    public void getEjercicio13() { Ejercicio13(); }
    public void getEjercicio14() { Ejercicio14(); }
    public void getEjercicio15() { Ejercicio15(); }
    public void getEjercicio16() { Ejercicio16(); }
    public void getEjercicio17() { Ejercicio17(); }
    public void getEjercicio18() { Ejercicio18(); }
    public void getEjercicio19() { Ejercicio19(); }
    public void getEjercicio20() { Ejercicio20(); }
    public void getEjercicio21() { Ejercicio21(); }
    public void getEjercicio22() { Ejercicio22(); }
    public void getEjercicio23() { Ejercicio23(); }
    public void getEjercicio24() { Ejercicio24(); }
    public void getEjercicio25() { Ejercicio25(); }
    public void getEjercicio26() { Ejercicio26(); }
    public void getEjercicio27() { Ejercicio27(); }
    public void getEjercicio28() { Ejercicio28(); }
    public void getEjercicio29() { Ejercicio29(); }
    public void getEjercicio30() { Ejercicio30(); }
    public void getEjercicio31() { Ejercicio31(); }
    public void getEjercicio32() { Ejercicio32(); }
    public void getEjercicio33() { Ejercicio33(); }
    public void getEjercicio34() { Ejercicio34(); }
    public void getEjercicio35() { Ejercicio35(); }
    public void getEjercicio36() { Ejercicio36(); }
    public void getEjercicio37() { Ejercicio37(); }
    public void getEjercicio38() { Ejercicio38(); }
    public void getEjercicio39() { Ejercicio39(); }
    public void getEjercicio40() { Ejercicio40(); }
    public void getEjercicio41() { Ejercicio41(); }
    public void getEjercicio42() { Ejercicio42(); }
    public void getEjercicio43() { Ejercicio43(); }
    public void getEjercicio44() { Ejercicio44(); }
    public void getEjercicio45() { Ejercicio45(); }
}

