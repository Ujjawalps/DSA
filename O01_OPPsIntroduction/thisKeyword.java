package DSA.O01_OPPsIntroduction;

public class thisKeyword {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.changeName("NewUjju");
        std1.greet();
        std1.display();
    }
    static class Student{
        int roll_no;
        String name;
        float mark;

        Student(){
            this.roll_no = 13;
            this.name = "Ujju";
            this.mark = 92.11f;
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
