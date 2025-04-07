import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // clase para ingresar datos

        System.out.println("Escribe el nombre de tu pelicula favorita");

        String pelicula = teclado.nextLine();

        System.out.println("Ahora escribe la fecha de lanzamiento");

        int fechaDeLanzamiento = teclado.nextInt();

        System.out.println("Por ultimo dino que nota le das a esta pelicula");

        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
