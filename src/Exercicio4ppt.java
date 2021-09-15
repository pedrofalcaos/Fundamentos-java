import java.util.Scanner;

public class Exercicio4ppt {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = teclado.nextInt();
        int numero2 = 0;
        System.out.println(numero2);
        System.out.println(numero);

        for (int i =0; i<8; i++){
            numero = numero + numero2;
            numero2 = numero - numero2;
            System.out.println(numero);
        }


    }
}
