import java.util.Scanner;

public class calculator {
    static int addition(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    static int subtraction(int num1, int num2) {
        int difference = num1 - num2;
        return difference;
    }
    static double division(double num1, double num2) {
        double divide = num1/num2;
        return divide;
    }
    static double multiplication(double num1, double num2) {
        double multiple = num1*num2;
        return multiple;
    }
    static void intro(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Calculator");
        System.out.println("*************************");
        System.out.println("What operation would you like to perform?" + '\n' + "Press 1 for addition, 2 for subtraction, 3 for division or 4 for multiplication:");
        int choice = input.nextInt();
        if (choice == 1){
            System.out.println("Enter the first number:");
            int first = input.nextInt();
            System.out.println("Enter the second number:");
            int second = input.nextInt();
            //calling the addition method
            System.out.println("The sum of the numbers is "+ addition(first,second));
        }
        else if (choice ==2){
            System.out.println("Enter the first number:");
            int first = input.nextInt();
            System.out.println("Enter the second number:");
            int second = input.nextInt();
            //calling the subtraction method
            System.out.println("The difference between the numbers is "+ subtraction(first,second));
        }
        else if (choice==3){
            System.out.println("Enter the first number:");
            double first = input.nextDouble();
            System.out.println("Enter the second number:");
            double second = input.nextDouble();
            //calling the addition method
            System.out.println("The result is "+ division(first,second));
        }
        else if (choice==4){
            System.out.println("Enter the first number:");
            double first = input.nextDouble();
            System.out.println("Enter the second number:");
            double second = input.nextDouble();
            //calling the addition method
            System.out.println("The result is "+ multiplication(first,second));
        }
    }
    public static void main(String[] args) {
        intro();
    }
}