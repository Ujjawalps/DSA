package DSA.practice01;

public class passThePillow {
    public static void main(String[] args) {
        int n=3 , time=2;
        System.out.println(passThePillow_(n,time));
    }
    static int passThePillow_(int n, int time){
        int cycleTime = 2 * (n - 1);
        int effectiveTime = time % cycleTime;

        if (effectiveTime < (n - 1)) {
            // Moving forward
            return 1 + effectiveTime;
        } else {
            // Moving backward
            return n - (effectiveTime - (n - 1));
        }
    }
}
