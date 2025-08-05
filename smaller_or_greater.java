import java.util.*;
public class smaller_or_greater {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int num1 = input.nextInt();
        System.out.print("Enter second num: ");
        int num2 = input.nextInt();
        if (num1>num2){
            System.out.println("Number 1 is greater than Number 2");
        } else if (num1<num2){
            System.out.println("Number 2 is greater than Number 1");
        } else {
            System.out.println("Both numbers are equal");
        }
        input.close();
    }    
}
