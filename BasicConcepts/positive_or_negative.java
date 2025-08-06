package BasicConcepts;
import java.util.*;
public class positive_or_negative {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = input.nextInt();
        if(num <0){
            System.out.println("given number is negative number");
        }else if(num>0){
            System.out.println("given number is positive number");
        } 
        else{
            System.out.println("given number is zero");
        }
        input.close();
    }    
}
