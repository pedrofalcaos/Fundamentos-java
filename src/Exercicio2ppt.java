import java.util.Scanner;

public class Exercicio2ppt {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = teclado.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = teclado.nextInt();
        System.out.println("Digite o terceiro número:");
        int num3 = teclado.nextInt();

        if(num1>num2 & num1>num3 & num2>num3){
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        }
        if(num1>num2 & num1>num3 & num3>num2){
            System.out.println(num1);
            System.out.println(num3);
            System.out.println(num2);
        }
        if(num2>num1 & num2>num3 & num1>num3){
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        }
        if(num2>num1 & num2>num3 & num3>num1){
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num1);
        }
        if(num3>num1 & num3>num2 & num1>num2){
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
        }
        if(num3>num1 & num3>num2 & num2>num1){
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
        }
    }
}
