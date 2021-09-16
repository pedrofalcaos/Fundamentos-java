public class AulaCaneta1 {
    public static void main(String[] args) {
        Caneta1 c1 = new Caneta1();
        c1.Cor = "Azul";
        //c1.ponta = 0.5f;
        c1.modelo = "Bic Cristal";
        c1.status();
        c1.carga = 80;
        c1.rabiscar();
        c1.destampar();

        Caneta1 c2 = new Caneta1();
        c2.Cor = "Preta";
        //c2.ponta = 0.7f;
        c2.tampar();
        c2.status();
        c2.rabiscar();





    }

}
