package IdadePraVoto;
import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        System.out.println("Digite seu nome");
        Scanner nomePessoa = new Scanner(System.in);
        String nome = nomePessoa.next();
        System.out.println("Legal " + nome + " me fala sua idade para ver se está a apto a votar");

        Scanner idadePessoa = new Scanner(System.in);
        int idade = idadePessoa.nextInt();

        if (idade >= 18 && idade <= 69 ) {
            System.out.println("Você tem a obrigação de votar");
        }
        if (idade >= 16 && idade <=17){
            System.out.println("O voto é facultativo vota se quiser");
        }
        if (idade < 16){
            System.out.println("Você não tem idade para votar ainda");
        }
        if (idade >= 70){
            System.out.println("O voto é facultativo pode escolher se quer votar ou não");
        }

    }
}
