package DSA.O03_OPPsPrinciples.Inheritence.Multilevel;

public class Box {
    int l;
    int w;
    int h;

    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box (int side){
        this.l = this.w = this.h = side;
    }
    Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    void message(){
        System.out.println("this is Box class...");
    }
}
