package Soluciones.Estructuras_Control_Repetitivo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejrc_60_Interes_mora {

    public static void factura (int num_fac, String nom_cliente, double mon_fac, LocalDate fec_com, LocalDate fec_pag){

        int dias = Math.toIntExact(ChronoUnit.DAYS.between(fec_com, fec_pag));
        double interes = dias>=60 ? 8 : dias>=31 ? 6 : 0;
        double descuento = dias<15 ? 2:0;

        double mont_ttl = dias>=15 ? mon_fac+(mon_fac*(interes/100)): mon_fac-(mon_fac*(descuento/100)) ;
        double mont_intrs = mon_fac*(interes/100);
        double mont_desc = mon_fac*(descuento/100);

        System.out.println("FACTURA");
        System.out.println("+++++++++++++++++");
        System.out.println("Numero de factura: "+num_fac);
        System.out.println("Nombre cliente: "+ nom_cliente);
        System.out.println("Monto a pagar: "+ mont_ttl);

        if (mont_intrs!=0){
            System.out.println("Monto a pagar por interes de mora: "+mont_intrs);
        }
        if (mont_desc!=0){
            System.out.println("Monto a pagar con descuento por pronto pago: "+mont_desc);
        }
    }

    public static void main(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");



        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el numero de factura");
        int num_fac = t.nextInt();
        System.out.println("Ingrese el nombre del cliente");
        t.nextLine();
        String nom_cliente = t.nextLine();
        System.out.println("Ingrese el monto de la factura");
        double mon_fac = t.nextDouble();
        System.out.println("Ingrese la fecha de compra (dd-MM-yyyy)");
        t.nextLine();
        String compra = t.nextLine();
        System.out.println("Ingrese la fecha de pago (dd-MM-yyyy)");
        String pago = t.nextLine();

        LocalDate fec_com = LocalDate.parse(compra, formato);
        LocalDate fec_pag = LocalDate.parse(pago, formato);

        factura(num_fac, nom_cliente, mon_fac, fec_com, fec_pag);
    }

}
