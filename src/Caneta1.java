public class Caneta1 {
    public String modelo;
    public String Cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status (){
        System.out.println("A cor da caneta é "+this.Cor);
        System.out.println("A caneta está tampada? "+this.tampada);
        System.out.println("A ponta da caneta é "+this.ponta);


    }

    public void rabiscar(){
        if (tampada == true) {
            System.out.println("ERRO! A caneta está tampada!");
        }else {
            System.out.println("A caneta pode rabiscar!");
        }


    }

    public void tampar(){
        this.tampada = true;


    }

    public void destampar(){
        this.tampada = false;


    }
}
