import java.util.Scanner;
public class calculator {
    public void add(int a, int b) {
        int c = a + b;
        System.out.println("The sum of a and b is: " + c);
    }
    public void sub(int a, int b){
        int c = a - b;
        System.out.println("the difference of a and b is: " + c);
    }
    public void mul(int a, int b){
        int c = a * b;
        System.out.println("the product of a and b is: " + c);
    }
    public void div(int a, int b){
        if (b != 0 && a != 0) {
            double c = a / b;
            System.out.println("the division of a and b is: " + c);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        calculator calc = new calculator();
        calc.add(num1, num2);
        calc.sub(num1, num2);
        calc.mul(num1, num2);
        calc.div(num1, num2);
        input.close();
    }
}

