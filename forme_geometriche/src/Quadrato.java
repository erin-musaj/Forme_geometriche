public class Quadrato implements FiguraGeometrica{

    private double lato;

    public Quadrato(double lato){
        this.lato=lato;
    }

    @Override
    public double perimetro() {
        return this.lato*4;
    }

    @Override
    public double area() {
        return this.lato*this.lato;
    }
}
