package DSA.O03_OPPsPrinciples.Inheritence;

public class BoxWithWeight extends Box{
    double weight;

    BoxWithWeight() {
        this.weight = -1;
    }

    BoxWithWeight(int l, int w, int h, double weight) {
        super(l, w, h);
        this.weight = weight;
    }

    BoxWithWeight(int side, double weight) {
        super(side);
        this.weight = weight;
    }

    void getInfo(){
        System.out.println("Box has l, w, h of " + super.l + ", " + super.w+ ", " + super.h + " with weight of " + this.weight + "kg");
    }
}
