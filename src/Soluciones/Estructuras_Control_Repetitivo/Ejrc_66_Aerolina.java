package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

public class Ejrc_66_Aerolina {
    public static double tarifa_peso(double peso) {


        return peso < 3 && peso > 1 ? 0 : peso > 3.01 && peso < 6 ? 600 :
                peso > 6.01 && peso < 9 ? 1200 :
                        peso > 9.01 && peso < 12 ? 1500 :
                                peso > 12.01 && peso < 15 ? 2000 :
                                        peso > 15 ? 2500 : 0;
    }

    public static void main() {

        Scanner t = new Scanner(System.in);
        String fin;
        int cont = 0;
        String nombre;
        int peso, cod_maleta,cod_maleta_min=0,cod_maleta_max=0;
        double equip_max = 0, equip_min = 0;
        String pasajero_max = "", pasajero_min = "";
        double tarifa_max = 0, tarifa_min = 0, tarifa_total = 0, tarifa_zero=0;

        do {
            System.out.println("---Información vuelo---");
            System.out.print("Ingrese el numero de vuelo: ");
            int num_vuelo = t.nextInt();
            t.nextLine();
            System.out.print("Ingrese el codigo de abordo: ");
            int cod_abordo = t.nextInt();
            t.nextLine();
            double peso_max;
            do {
                cont++;
                System.out.println("----Pasajeros------");
                System.out.print("Ingrese el nombre del pasajero " + cont + " : ");
                nombre = t.nextLine();

                System.out.print("Ingrese el codigo de maleta del pasajero " + cont + " : ");
                cod_maleta = t.nextInt();
                t.nextLine();
                peso_max = 0;
                do {
                    System.out.println("----Equipaje----");
                    System.out.print("Ingrese el peso (Kg) del equipaje: ");
                    peso = t.nextInt();
                    t.nextLine();

                    if (peso <= 0) {
                        System.out.println("Error en peso ingresado");
                    }
                    peso_max += peso;
                    System.out.println("Tiene otra maleta (S/N)");
                    fin = t.nextLine();

                } while (fin.equalsIgnoreCase("S"));

                System.out.println("Numero de vuelo: " + num_vuelo);
                System.out.println("Codigo de abordo: " + cod_abordo);
                System.out.println("Nombre: " +nombre);
                System.out.println("Codigo maleta: " + cod_maleta);
                System.out.printf("Tarifa por equipaje: $%.0f \n",tarifa_peso(peso_max));
                tarifa_total += tarifa_peso(peso_max);

                if(tarifa_peso(peso_max)==0){
                    tarifa_zero++;
                }


                if (equip_max < peso_max) {
                    pasajero_max = nombre;
                    cod_maleta_max=cod_maleta;
                    equip_max = peso_max;
                    tarifa_max = tarifa_peso(peso_max);
                } else {
                    pasajero_min = nombre;
                    cod_maleta_min=cod_maleta;
                    equip_min = peso_max;
                    tarifa_min = tarifa_peso(peso_max);
                }
                System.out.println("Ingrese " + "Fin" + " si es el ultimo pasajero");
                fin = t.nextLine();

            } while (!fin.equalsIgnoreCase("fin"));

            System.out.println("Numero de vuelo: " + num_vuelo);
            System.out.println("Codigo de abordo: " + cod_abordo);
            System.out.println("----------------------------------");
            System.out.println("Pasajero con máximo equipaje");
            System.out.println("Pasajero: " + pasajero_max);
            System.out.println("Codigo maleta: " + cod_maleta_max);
            System.out.println("Peso equipaje: " + equip_max);
            System.out.printf("Tarifa: $%.0f \n",tarifa_max);
            System.out.println("----------------------------------");
            System.out.println("Pasajero con minimo equipaje");
            System.out.println("Pasajero: " + pasajero_min);
            System.out.println("Codigo maleta: " + cod_maleta_min);
            System.out.println("Peso equipaje: " + equip_min);
            System.out.printf("Tarifa: $%.0f \n",tarifa_min);
            System.out.println("----------------------------------");
            System.out.printf("Monto total por equipaje: $%.0f\n",tarifa_total);
            System.out.printf("Porcentaje pasajeros que no pagaron equipaje: %.0f",((tarifa_zero/cont)*100));
            System.out.print("%\n");



            System.out.println("Ingrese " + "Salir" + " si no desea continuar");
            fin = t.nextLine();
            t.nextLine();

        } while (!fin.equalsIgnoreCase("salir"));
    }


}
