import java.util.Scanner;

public class Sum_Of_2D_Array {
public static void main(String[]ard){
        Scanner a=new Scanner(System.in);

        System.out.println("Enter the  row size of the array ");
        int b=a.nextInt();
        System.out.println("Enter the column  size of the array ");
        int c=a.nextInt();

        int arr[][]=new int[b][c];
        System.out.println("Enter the array elements");
        for(int i=0;i<b;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=a.nextInt();
            }
            System.out.println();

        }
        for(int i=0;i<b;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
        int sum=0;
        for(int i=0;i<b;i++){
            for(int j=0;j<c;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println();
        System.out.println("  Maximum element of 2D array is "+sum);

    }
}
