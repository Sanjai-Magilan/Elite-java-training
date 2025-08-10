package test;
import java.util.Scanner;

class SpiDy {
    void spi(int[][] arr, int col, int row) {
        int top = 0, bottom = row - 1, right = col - 1, left = 0;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                System.out.print(arr[top][j] + " ");
            }
            for (int i = top + 1; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            if (top < bottom) {
                for (int j = right - 1; j >= left; j--) {
                    System.out.print(arr[bottom][j] + " ");
                }
            }
            if (left < right) {
                for (int i = bottom - 1; i > top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
            }
            top++;
            left++;
            right--;
            bottom--;
        }
    }
}

public class SpiralDynamic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your matrix size");
        System.out.print("Enter row size : ");
        int row = input.nextInt();
        System.out.print("Enter column size : ");
        int col = input.nextInt();
        System.out.println("Enter the matrix :");
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        input.close();

        System.out.println("Spiral Order:");
        SpiDy s = new SpiDy();
        s.spi(arr, col, row);
    }
}
