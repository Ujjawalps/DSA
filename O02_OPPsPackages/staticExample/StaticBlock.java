package DSA.O02_OPPsPackages.staticExample;

import java.util.stream.StreamSupport;

public class StaticBlock {
    static int a = 10;
    static int b;

    // only get called once when the class loads...
    static {
        System.out.println("Inside static");
        b = 10*a;
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 10;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}
