import java.util.Scanner;

public class Exercicio3ppt {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = teclado.nextInt();

        int contador = numero;
        int somatorio = numero;

        do {
            numero--;
            somatorio = somatorio * numero;
            contador--;
        }while (contador>1);

        System.out.println("A fatorial do número é "+somatorio);


    }
}
