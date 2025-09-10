package DSA.O03_OPPsPrinciples.Inheritence.Multilevel;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Box Constructors ===");
        Box b1 = new Box();                          // default
        Box b2 = new Box(5);                         // cube (side)
        Box b3 = new Box(2, 3, 4);                   // l, w, h
        Box b4 = new Box(b3);                        // copy constructor

        b1.message();
        b2.message();
        b3.message();
        b4.message();

        System.out.println("\n=== Testing BoxWithWeight Constructors ===");
        BoxWithWeight bw1 = new BoxWithWeight();                  // default
        BoxWithWeight bw2 = new BoxWithWeight(15.5);              // only weight
        BoxWithWeight bw3 = new BoxWithWeight(6, 20.5);           // cube + weight
        BoxWithWeight bw4 = new BoxWithWeight(2, 3, 4, 25.0);     // l, w, h + weight
        BoxWithWeight bw5 = new BoxWithWeight(b3, 30.0);          // from Box + weight
        BoxWithWeight bw6 = new BoxWithWeight(bw4);               // copy BoxWithWeight

        bw1.message();
        bw2.message();
        bw3.message();
        bw4.message();
        bw5.message();
        bw6.message();

        System.out.println("\n=== Testing BoxWithPrice Constructors ===");
        BoxWithPrice bp1 = new BoxWithPrice();                                 // default
        BoxWithPrice bp2 = new BoxWithPrice(200);                              // only price
        BoxWithPrice bp3 = new BoxWithPrice(300, 50);                          // price + weight (careful: int weight gets promoted to double)
        BoxWithPrice bp4 = new BoxWithPrice(4, 12.5, 500);                     // cube + weight + price
        BoxWithPrice bp5 = new BoxWithPrice(2, 3, 4, 15.0, 700);               // l, w, h + weight + price
        BoxWithPrice bp6 = new BoxWithPrice(bw4, 999);                         // from BoxWithWeight + price
        BoxWithPrice bp7 = new BoxWithPrice(b3, 11.5, 1200);                   // from Box + weight + price
        BoxWithPrice bp8 = new BoxWithPrice(bp5);                              // copy BoxWithPrice

        // Printing manually since BoxWithPrice has no overridden message()
        System.out.println("bp1: " + bp1.l + "," + bp1.w + "," + bp1.h + " weight=" + bp1.weight + " price=" + bp1.price);
        System.out.println("bp2: " + bp2.l + "," + bp2.w + "," + bp2.h + " weight=" + bp2.weight + " price=" + bp2.price);
        System.out.println("bp3: " + bp3.l + "," + bp3.w + "," + bp3.h + " weight=" + bp3.weight + " price=" + bp3.price);
        System.out.println("bp4: " + bp4.l + "," + bp4.w + "," + bp4.h + " weight=" + bp4.weight + " price=" + bp4.price);
        System.out.println("bp5: " + bp5.l + "," + bp5.w + "," + bp5.h + " weight=" + bp5.weight + " price=" + bp5.price);
        System.out.println("bp6: " + bp6.l + "," + bp6.w + "," + bp6.h + " weight=" + bp6.weight + " price=" + bp6.price);
        System.out.println("bp7: " + bp7.l + "," + bp7.w + "," + bp7.h + " weight=" + bp7.weight + " price=" + bp7.price);
        System.out.println("bp8: " + bp8.l + "," + bp8.w + "," + bp8.h + " weight=" + bp8.weight + " price=" + bp8.price);
    }
}
