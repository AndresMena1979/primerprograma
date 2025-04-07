import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinacion {

    public static void main(String[] args) {
        Scanner IngresaTeclado = new Scanner(System.in);

        int intentos = 0;

        Random rand = new Random();

        int numeroAleatorio = rand.nextInt(10);

        int respuestaUsuario;


        while (intentos < 5){

            System.out.println(" ¡Adivina el número!,  Ingresa un numero del 1 al 100");

            respuestaUsuario = IngresaTeclado.nextInt();

         if (respuestaUsuario == numeroAleatorio ) {

             System.out.println("Haz adivinado el número: " + numeroAleatorio);

             break;

         } else if (respuestaUsuario < numeroAleatorio){

             System.out.println("El número es mayor");
         } else if (respuestaUsuario > numeroAleatorio) {

             System.out.println("el numero es menor");

         }

    intentos++;


        }

      if (intentos == 5) {


            System.out.println("Lo sentimos, no quedan mas oportunidades");


        }





    }
}
