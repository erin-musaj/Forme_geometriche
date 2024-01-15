import javax.xml.validation.SchemaFactoryConfigurationError;

public class Main {
    public static void main(String[] args) {

        Cerchio cerchio = new Cerchio(8);
        System.out.println("perimetro cerchio: " + cerchio.perimetro());
        System.out.println("area cerchio: " + cerchio.area());
        Quadrato quadrato = new Quadrato(4);
        System.out.println("perimetro quadrato: " + quadrato.perimetro());
        System.out.println("area quadrato: " + quadrato.area());
        try{
            Triangolo triangolo = new Triangolo(new double[]{3,3,4});
            System.out.println("perimetro cerchio: " + triangolo.perimetro());
            System.out.println("area triangolo " + triangolo.area());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}