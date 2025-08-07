package test;
import java.util.Scanner;
public class ContainsDuplicate2 {
    static boolean flag;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            System.out.print("Enter the arry size : ");
            int n = input.nextInt();
            int arr[]= new int[n];
            System.out.print("Enter arry values : ");
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            System.out.print("Enter search range : ");
            int range = input.nextInt();
            input.close();
            int find;
            for(int i =0;i<n;i++){
                find=arr[i];
                for(int j=i+1;j<=range;j++){
                    if(find==arr[j]){
                        flag=true;
                    }
                }
            }
            if(flag)
                System.out.println(flag);
            else
                System.out.println(flag);
    }
}
