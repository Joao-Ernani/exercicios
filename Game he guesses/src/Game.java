import  java.util.Scanner;
import java.util.Random;
public class Game {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(10);
        int tentativas = 3;
        int contador = 3;
        int i;

        System.out.println("Você tem 5 chances pra adivnhar o número");
        for (i = 0; i < tentativas; i++) {

            System.out.println("Chute um numero");

            int numero = sc.nextInt();

            if (numero > 10) {
                System.out.println("O numero que chutou não pode ser maio do que 10");
            } else {

                if (numero == numeroAleatorio) {
                    System.out.println("Parabens você acertou o numero");
                } else {
                    contador--;
                    System.out.println("Você erro!! tem mais mais " + contador + " chances para tentar acertar");

                    if (numero > numeroAleatorio) {
                        System.out.println("O numero que chutou é maior que o numero sorteado");
                    } else {
                        System.out.println("O numero que você chutou é menor que o numero sorteado ");
                    }
                }

            }
        }

        System.out.println("Numero sorteado é " + numeroAleatorio);
    }
}