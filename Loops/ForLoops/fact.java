package Loops.ForLoops;
import java.util.*;
public class fact {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a=1 ,num;
        System.out.print("Enter a num: ");
        num = input.nextInt();
        for(int i=1;i<=num;i++){
            a*=i;
        }
        System.out.println("Fact : "+a);
        input.close();
    }    
}
