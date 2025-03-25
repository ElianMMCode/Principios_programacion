import java.util.Scanner;

public class Menu{
    public static void main(String [] args) {

        int op;
        String salir;
        Scanner t = new Scanner(System.in);

        do {
            System.out.println("Ingrese el ejercicio que desea ver");
            op = t.nextInt();
            //limpiar scanner
            t.nextLine();

            switch (op) {

                case 1:
                    Ejercicios ejercicio1 = new Ejercicios();
                    ejercicio1.Ejercicio1();
                    break;
                case 2:
                    Ejercicios ejercicio2 = new Ejercicios();
                    ejercicio2.Ejercicio2();
                    break;
                case 3:
                    Ejercicios ejercicio3 = new Ejercicios();
                    ejercicio3.Ejercicio3();
                    break;
                case 4:
                    Ejercicios ejercicio4 = new Ejercicios();
                    ejercicio4.Ejercicio4();
                    break;
                case 5:
                    Ejercicios ejercicio5 = new Ejercicios();
                    ejercicio5.Ejercicio5();
                    break;
                case 6:
                    Ejercicios ejercicio6 = new Ejercicios();
                    ejercicio6.Ejercicio6();
                    break;
                case 7:
                    Ejercicios ejercicio7 = new Ejercicios();
                    ejercicio7.Ejercicio7();
                    break;
                case 8:
                    Ejercicios ejercicio8 = new Ejercicios();
                    ejercicio8.Ejercicio8();
                    break;
                case 9:
                    Ejercicios ejercicio9 = new Ejercicios();
                    ejercicio9.Ejercicio9();
                    break;
                case 10:
                    Ejercicios ejercicio10 = new Ejercicios();
                    ejercicio10.Ejercicio10();
                    break;
                case 11:
                    Ejercicios ejercicio11 = new Ejercicios();
                    ejercicio11.Ejercicio11();
                    break;
                case 12:
                    Ejercicios ejercicio12 = new Ejercicios();
                    ejercicio12.Ejercicio12();
                    break;
                case 13:
                    Ejercicios ejercicio13 = new Ejercicios();
                    ejercicio13.Ejercicio13();
                    break;
                case 14:
                    Ejercicios ejercicio14 = new Ejercicios();
                    ejercicio14.Ejercicio14();
                    break;
                case 15:
                    Ejercicios ejercicio15 = new Ejercicios();
                    ejercicio15.Ejercicio15();
                    break;
                case 16:
                    Ejercicios ejercicio16 = new Ejercicios();
                    ejercicio16.Ejercicio16();
                    break;
                case 17:
                    Ejercicios ejercicio17 = new Ejercicios();
                    ejercicio17.Ejercicio17();
                    break;
                case 18:
                    Ejercicios ejercicio18 = new Ejercicios();
                    ejercicio18.Ejercicio18();
                    break;
                case 19:
                    Ejercicios ejercicio19 = new Ejercicios();
                    ejercicio19.Ejercicio19();
                    break;
                case 20:
                    Ejercicios ejercicio20 = new Ejercicios();
                    ejercicio20.Ejercicio20();
                    break;
                case 21:
                    Ejercicios ejercicio21 = new Ejercicios();
                    ejercicio21.Ejercicio21();
                    break;
                case 22:
                    Ejercicios ejercicio22 = new Ejercicios();
                    ejercicio22.Ejercicio22();
                    break;
                case 23:
                    Ejercicios ejercicio23 = new Ejercicios();
                    ejercicio23.Ejercicio23();
                    break;
                case 24:
                    Ejercicios ejercicio24 = new Ejercicios();
                    ejercicio24.Ejercicio24();
                    break;
                case 25:
                    Ejercicios ejercicio25 = new Ejercicios();
                    ejercicio25.Ejercicio25();
                    break;
                case 26:
                    Ejercicios ejercicio26 = new Ejercicios();
                    ejercicio26.Ejercicio26();
                    break;
                case 27:
                    Ejercicios ejercicio27 = new Ejercicios();
                    ejercicio27.Ejercicio27();
                    break;
                case 28:
                    Ejercicios ejercicio28 = new Ejercicios();
                    ejercicio28.Ejercicio28();
                    break;
                case 29:
                    Ejercicios ejercicio29 = new Ejercicios();
                    ejercicio29.Ejercicio29();
                    break;
                case 30:
                    Ejercicios ejercicio30 = new Ejercicios();
                    ejercicio30.Ejercicio30();
                    break;
                case 31:
                    Ejercicios ejercicio31 = new Ejercicios();
                    ejercicio31.Ejercicio31();
                    break;
                case 32:
                    Ejercicios ejercicio32 = new Ejercicios();
                    ejercicio32.Ejercicio32();
                    break;
                case 33:
                    Ejercicios ejercicio33 = new Ejercicios();
                    ejercicio33.Ejercicio33();
                    break;
                case 34:
                    Ejercicios ejercicio34 = new Ejercicios();
                    ejercicio34.Ejercicio34();
                    break;
                case 35:
                    Ejercicios ejercicio35 = new Ejercicios();
                    ejercicio35.Ejercicio35();
                    break;
                case 36:
                    Ejercicios ejercicio36 = new Ejercicios();
                    ejercicio36.Ejercicio36();
                    break;
                case 37:
                    Ejercicios ejercicio37 = new Ejercicios();
                    ejercicio37.Ejercicio37();
                    break;
                case 38:
                    Ejercicios ejercicio38 = new Ejercicios();
                    ejercicio38.Ejercicio38();
                    break;
                case 39:
                    Ejercicios ejercicio39 = new Ejercicios();
                    ejercicio39.Ejercicio39();
                    break;
                case 40:
                    Ejercicios ejercicio40 = new Ejercicios();
                    ejercicio40.Ejercicio40();
                    break;
                case 41:
                    Ejercicios ejercicio41 = new Ejercicios();
                    ejercicio41.Ejercicio41();
                    break;
                case 42:
                    Ejercicios ejercicio42 = new Ejercicios();
                    ejercicio42.Ejercicio42();
                    break;
                case 43:
                    Ejercicios ejercicio43 = new Ejercicios();
                    ejercicio43.Ejercicio43();
                    break;
                case 44:
                    Ejercicios ejercicio44 = new Ejercicios();
                    ejercicio44.Ejercicio44();
                    break;
                case 45:
                    Ejercicios ejercicio45 = new Ejercicios();
                    ejercicio45.Ejercicio45();
                    break;
                default:
                    System.out.println("Ejercicio no valido");
            }
            System.out.println("Desea ver otro ejercicio (Y/N)");
            salir = t.nextLine();


        } while (salir.equalsIgnoreCase("Y"));
        t.close();
    }
}

