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
            System.out.print(arr[i][0]+" ");
        }
        for (int j=1;0<j;j--){
            System.out.print(arr[2][j]+" ");
        }
        for(int i=2;i>=0;i--){
            System.out.print(arr[i][2]+" ");
        }
        for(int j=0;j<2;j++){
            System.out.print(arr[j][1]+" ");
        }
    }
}
