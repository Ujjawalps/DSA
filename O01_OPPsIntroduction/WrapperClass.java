package DSA.O01_OPPsIntroduction;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a + " " + b);
        // this will not swap as int is type primitive, and it doesn't pass as ref

        Integer a1 = 10;
        Integer b1 = 20;
        swap1(a1, b1);
        System.out.println(a1 + " " + b1);
        // this will not swap as Integer is wrapper class but uses final keyword internally

        A obj;
        for (int i = 0; i < 100000000; i++) {
            obj = new A("random name");

        }

        System.gc();
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    static void swap1(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
    static class A{
        final int a = 10;
        String name;
        public A (String name){
            this.name = name;
        }
        @Override
        protected void finalize() {
            System.out.println("object is destroyed");
        }
    }
}
