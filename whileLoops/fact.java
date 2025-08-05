package whileLoops;
import java.util.*;
public class fact {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = input.nextInt();
        int fac=1;
        while(num>0){
            fac*=num;
            num--;
        }
        System.out.println("Factorial = "+ fac);
        input.close();
    }
}
