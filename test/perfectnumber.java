package test;
import java.util.Scanner;
public class perfectnumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = input.nextInt();
        input.close();
        int n=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                n+=i;
        }
        if(num==n)
            System.out.println("Given num is a perfect num");
        else
            System.out.println("Given num is not a perfect num");
    }    
}
