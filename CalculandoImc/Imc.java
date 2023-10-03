package CalculandoImc;
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {

        System.out.println("Digite seu nome para que possamos continuar ");

        Scanner inputNome = new Scanner(System.in);
        String nome = inputNome.next();

        System.out.println("legal " + nome + " agora digite seu peso para continuar");

        Scanner pesoPessoa = new Scanner(System.in);
        float peso = pesoPessoa.nextFloat();
        System.out.println("seu peso é " + peso);

        System.out.println("Agora que já sabemos seu peso precisamos de sua altura");

        Scanner alturaPessoa = new Scanner(System.in);
        float altura = alturaPessoa.nextFloat();

        float imc = peso / ( altura * altura);
        System.out.println(imc);

        if (imc <= 18.5){
            System.out.println(nome + " Seu imc é " + imc + " está abaixo do normal por favor consultar um médico");
        } else if (imc >= 18.6 && imc <= 24.9)  {
            System.out.println(nome + " Seu imc é " + imc + " Parabéns seu imc está normal");
        } if ( imc >= 25.9 && imc <= 29.9) {
            System.out.println(nome + " Seu imc é " + imc + " Você está levemente acima do peso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println(nome + " Seu imc é " + imc + " Obesidade de grau I");
        } if (imc >= 35 && imc <= 39.9){
            System.out.println(nome + " Seu imc é " + imc + " Obesidade de grau II");
        } else if (imc >= 40){
            System.out.println(nome + " Seu imc é " + imc + "Obesidade severa III procure ajuda vai morre praga");
        }
    }
}
