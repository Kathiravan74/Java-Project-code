import java.util.Arrays;
import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = 0;
        int arr[][] = new int[b][b];
        System.out.println("Enter the array elements");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = a.nextInt();
            }
            System.out.println();

        }
        int[][] arr1 = new int[b][b];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                if (i == j) {
                    arr1[i][j] = arr[i][j];
                } else {
                    int temp = arr[i][j];
                    arr1[j][i] = arr[i][j];
                    arr1[j][i] = temp;
                }

            }
        }
        System.out.println("The given matrix is :");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The Transpose Matrix is :");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                if (arr[i][j] == arr1[i][j]) {
                    c = 1;
                } else {
                    c = 0;
                    break;
                }
            }
            if (c == 0) {
                break;
            }
        }
        if (c == 0) {
            System.out.println("Not a Symmetric");
        } else {
            System.out.println("Symmetric");
        }
        boolean la=Arrays.deepEquals(arr,arr1);
        System.out.println(la);
    }
    }