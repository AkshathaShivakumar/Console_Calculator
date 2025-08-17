import java.util.Scanner;

public class Console_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("menu");
        System.out.println("0.exit");
        System.out.println("1.Addition");
        System.out.println("2.Subtration");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        System.out.println("6.Power");
        System.out.println("7.Square Root");
        System.out.print("enter your option:");
        int option = in.nextInt();

        while (option != 0){
            double a;
            double b;
            double c;
            int d;

            switch (option) {
                case 1:
                    System.out.print("Enter the frist operand: ");
                    a = in.nextDouble();
                    System.out.print("Enter the second operand: ");
                    b= in.nextDouble();
                    System.out.println("Result: " +addition(a,b));
                    break;
                case 2:
                    System.out.print("Enter the frist operand: ");
                    a = in.nextDouble();
                    System.out.print("Enter the second operand: ");
                    b= in.nextDouble();
                    System.out.println("Result: " +sub(a,b));
                    break;
                case 3:
                    System.out.print("Enter the frist operand: ");
                    a = in.nextDouble();
                    System.out.print("Enter the second operand: ");
                    b= in.nextDouble();
                    System.out.println("Result: " +mul(a,b));
                    break;
                case 4:
                    System.out.print("Enter the frist operand: ");
                    a = in.nextDouble();
                    System.out.print("Enter the second operand: ");
                    b= in.nextDouble();
                    System.out.println("Result: " +division(a,b));
                    break;
                case 5:
                    System.out.print("Enter the frist operand: ");
                    a = in.nextDouble();
                    System.out.print("Enter the second operand: ");
                    b= in.nextDouble();
                    System.out.println("Result: " +modulus(a,b));
                    break;
                case 6:
                    System.out.print("Enter the frist operand: ");
                    a = in.nextDouble();
                    System.out.print("Enter the second operand: ");
                    d= in.nextInt();
                    System.out.println("Result: "+power(a,d));
                    break;
                case 7:
                    System.out.print("Enter the operand: ");
                    c = in.nextDouble();
                    System.out.println("√" + c + " = "  +squareroot(c));
                    break;

                case 0:
                    System.out.println("exiting.....");
                    return;
            }
            System.out.println("Enter the option");
            option= in.nextInt();
         }
        System.out.println("exiting...");
    }
    static double addition(double a,double b){
        return a+b;
    }
    static double sub(double a,double b){
        return a-b;
    }
    static double mul(double a,double b){
        return a*b;
    }
    static double division(double a,double b){
        if(b==0){
            System.out.println("Cannot perform division by zero");
            return 0.0;
        }
        return a/b;
    }
    static double modulus(double a,double b){
        return a%b;
    }
    static double power(double a,int b){
        return Math.pow(a,b);
    }
    static double squareroot(double a){
        return Math.sqrt(a);
    }


}
