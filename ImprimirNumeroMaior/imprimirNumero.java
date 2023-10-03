package ImprimirNumeroMaior;
import java.util.Scanner;


public class imprimirNumero {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;


        System.out.println("digite 3 numeros");

        Scanner numero1 = new Scanner(System.in);
        num1 = numero1.nextInt();

        System.out.println("agora digite o segundo numero");

        Scanner numero2 = new Scanner(System.in);
        num2 = numero2.nextInt();

        System.out.println("Digite o ultimo numero");

        Scanner numero3 = new Scanner(System.in);
        num3 = numero3.nextInt();



        if (num1 > num2 && num1 > num3){
            System.out.println("O maior numero é " + num1);
        }
        if (num2 > num3 && num2 > num1 ){
            System.out.println("O maior numero é " + num2);
        }
        if (num3 > num1 && num3 > num2){
            System.out.println("O numero maior é " + num3);
        }

        if (num1 < num2 && num1 < num3){
            System.out.println("O numero menor é " + num1);
        }
        if (num2 < num3 && num2 < num1 ){
            System.out.println("O numero menor é " + num2);
        }
        if (num3 < num1 && num3 < num2){
            System.out.println("O numero menor é " + num3);
        }

        float media = (num1 + num2 + num3) / 3;
        System.out.println("E a media desses 3 numeros é " + media);


    }
}
