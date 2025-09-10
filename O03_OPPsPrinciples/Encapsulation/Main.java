package DSA.O03_OPPsPrinciples.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ujjawal", 21);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

        // Trying to set invalid age
        s1.setAge(-5);

        // Updating values correctly
        s1.setAge(25);
        System.out.println("Updated Age: " + s1.getAge());
    }
}

