package DSA.O03_OPPsPrinciples.Polymorphism;

public class Numbers {
    void sum(){
        System.out.println("Please pass two numbers");
    }
    double sum(double a){
        return a;
    }
    double sum (int a){
        return a;
    }

    int sum (double a, double b){
        return ((int)(a+b));
    }
    double sum (int a, int b){
        return (double) a+b;
    }
    double sum (double a, double b, double c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
         obj.sum();

        System.out.println(obj.sum(2));

        System.out.println(obj.sum(5.8,2.3));

        System.out.println(obj.sum(23,343.3,332));
    }
}
