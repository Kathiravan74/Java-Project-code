import java.util.Scanner;
import java.util.Arrays;


public class HighestEvenElementTwoDArray {

    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the row size of Array:");
        int b1=a.nextInt();
        System.out.println("Enter the column size of Array:");
        int b2=a.nextInt();int max1=0;int max2=0;
        int[][] arr=new int[b1][b2];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<b1;i++){
            for(int j=0;j<b2;j++){
                arr[i][j]=a.nextInt();
                if(arr[i][j]%2==0){
                   if(max1<arr[i][j]){
                       int temp=max1;
                        max1=arr[i][j];
                        max2=temp;



                    }
                }

            }}

        System.out.println("The highest even numbers in 2D Array is : "+ max2);
    }
}

