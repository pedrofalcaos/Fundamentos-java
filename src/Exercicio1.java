import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
       Scanner leTeclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leTeclado.nextLine();
        leTeclado.nextLine();
        System.out.println("Olá,"+nome );
        System.out.println("Commit");
    }
}
