import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();
        if (numero%2==0){
            System.out.println("O número "+numero+" é par");
        }else{
            System.out.println("O número "+numero+" é ímpar");
        }
    }
}
