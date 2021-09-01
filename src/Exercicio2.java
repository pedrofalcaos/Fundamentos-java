import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double numero1 = leTeclado.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2 = leTeclado.nextDouble();
        double soma = (numero1 + numero2);
        double media = (soma/2);
        System.out.println("A sua média é " + media);
    }
}
