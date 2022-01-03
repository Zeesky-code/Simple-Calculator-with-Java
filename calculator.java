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
    
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Calculator");
        System.out.println("*************************");
        System.out.println("What operation would you like to perform?" + '\n' + "Press 1 for addition or 2 for subtraction");
        int choice = input.nextInt();
        if (choice == 1){
            System.out.println("Enter the first number:");
            int first = input.nextInt();
            System.out.println("Enter the second number:");
            int second = input.nextInt();
            //calling the addition method
            System.out.println("The sum of the numbers is "+ addition(first,second));
        }
    }
}