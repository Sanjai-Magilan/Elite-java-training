package Arrays;
import java.util.Scanner;
public class twoD_array {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = input.nextInt();
        System.out.println("Enter number of colum : ");
        int col = input.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter the value for array down below");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]= input.nextInt();
            }
        }
        input.close();
        System.out.println("the 2D array values are");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
