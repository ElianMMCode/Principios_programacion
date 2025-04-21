package Soluciones.Estructuras_Control_Repetitivo;

public class Ejrc_67_Deuda {
    public static void main (){

        int deuda = 12775;
        int pago = 100;
        int cont=1;
        System.out.println("Pago 1 fue de Bs $100");
        deuda-=pago;
        System.out.println("Monto por pagar: Bs $"+deuda);


        for (int i=100; i<deuda; i+=125){

            pago+=125;
                    cont++;
            deuda-=pago;
            System.out.println("Pago "+cont+" fue de Bs $"+pago);
            System.out.println("Monto por pagar: Bs $"+deuda);
            
        }




    }
}
