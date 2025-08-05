package whileLoops;
import java.util.*;
public class armstrong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b=0,num,mun;
        System.out.print("Enter a num: ");
        num = input.nextInt();
        mun = num;
        while (num>0){
            a=num%10;
            b +=(a*a*a);
            num/=10;
        } 
        if (b==mun)
            System.out.println("Given num is armstrong num: "+mun);
        else
            System.out.println("Given num is not an armstrong num");
        input.close();
    }
}
