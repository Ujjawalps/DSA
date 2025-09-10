package DSA.O03_OPPsPrinciples.Inheritence.Multilevel;

import DSA.O03_OPPsPrinciples.Inheritence.Multilevel.Box;

public class BoxWithWeight extends Box {
    double weight;

    public BoxWithWeight() {
        this.weight = -1;
    }


    public BoxWithWeight(double weight){
        super();
        this.weight = weight;
    }
    public BoxWithWeight(int side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWithWeight(int l, int w, int h, double weight) {
        super(l, w, h);
        this.weight = weight;
    }

    public BoxWithWeight(Box old, double weight) {
        super(old);
        this.weight = weight;
    }

    public BoxWithWeight(BoxWithWeight other){
        super(other);
        this.weight = other.weight;
    }

    @Override
    void message(){
        System.out.println("Box has l, w, h of " + super.l + ", " + super.w+ ", " + super.h + " with weight of " + this.weight + "kg");
    }
}
