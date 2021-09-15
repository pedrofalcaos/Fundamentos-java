import java.util.Scanner;

public class Questao4While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero =teclado.nextInt();
        while (numero<1000){
            numero++;
            if(numero%2==0){
                System.out.println(numero);
            }

        }
    }
}
