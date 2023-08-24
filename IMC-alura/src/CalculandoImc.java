import java.util.Scanner;
public class CalculandoImc {

    public static void main(String[] args) {

        Scanner inputNome = new Scanner(System.in);
        String nome = inputNome.next();
        System.out.println(nome);

        float peso = 100;
        float altura = 1.70F;

        float imc = (peso / (altura * altura));
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
