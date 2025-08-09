package test;
import java.util.Scanner;

public class SpiralDynamic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your matrix size");
        System.out.print("Enter row size : ");
        int row = input.nextInt();
        System.out.print("Enter column size : ");
        int col = input.nextInt();
        System.out.println("Enter the matrix :");
        int arr[][]=new int[row][col];
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=input.nextInt();
            }
        }
        input.close();

        for(int j=0;j<col;j++){
            System.out.print(arr[0][j]+" ");
        }
        for (int i=1;i<row;i++){
            System.out.print(arr[i][col-1]+" ");
        }
        for(int j=col-2;j>=0;j--){
            System.out.print(arr[row-1][j]+" ");
        }
        for(int j=0;j<col-1;j++){
            System.out.print(arr[1][j]+" ");
        }
    }
}
