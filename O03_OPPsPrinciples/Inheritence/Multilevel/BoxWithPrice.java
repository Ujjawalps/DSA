package DSA.O03_OPPsPrinciples.Inheritence.Multilevel;

import DSA.O03_OPPsPrinciples.Inheritence.Multilevel.Box;
import DSA.O03_OPPsPrinciples.Inheritence.Multilevel.BoxWithWeight;

public class BoxWithPrice extends BoxWithWeight {
    int price;

    BoxWithPrice() {
        this.price = -1;
    }

    BoxWithPrice(int price){
        super();
        this.price = price;
    }
    BoxWithPrice(double weight, int price){
        super(weight);
        this.price = price;
    }
    BoxWithPrice(int side, double weight, int price) {
        super(side, weight);
        this.price = price;
    }

    BoxWithPrice(int l, int w, int h, double weight, int price) {
        super(l, w, h, weight);
        this.price = price;
    }


    BoxWithPrice(BoxWithWeight old, int price){
        super(old);
        this.price = price;
    }

    BoxWithPrice(Box old, double weight, int price) {
        super(old, weight);
        this.price = price;
    }

    public BoxWithPrice(BoxWithPrice other){
        super(other);
        this.price = other.price;
    }
}
