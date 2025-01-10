import java.util.Scanner;

public class Transpose_Of_2D_Array {

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
             if(b==c){System.out.println("Transpose of matrix");
            int n[][]=new int[b][c];
            for(int i=0;i<b;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    n[i][j]=arr[i][j];

                }else{

                    int temp=arr[i][j];
                    n[i][j]=arr[j][i];
                    n[j][i]=temp;
 }

            }
        }for(int i=0;i<b;i++){
            for(int j=0;j<c;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }}else{
                 System.out.println("There is no possible for transpose matrix because rows and columns are not egual");
             }

}}
