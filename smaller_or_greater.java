import java.util.*;
public class smaller_or_greater {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int num1 = input.nextInt();
        System.out.print("Enter second num: ");
        int num2 = input.nextInt();
        System.out.print("Enter third num: ");
        int num3 = input.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("Number 1 is greater");
        } else if (num1<num2 && num2 > num3){
            System.out.println("Number 2 is greater");
        }
        else if (num3>num1 && num3>num2) {
            System.out.println("NUmber 3 is greater");
        }else{
            System.out.println("There are more than one greater number");
        }
        input.close();
    }    
}
