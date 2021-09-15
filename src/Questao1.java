import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        if (!nome.trim().equals("")){
            System.out.println("Olá Sr(a)" + nome);

        }


    }
}
