package ForLoops;
import java.util.*;
public class sum_of_digits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int a,b=0;
        for ( int num= input.nextInt();num>0;num/=10){
            a=num%10;
            b+=a;
        }System.out.println("Sum of given digit : "+b);
        input.close();
    }
}
