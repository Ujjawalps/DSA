package DSA.O03_OPPsPrinciples.Inheritence.Hirarchial;

public class BoxWithWeight extends Box {
    double weight;

    BoxWithWeight() {
        super();
        this.weight = -1;
    }

    BoxWithWeight(int l, int w, int h, double weight) {
        super(l, w, h);
        this.weight = weight;
    }

    @Override
    void message() {
        System.out.println("BoxWithWeight: " + l + "x" + w + "x" + h + ", weight=" + weight);
    }
}
