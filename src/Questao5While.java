import java.util.Scanner;

public class Questao5While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triângulo:");
        int lado1 = teclado.nextInt();
        System.out.println("Digite o segundo lado do triângulo:");
        int lado2 = teclado.nextInt();
        System.out.println("Digite o terçeiro lado do triângulo:");
        int lado3 = teclado.nextInt();

        if (lado1 < lado2 + lado3 || lado2 < lado1 + lado3 || lado3 < lado1 + lado2){
            System.out.print("É UM TRINÂNGULO");
            if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
                System.out.println(" ESCALENO");
            }
            else if (lado1 == lado2 && lado1 == lado3){
                System.out.println(" EQUILATERO");
            }
            else {
                System.out.println(" ISÓCELIS");
            }
        }else{
            System.out.println("NÃO É UM TRIÂNGULO");
        }

    }
}
