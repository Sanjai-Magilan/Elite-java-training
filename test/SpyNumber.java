package test;
import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = input.nextInt();
        input.close();
        int a,sum =0, product=1;
        while(num>0){
            a=num%10;
            sum+=a;
            product*=a;
            num/=10;
        }
        if(sum==product)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
