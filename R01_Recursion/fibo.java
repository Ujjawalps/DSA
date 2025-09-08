package DSA.R01_Recursion;

public class fibo {
    public static void main(String[] args) {
        System.out.println(fibo(10));
        System.out.println(fibo(50)); // This will get stuck because of T(x)=2^n


        System.out.println(fiboFormula(10)); // This will work for any value with
    }
    static long fiboFormula(int n){
        return (long)((Math.pow(((1 + Math.sqrt(5)) / 2), n) - (Math.pow(((1 - Math.sqrt(5)) / 2), n))) / Math.sqrt(5));
    }
    static int fibo(int n){
        if (n<2){
            return n;
        }
         return fibo(n-1) + fibo(n-2);
    }
}
