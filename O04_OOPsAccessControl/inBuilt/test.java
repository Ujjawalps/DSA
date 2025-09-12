package DSA.O04_OOPsAccessControl.inBuilt;

import DSA.O04_OOPsAccessControl.Intro.A;

public class test extends A {
    public test(int publicVar, double protectedVar, int defaultVar) {
        super(publicVar, protectedVar, defaultVar);
    }

    public static void main(String[] args) {
        test obj1 = new test(1, 2.2, 3);
        double n1 = obj1.protectedVar;

        // but when we try to create obj of A
        A obj2 = new A(10,20.2,30);
//        double n2 = obj2.protectedVar;

        // let's see the obj type of 'test' but ref type of 'A'
        A obj3 = new test(100,200.2,3000);
//        double n3 = obj3.protectedVar;
    }
}
