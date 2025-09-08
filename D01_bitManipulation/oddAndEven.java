package DSA.D01_bitManipulation;

public class oddAndEven {
    public static void main(String[] args) {
        int n1 = 19;
        System.out.println(oddAndEven_(n1));
        int n2 = 0;
        System.out.println(oddAndEven_(n2));
        int n3= 22;
        System.out.println(oddAndEven_(n3));
        int n4= -22;
        System.out.println(oddAndEven_(n4));
    }

    private static String oddAndEven_(int n) {
        if((n&1) == 1){
            return "Odd";
        }else{
            return "Even";
        }
    }
}
