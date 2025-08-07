package test;
import java.util.Scanner;
public class Contains_Duplicate2 {
    static boolean flag;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter arry values : ");
        String[] tokens = input.nextLine().trim().split("\\s+");
        int arr[] = new int[tokens.length];
        for(int i=0;i<tokens.length;i++){
            arr[i]=Integer.parseInt(tokens[i]);
        }
        System.out.print("Enter search range : ");
        int range = input.nextInt();
        input.close();
        int find;
        for(int i =0;i<arr.length;i++){
            find=arr[i];
            for(int j=i+1;j<=range;j++){
                if(find==arr[j]){
                    flag=true;
                    break;
                }
            }
        }
        if(flag)
            System.out.println(flag);
        else
            System.out.println(flag);
    }
}
