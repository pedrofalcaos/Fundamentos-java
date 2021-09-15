import java.util.Scanner;

public class Questao6While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantidade de patinhos:");
        int n = teclado.nextInt();
        int cont = n;

        while(n>1){
            System.out.println(n+" patinhos"+" foram passear\n"+"além das montanhas\n"+"para brincar"+"a mamãe gritou:Quá, Quá, Quá\n"+"mas só "+(n-1)+" voltaram de lá");
            n--;
        }
        System.out.println("A mamãe patinha foi procurar\n"+"Além das montanhas\n"+"Na beira do mar\n"+"A mamãe gritou:Quá, Quá, Quá\n"+"E os "+ (cont-1) + " patinhos voltaram e lá");


    }
}
