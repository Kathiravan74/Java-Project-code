import java.util.Scanner;

public class Upper_Triangular_Matrix {
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

        }int upper[][]=new int[b][c];
        for(int i=0;i<b;i++){
            for(int j=0;j<c;j++){
                if(j>=i){
                    upper[i][j]=arr[i][j];}
                else{upper[i][j]=0;
                    }
            }
}
        System.out.println("The Upper Triangular Matrix is :");
        for(int i=0;i<b;i++){
            for(int j=0;j<c;j++){
                System.out.print(upper[i][j]+" ");
            }
            System.out.println();
        }
    }
}
