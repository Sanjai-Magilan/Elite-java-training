package test;
import java.util.Scanner;
public class spiral {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3x3 matrix :");
        int arr[][]=new int[3][3];
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=input.nextInt();
            }
        }
        input.close();

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==0)
                    System.out.print(arr[i][j]);
                else if(i==1){
                    j=1;
                    System.out.print(arr[i][j+1]);
                }
                else if(i==2){
                    System.out.print(" ");
                }
            }
        }
    }
}
