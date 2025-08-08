package Loops.WhileLoops;
import java.util.*;
class positive_or_negative {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of inputs : ");
        int n = input.nextInt();
        int i=0,m;
        while(i<n){
            System.out.print("Enter num "+(i+1)+": ");
            m=input.nextInt();
            if(m<0)
                System.out.println("Given num is negative");
            else if(m>0)
                System.out.println("Given num is positive");
            else
                System.out.println("Given num is zero");
            i++;
        }
        input.close();
    }
}