import java.util.Scanner;

public class TipoReferenciadoString {

    public static void main(String[] args) {
        // Locale.setDefault(new Locale("pt", "BR")); para colocar o sistem em inglês. Utlizar ponto ao inves de virgula

        Scanner leTeclado = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome = leTeclado.next();

        System.out.println("o seu nome é " + nome);
    }
}
