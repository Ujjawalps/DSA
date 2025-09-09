package DSA.O02_OPPsPackages.staticExample;

public class Human {
    int age;
    float height;
    String name;
    boolean male;
    static long population = 10000;
    public Human(int age, float height, String name, boolean male){
        this.age = age;
        this.height = height;
        this.name = name;
        this.male = male;
        Human.population += 1;
        // this.first_message(); // this is not a good practice to call static methods
        Human.first_message();
    }
    static void first_message(){
        System.out.println("A Human created...");
//        System.out.print(": and The name is"+ this.name);  // can't use 'this' because this need obj but the static doesn't
    }
}
