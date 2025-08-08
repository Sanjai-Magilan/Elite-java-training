package Loops.ForLoops;

import java.util.Scanner;

public class armstrong {
    static int mun;
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int a,b=0;
        boolean flag = true;
        for ( int num= input.nextInt();num>0;num/=10){
            if (flag){
                mun = num;
                flag=false;
            }
            a=num%10;
            b+=a*a*a;
        }if(b == mun)
            System.out.println("Given num is an armstrong num : "+b);
        else
            System.out.println("Given num is not an armstrong num : "+b);
            
            input.close();
    }
}
