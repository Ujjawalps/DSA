package DSA.O04_OOPsAccessControl.Intro;

public class A {
    public int publicVar = 10;
    private String privateVar = "secret";
    protected double protectedVar = 99.9;
    int defaultVar = 100;


    public A(int publicVar, double protectedVar, int defaultVar) {
        this.publicVar = publicVar;
        this.protectedVar = protectedVar;
        this.defaultVar = defaultVar;
    }

    // Getter & Setter for privateVar
    public String getPrivateVar() {
        return privateVar;
    }

    public void setPrivateVar(String value) {
        this.privateVar = value;
    }

    // Utility to print info
    public void printInfo() {
        System.out.println("Inside A:");
        System.out.println("publicVar = " + publicVar);
        System.out.println("privateVar = " + privateVar);
        System.out.println("protectedVar = " + protectedVar);
        System.out.println("defaultVar = " + defaultVar);
    }


}
