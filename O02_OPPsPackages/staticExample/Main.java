package DSA.O02_OPPsPackages.staticExample;

public class Main {
    public static void main(String[] args) {
        Human ujju = new Human(22, 5.7f, "Ujjawal", true);
        Human dev = new Human(23, 5.8f, "Dev", true);

        System.out.println(ujju.population); // this will work but
        // it will first check in the object, does this object have value population?
        // no so it will go for Class, Does this class have value of population?
        // yes, so it fetches from there, so why not use the Class name on first place

        System.out.println(Human.population);
        Main obj = new Main();
        obj.greet();
    }

    void greet(){
        System.out.println("hi ujjawal");
    }
}
