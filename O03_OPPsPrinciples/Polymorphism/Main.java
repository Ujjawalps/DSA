package DSA.O03_OPPsPrinciples.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area();

        Circle cr = new Circle();
        cr.area();

        Triangle tr = new Triangle();
        tr.area();
    }
}
