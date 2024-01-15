public class Cerchio implements FiguraGeometrica {

    private double raggio;

    public Cerchio(double raggio){
        this.raggio=raggio;
    }

    @Override
    public double area(){
        return Math.PI*Math.pow(raggio,2);
    }

    @Override
    public double perimetro(){
        return 2*raggio*Math.PI;
    }
}
