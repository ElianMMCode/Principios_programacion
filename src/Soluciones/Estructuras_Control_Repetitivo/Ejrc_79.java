package Soluciones.Estructuras_Control_Repetitivo;

import java.util.Scanner;

public class Ejrc_79 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int totalLibros = 0;
        int librosCienciaFiccion = 0;
        int librosRomance = 0;

        int mayorCantidadLibros = 0;
        String autorMasProductivo = "";

        System.out.print("Ingrese el número de autores: ");
        int numAutores = t.nextInt();
        t.nextLine(); // limpiar

        for (int i = 1; i <= numAutores; i++) {
            System.out.print("\nIngrese el apellido del autor " + i + ": ");
            String apellido = t.nextLine();

            System.out.print("Ingrese la cantidad de libros del autor " + apellido + ": ");
            int cantidadLibros = t.nextInt();
            t.nextLine(); // limpiar

            int totalPaginas = 0;
            int maxPaginas = -1;
            String codLibroMayor = "";

            for (int j = 1; j <= cantidadLibros; j++) {
                System.out.print("\nCódigo del libro " + j + ": ");
                String codigo = t.nextLine();

                System.out.print("Género del libro (ciencia ficcion / romance / acción / terror / novela / autoayuda / académico): ");
                String genero = t.nextLine().toLowerCase();

                System.out.print("Número de páginas: ");
                int paginas = t.nextInt();
                t.nextLine(); // limpiar

                totalPaginas += paginas;
                totalLibros++;

                if (paginas > maxPaginas) {
                    maxPaginas = paginas;
                    codLibroMayor = codigo;
                }

                if (genero.equals("ciencia ficcion")) {
                    librosCienciaFiccion++;
                }
                if (genero.equals("romance")) {
                    librosRomance++;
                }
            }

            System.out.println("\n--- Resumen del autor ---");
            System.out.println("Apellido: " + apellido);
            System.out.println("Total de páginas escritas: " + totalPaginas);
            System.out.println("Libro con más páginas: Código = " + codLibroMayor + ", Páginas = " + maxPaginas);

            if (cantidadLibros > mayorCantidadLibros) {
                mayorCantidadLibros = cantidadLibros;
                autorMasProductivo = apellido;
            }
        }

        double porcentajeCienciaFiccion = (totalLibros > 0) ? (double) librosCienciaFiccion / totalLibros * 100 : 0;
        int totalCienciaYRomance = librosCienciaFiccion + librosRomance;

        System.out.println("\n--- Resumen General ---");
        System.out.printf("Porcentaje de libros de ciencia ficción: %.2f%%\n", porcentajeCienciaFiccion);
        System.out.println("Cantidad total de libros de ciencia ficción y romance: " + totalCienciaYRomance);
        System.out.println("Autor con más libros escritos: " + autorMasProductivo + " (" + mayorCantidadLibros + " libros)");
    }
}

