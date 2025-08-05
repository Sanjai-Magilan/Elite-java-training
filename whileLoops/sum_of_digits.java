package whileLoops;
import java.util.*;
public class sum_of_digits{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b=0;
        System.out.print("Enter a num: ");
        int num = input.nextInt();
        while(num>0){
            a=num%10;
            b+=a;
            num/=10;
        }
        System.out.println("Sum of digits = "+b);
        input.close();
    }
}
