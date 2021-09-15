import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota do aluno: ");
        double nota = teclado.nextDouble();

        System.out.printf("A média do aluno foi %.2f",nota);
        if (nota >=7 ){
            System.out.println(" APROVADO");
        }else if (nota >= 4){
            System.out.println(" FINAL");
        }else{
            System.out.println(" REPROVADO");
        }



    }
}
