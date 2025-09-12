package DSA.O04_OOPsAccessControl.Intro;
public class Main {
    public static void main(String[] args) {
        A obj = new A(25,25.25,25);

        System.out.println("Public: " + obj.publicVar);


        // System.out.println(obj.privateVar); // ERROR


        System.out.println("Private (via getter): " + obj.getPrivateVar());
        obj.setPrivateVar("newSecret");
        System.out.println("Private (after setter): " + obj.getPrivateVar());


        System.out.println("Protected: " + obj.protectedVar);

        System.out.println("Default: " + obj.defaultVar);

        // Print all info from A
        obj.printInfo();
    }
}

