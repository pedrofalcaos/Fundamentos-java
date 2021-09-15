import java.util.Scanner;

public class Questao7While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos alunos tem na turma?");
        int alunos = teclado.nextInt();
        int alunosf = alunos;
        double notam = 0;


        while(alunos>=1){

            System.out.println("Digite a nota do aluno "+alunos+":");
            double nota = teclado.nextDouble();
            notam = notam+nota;
            alunos--;



        }

        System.out.println("a média da turma foi "+(notam/alunosf));


    }
}
