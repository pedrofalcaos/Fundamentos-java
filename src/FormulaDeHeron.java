import java.util.Scanner;

public class FormulaDeHeron {
    public static void main(String[] args) {
        triangulo t1 = new triangulo();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primeiro lado: ");
        t1.l1 = teclado.nextDouble();
        System.out.println("segundo lado: ");
        t1.l2 = teclado.nextDouble();
        System.out.println("Terceiro lado: ");
        t1.l3 = teclado.nextDouble();

        System.out.println(t1.area());




    }
}
