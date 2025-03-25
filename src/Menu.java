import java.util.Scanner;

public static void main() {

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
                ejercicio1.getEjercicio1();
                break;
            case 2:
                Ejercicios ejercicio2 = new Ejercicios();
                ejercicio2.getEjercicio2();
                break;
            case 3:
                Ejercicios ejercicio3 = new Ejercicios();
                ejercicio3.getEjercicio3();
                break;
            case 4:
                Ejercicios ejercicio4 = new Ejercicios();
                ejercicio4.getEjercicio4();
                break;
            case 5:
                Ejercicios ejercicio5 = new Ejercicios();
                ejercicio5.getEjercicio5();
                break;
            case 6:
                Ejercicios ejercicio6 = new Ejercicios();
                ejercicio6.getEjercicio6();
                break;
            case 7:
                Ejercicios ejercicio7 = new Ejercicios();
                ejercicio7.getEjercicio7();
                break;
            case 8:
                Ejercicios ejercicio8 = new Ejercicios();
                ejercicio8.getEjercicio8();
                break;
            case 9:
                Ejercicios ejercicio9 = new Ejercicios();
                ejercicio9.getEjercicio9();
                break;
            case 10:
                Ejercicios ejercicio10 = new Ejercicios();
                ejercicio10.getEjercicio10();
                break;
            case 11:
                Ejercicios ejercicio11 = new Ejercicios();
                ejercicio11.getEjercicio11();
                break;
            case 12:
                Ejercicios ejercicio12 = new Ejercicios();
                ejercicio12.getEjercicio12();
                break;
            case 13:
                Ejercicios ejercicio13 = new Ejercicios();
                ejercicio13.getEjercicio13();
                break;
            case 14:
                Ejercicios ejercicio14 = new Ejercicios();
                ejercicio14.getEjercicio14();
                break;
            case 15:
                Ejercicios ejercicio15 = new Ejercicios();
                ejercicio15.getEjercicio15();
                break;
            case 16:
                Ejercicios ejercicio16 = new Ejercicios();
                ejercicio16.getEjercicio16();
                break;
            case 17:
                Ejercicios ejercicio17 = new Ejercicios();
                ejercicio17.getEjercicio17();
                break;
            case 18:
                Ejercicios ejercicio18 = new Ejercicios();
                ejercicio18.getEjercicio18();
                break;
            case 19:
                Ejercicios ejercicio19 = new Ejercicios();
                ejercicio19.getEjercicio19();
                break;
            case 20:
                Ejercicios ejercicio20 = new Ejercicios();
                ejercicio20.getEjercicio20();
                break;
            case 21:
                Ejercicios ejercicio21 = new Ejercicios();
                ejercicio21.getEjercicio21();
                break;
            case 22:
                Ejercicios ejercicio22 = new Ejercicios();
                ejercicio22.getEjercicio22();
                break;
            case 23:
                Ejercicios ejercicio23 = new Ejercicios();
                ejercicio23.getEjercicio23();
                break;
            case 24:
                Ejercicios ejercicio24 = new Ejercicios();
                ejercicio24.getEjercicio24();
                break;
            case 25:
                Ejercicios ejercicio25 = new Ejercicios();
                ejercicio25.getEjercicio25();
                break;
            case 26:
                Ejercicios ejercicio26 = new Ejercicios();
                ejercicio26.getEjercicio26();
                break;
            case 27:
                Ejercicios ejercicio27 = new Ejercicios();
                ejercicio27.getEjercicio27();
                break;
            case 28:
                Ejercicios ejercicio28 = new Ejercicios();
                ejercicio28.getEjercicio28();
                break;
            case 29:
                Ejercicios ejercicio29 = new Ejercicios();
                ejercicio29.getEjercicio29();
                break;
            case 30:
                Ejercicios ejercicio30 = new Ejercicios();
                ejercicio30.getEjercicio30();
                break;
            case 31:
                Ejercicios ejercicio31 = new Ejercicios();
                ejercicio31.getEjercicio31();
                break;
            case 32:
                Ejercicios ejercicio32 = new Ejercicios();
                ejercicio32.getEjercicio32();
                break;
            case 33:
                Ejercicios ejercicio33 = new Ejercicios();
                ejercicio33.getEjercicio33();
                break;
            case 34:
                Ejercicios ejercicio34 = new Ejercicios();
                ejercicio34.getEjercicio34();
                break;
            case 35:
                Ejercicios ejercicio35 = new Ejercicios();
                ejercicio35.getEjercicio35();
                break;
            case 36:
                Ejercicios ejercicio36 = new Ejercicios();
                ejercicio36.getEjercicio36();
                break;
            case 37:
                Ejercicios ejercicio37 = new Ejercicios();
                ejercicio37.getEjercicio37();
                break;
            case 38:
                Ejercicios ejercicio38 = new Ejercicios();
                ejercicio38.getEjercicio38();
                break;
            case 39:
                Ejercicios ejercicio39 = new Ejercicios();
                ejercicio39.getEjercicio39();
                break;
            case 40:
                Ejercicios ejercicio40 = new Ejercicios();
                ejercicio40.getEjercicio40();
                break;
            case 41:
                Ejercicios ejercicio41 = new Ejercicios();
                ejercicio41.getEjercicio41();
                break;
            case 42:
                Ejercicios ejercicio42 = new Ejercicios();
                ejercicio42.getEjercicio42();
                break;
            case 43:
                Ejercicios ejercicio43 = new Ejercicios();
                ejercicio43.getEjercicio43();
                break;
            case 44:
                Ejercicios ejercicio44 = new Ejercicios();
                ejercicio44.getEjercicio44();
                break;
            case 45:
                Ejercicios ejercicio45 = new Ejercicios();
                ejercicio45.getEjercicio45();
                break;
            default:
                System.out.println("Ejercicio no valido");
        }
        System.out.println("Desea ver otro ejercicio (Y/N)");
        salir = t.nextLine();


    } while (salir.equalsIgnoreCase("Y"));
    t.close();
}

