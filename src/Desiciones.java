import java.util.Scanner;

public class Desiciones {


    public static void main(String[] args) {

        int fechaDeLanzamiento=1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoDePlan = "Plus";

        if (fechaDeLanzamiento > 2022) {                       //operadores relacionales

            System.out.println("Peliculas mas Populares");
        } else {
            System.out.println("Peliculas Retro que aun vale la pena ver");
        }

        if (incluidoEnElPlan == true || tipoDePlan.equals("Plus")) {  //operadores logicos

            System.out.println("Disfrute de su pelicula");
        } else {

            System.out.println("Esta pelicula no esta incluida en su plan");
        }






    }

}
