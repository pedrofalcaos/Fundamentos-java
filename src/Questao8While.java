import java.util.Scanner;

public class Questao8While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int OPCAOSOMAR = 1;
        final int OPCAOSUB = 2;
        final int SAIR = 3;


        int opcaoteclado;
        do {

            System.out.println("ESCOLHA UMA OPÇÃO");
            System.out.println("1-SOMAR");
            System.out.println("2-SUBITRAIR");
            System.out.println("3-SAIR");

            opcaoteclado = teclado.nextInt();

            if (opcaoteclado == SAIR) {
                break;
            }
            if (opcaoteclado != OPCAOSUB && opcaoteclado != OPCAOSOMAR) {
                System.out.println("NÚMERO INVÁLIDO!, DIGITE NOVAMENTE: ");
                continue;

            }


            System.out.println("Digite o primeiro número");
            int num1 = teclado.nextInt();
            System.out.println("Digite o segundo número");
            int num2 = teclado.nextInt();

            if (opcaoteclado == OPCAOSOMAR) {
                System.out.println("O resultado da soma entre " + num1 + " e " + num2 + " é igual a: " + (num1 + num2));

            } else {
                System.out.println("O resultado da subitração entre " + num1 + " e " + num2 + " é igual a " + (num1 - num2));

            }

        } while (opcaoteclado != SAIR);

        System.out.println("OBRIGADO POR UTILIZAR O PROGRAMA!");
    }
}
