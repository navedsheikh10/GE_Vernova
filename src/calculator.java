import java.util.Scanner;

public class calculator {
    double a;
    double b;

    public double add(double x, double y) {
    return x+y;
    }
    public double sub(double x, double y) {
    return x-y;
    }
    public double multi(double x, double y) {
    return x*y;
    }
    public double div(double x, double y) {
    return x/y;
    }
    public void runCalculator(){
        System.out.println("Welcome User");
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.println("Enter \n 1-> Addition \n 2 -> Subtraction \n 3 -> Multiplication \n 4 ->Division");

            int user_input = sc.nextInt();
            System.out.println("Enter first number");
            a = sc.nextDouble();
            System.out.println("Enter second number");
            b = sc.nextDouble();
            switch(user_input){

                case 1 -> System.out.println(add(a,b));
                case 2 -> System.out.println(sub(a,b));
                case 3 -> System.out.println(multi(a,b));
                case 4 -> System.out.println(div(a,b));
                default -> System.out.println("Enter valid option");
            }
            System.out.println("Press 0 to exit");
            input = sc.nextInt();

        }while(input != 0);
        sc.close();
    }
}
