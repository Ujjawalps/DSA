package DSA.O01_OPPsIntroduction;

public class PassingDataWhileCreation {
    public static void main(String[] args) {
        Student std1 = new Student(11, "John", 78.65f);
        std1.greet();
        std1.changeName("Dev");
        std1.display();

        Student std2 = new Student();
        // we didn't get the error because we have 2 constructors in class and
        // That is constructor overloading ...

        std2.greet();
        std2.changeName("Bruce");
        std2.display();

        Student std3 = new Student(std1);
        std3.greet();
        std3.changeName("nick");
        std3.display();
    }
    static class Student{
        int roll_no;
        String name;
        float mark;

        Student(){
            this.roll_no = 100;
            this.name = "Tony";
            this.mark = 100.00f;
        }
        Student(int roll_no, String name, float mark){
            this.roll_no = roll_no;
            this.name = name;
            this.mark = mark;
        }
        Student(Student other){
            this.roll_no = other.roll_no;
            this.name = other.name;
            this.mark = other.mark;
        }
        void greet(){
            System.out.println("hi my name is :" + this.name);
        }

        void display(){
            System.out.println("Details are : "+ this.roll_no +", "+ this.name +", "+ this.mark);
        }
        void changeName(String newName){
            name = newName;
        }
    }
}
