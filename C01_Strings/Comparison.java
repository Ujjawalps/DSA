package DSA.C01_Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Ujjawal";
        String b = "Ujjawal";
        System.out.println(a == b);
        //True because it is checking for the object is same or not

        String name1 = new String("Singh");
        String  name2 = new String("Singh");
        System.out.println(name1 == name2);
        //False because here we have two diff objects, because we are using heap not String-Pool

        System.out.println(a.equals(b));
        System.out.println(name1.equals(name2));
        //True in both cases because .equals() check for value only


    }
}
