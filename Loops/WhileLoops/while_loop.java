package Loops.WhileLoops;
import java.util.*;
public class while_loop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int add=0,i=1,num = input.nextInt();
        while(i<=num){
            add+=i;
            i++;
        }
        System.out.println("Sum = "+add);
        input.close();
    }
}
 