import java.util.Scanner;

public class CalculadoraJava {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a = 0;
        int b = 0;
        do {






            System.out.println("ESCOLHA UMA OPÇÃO");
            System.out.println("1-SAIR");
            System.out.println("2-SOMAR");
            System.out.println("3-SUBITRAIR");
            System.out.println("4-MULTIPLICAR");
            System.out.println("5-DIVIDIR");

             int opcao = teclado.nextInt();
             if (opcao == 1){
                 break;
             }
             else if (opcao == 2 || opcao ==3 || opcao ==4 || opcao ==5){
                 System.out.println("Digite dois números:");
                 a = teclado.nextInt();
                 b = teclado.nextInt();
             }

             switch (opcao){

                 case 2:
                     int i = a + b;
                     System.out.println("O resultado da soma: "+i);
                     break;
                 case 3:
                     int x = a - b;
                     System.out.println("O resultado da subitração: "+x);
                     break;
                 case 4:
                     int y = a * b;
                     System.out.println("O resultado da multiplicação: "+y);
                     break;
                 case 5:
                     int k = a / b;
                     System.out.println("O resultado da multiplicação: "+k);
                     break;
                 default:
                     System.out.println("Digite um número válido!");

             }
             }while (true);


    }

}
