import java.security.KeyStore;

public class Caneta {
    String modelo;
    String Cor;
    float ponta;
    int carga;
    boolean tampada;

    void status (){
        System.out.println("A cor da caneta é "+this.Cor);
        System.out.println("A caneta está tampada? "+this.tampada);
        System.out.println("A ponta da caneta é "+this.ponta);


    }

    void rabiscar(){
        if (tampada == true) {
            System.out.println("ERRO! A caneta está tampada!");
        }else {
            System.out.println("A caneta pode rabiscar!");
        }


    }

    void tampar(){
        this.tampada = true;


    }

    void destampar(){
        this.tampada = false;


    }
}
