package Loops.ForLoops;
import java.util.*;
public class palindrom {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int temp =0,tem;
        for(int num = input.nextInt();num>0;num/=10){
            tem=num%10;
            temp=temp*10+tem;
        }input.close();
        System.out.println("palindrom of the given num : "+temp);
    }
}
