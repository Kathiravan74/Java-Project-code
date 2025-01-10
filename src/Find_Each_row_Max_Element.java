import java.util.Scanner;

class Find_Each_Row_Max_Element{

  public static void main(String[]args){
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
        int max;
        for(int i=0;i<b;i++){
            max=0;
            for(int j=0;j<c;j++){
                if( arr[i][j]>max){
                    max=arr[i][j];}


            }System.out.println( "  Maximum element of "+i+" row is "+max);

            }
        }


    }

