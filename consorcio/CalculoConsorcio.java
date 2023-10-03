package consorcio;
import java.util.Scanner;

public class CalculoConsorcio {
    public static void main(String[] args) {
        System.out.println(" Olá somos da empresa CarTop me informe seu nome para que possamos continuar");
        Scanner nome = new Scanner(System.in);
        String nomePessoa = nome.next();

        System.out.println(" Certo! " + nomePessoa + " agora sua idade");
        Scanner idade = new Scanner(System.in);
        int idadePessoa = idade.nextInt();

        if (idadePessoa < 18){
            System.out.println("Desculpa mais não podemos dar continuidade ao processo pois você é menor de idade");
        }else {
            System.out.println("Legal vi que você é maior de idade, agora me informe seu salario para continuar o processo");
        }

        Scanner salario = new Scanner(System.in);
        double  salarioPessoa = salario.nextDouble();

        if (salarioPessoa >= 2000){
            System.out.println("Legal você pode comprar o carro");
        } else {
            System.out.println("Infelizmente você não tem os requisitos para comprar o carro");
        }


    }
}


