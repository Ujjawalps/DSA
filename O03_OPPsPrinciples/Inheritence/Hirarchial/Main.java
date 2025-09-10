package DSA.O03_OPPsPrinciples.Inheritence.Hirarchial;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Hierarchical Inheritance Demo ===");

        Box box = new Box(3, 4, 5);
        BoxWithWeight bw = new BoxWithWeight(2, 3, 4, 10.5);
        BoxWithColor bc = new BoxWithColor(5, 5, 5, "Red");

        box.message();
        bw.message();
        bc.message();
    }
}
