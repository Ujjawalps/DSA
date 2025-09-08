package DSA.O01_OPPsIntroduction;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll No-
        int[] roll_no = new int[5];
        // store 5 names-
        String[] name = new String[5];
        // store 5 marks-
        float[] marks = new float[5];

        // What is need to create all this in a single data type... We can use classes
        // to create our own data type
        Students std1 = new Students();

        System.out.println(std1);  //some random values --> memory address

        // it will print default values of these data types-> 0, null, 0.0
        System.out.println(std1.roll_no);
        System.out.println(std1.names);
        System.out.println(std1.marks);

        std1.roll_no = 22;
        std1.names = "Ujjawal";
        std1.marks = 85.11f;

        System.out.println(std1.roll_no);
        System.out.println(std1.names);
        System.out.println(std1.marks);

    }
    static class Students{
        int roll_no;
        String names;
        float marks;
    }
}
