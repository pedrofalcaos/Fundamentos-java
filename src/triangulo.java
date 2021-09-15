public class triangulo {
    double l1;
    double l2;
    double l3;

    public double Perimetro() {
        return (l1+l2+l3)/2;
    }

    public double area() {
        double calculaPerimetro = Perimetro();
        return Math.sqrt(calculaPerimetro*(calculaPerimetro-l1)*(calculaPerimetro-l2)*(calculaPerimetro-l3));

    }
}
