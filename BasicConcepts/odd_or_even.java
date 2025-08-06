package BasicConcepts;
import java.util.*;
public class odd_or_even {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (num % 2 == 0 ){
            System.out.println("Given num is even");
        }else if(num %2 != 0 ){
            System.out.println("Given num is odd");
        }else if(num == 0){
            System.out.println("Given num is zero");
        }
        input.close();
    }
}
