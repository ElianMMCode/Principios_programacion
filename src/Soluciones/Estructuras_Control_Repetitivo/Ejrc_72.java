package Soluciones.Estructuras_Control_Repetitivo;
public class Ejrc_72 {

    public static void main(String[] args) {
        final double G = 6.67259e-11; // N*m²/kg²
        final double M_Tierra = 5.97e24; // kg

        String[] nombres = {"Canada 1", "Alfa 1", "Boby 4", "Che 3"};
        String[] paises = {"Canadá", "Chile", "EE.UU.", "Argentina"};
        double[] masas = {8300, 5500, 12000, 3350}; // en kg
        double[] alturas = {31_200_000, 36_000_000, 33_450_000, 34_200_000}; // en metros

        double[] fuerzas = new double[masas.length];

        double mayorFuerza = Double.MIN_VALUE;
        double menorFuerza = Double.MAX_VALUE;
        double sumaFuerzas = 0;

        double mayorMasa = Double.MIN_VALUE;
        double sumaMasas = 0;

        double mayorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;

        for (int i = 0; i < masas.length; i++) {
            double r = alturas[i];
            double m = masas[i];

            double F = (G * m * M_Tierra) / (r * r);
            fuerzas[i] = F;

            if (F > mayorFuerza) mayorFuerza = F;
            if (F < menorFuerza) menorFuerza = F;
            sumaFuerzas += F;

            if (m > mayorMasa) mayorMasa = m;
            sumaMasas += m;

            if (r > mayorAltura) mayorAltura = r;
            if (r < menorAltura) menorAltura = r;
        }

        double promedioFuerzas = sumaFuerzas / masas.length;
        double promedioMasas = sumaMasas / masas.length;

        System.out.println("--- Resultados de la NASA ---");
        System.out.printf("a) Mayor fuerza de atracción: %.4e N\n", mayorFuerza);
        System.out.printf("   Menor fuerza de atracción: %.4e N\n", menorFuerza);
        System.out.printf("b) Fuerza de atracción promedio: %.4e N\n", promedioFuerzas);
        System.out.printf("c) Mayor masa registrada: %.2f kg\n", mayorMasa);
        System.out.printf("d) Masa promedio de satélites: %.2f kg\n", promedioMasas);
        System.out.printf("e) Menor altura registrada: %.0f m\n", menorAltura);
        System.out.printf("   Mayor altura registrada: %.0f m\n", mayorAltura);
    }
}

