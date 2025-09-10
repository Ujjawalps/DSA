package DSA.O03_OPPsPrinciples.Inheritence;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();

        Box box2 = new Box(3,4,6);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);

        BoxWithWeight box3 = new BoxWithWeight(5,2,8, 12);
        box3.getInfo();

        Box box4 = new BoxWithWeight(2,3,4,10);
        System.out.println(box4.l);
//        System.out.println(box4.weight);

//        BoxWithWeight box5 = new Box(2,3,4,10); -> this will give error
//        System.out.println(box5.weight);


    }
}
