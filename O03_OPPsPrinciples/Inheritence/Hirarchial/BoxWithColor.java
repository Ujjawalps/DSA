package DSA.O03_OPPsPrinciples.Inheritence.Hirarchial;

public class BoxWithColor extends Box{
    String color;

    BoxWithColor() {
        super();
        this.color = "undefined";
    }

    BoxWithColor(int l, int w, int h, String color) {
        super(l, w, h);
        this.color = color;
    }

    @Override
    void message() {
        System.out.println("BoxWithColor: " + l + "x" + w + "x" + h + ", color=" + color);
    }
}
