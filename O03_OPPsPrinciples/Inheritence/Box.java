package DSA.O03_OPPsPrinciples.Inheritence;

public class Box {
    int l;
    int w;
    int h;

    Box() {
        int l = -1;
        int w = -1;
        int h = -1;
    }

    Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(int side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    static void message(){
        System.out.println("this is Box class...");
    }
}
