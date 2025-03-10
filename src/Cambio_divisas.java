import java.text.DecimalFormat;
import java.util.Scanner;

public class Cambio_divisas {
    public static void main(String[] args){
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

}
