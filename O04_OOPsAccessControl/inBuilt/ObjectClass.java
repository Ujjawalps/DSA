package DSA.O04_OOPsAccessControl.inBuilt;

public class ObjectClass {
    int num;
    public ObjectClass(int num) {
        super();
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return this.num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass(12);
        ObjectClass obj2 = new ObjectClass(12);
        ObjectClass obj3 = obj1;

        // These will give random hash values for each before overriding....
//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());
//        System.out.println(obj3.hashCode());

        // after overriding these will give the same value if the value stored in obj.num is same
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());

        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj3));

        System.out.println(obj1 == obj2);
        System.out.println(obj1 == obj3);
    }
}
