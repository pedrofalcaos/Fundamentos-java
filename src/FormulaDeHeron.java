import java.util.Scanner;

public class FormulaDeHeron {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primeiro lado: ");
        int a = teclado.nextInt();
        System.out.println("segundo lado: ");
        int b = teclado.nextInt();
        System.out.println("Terceiro lado: ");
        int c = teclado.nextInt();

        int p = (a+b+c)/2;
        int h = p*(p-a)*(p-b)*(p-c);
        int k = (int) Math.sqrt(h);



    }
}
