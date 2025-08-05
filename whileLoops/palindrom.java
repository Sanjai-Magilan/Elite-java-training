package WhileLoops;
import java.util.*;

public class palindrom {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = input.nextInt();
        int a,b=0;
        while(num>0){
            a = num%10;
            b=b*10+a;
            num/=10;
        }
        System.out.println("palindrom of the given num is : "+b);
        input.close();
    }
}
