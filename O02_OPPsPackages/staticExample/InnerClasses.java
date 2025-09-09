package DSA.O02_OPPsPackages.staticExample;

public class InnerClasses {
    static class Test {
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test obj1 = new Test("Ujju");
        Test obj2 = new Test("Dev");

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
