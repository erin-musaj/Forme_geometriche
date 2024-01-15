public class Triangolo implements FiguraGeometrica{

    private double lato[];

    public Triangolo(double[] lato) throws Exception {
        if(lato.length!=3){
            throw new Exception("numero lati errati");
        }
        this.lato = new double[3];
        for (int i = 0; i < lato.length; i++) {
            this.lato[i]=lato[i];
        }
        if ((this.lato[0]+this.lato[1])<this.lato[2] || (this.lato[1]+this.lato[2])<this.lato[0] || (this.lato[0]+this.lato[2])<this.lato[1]){
            throw new Exception("Triangolo falso");
        }
    }


    @Override
    public double perimetro() {
        return this.lato[0]+this.lato[1]+this.lato[2];
    }

    @Override
    public double area() {
        double sp = perimetro()/2;
        return Math.sqrt(sp*(sp-this.lato[0])*(sp-this.lato[1])*(sp-this.lato[2]));
    }
}
