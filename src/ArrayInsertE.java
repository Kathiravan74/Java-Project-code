import java.util.Scanner;

public class ArrayInsertE {
    public static void main(String[]ard){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the array element size");
        int b=a.nextInt();
        int arr[]=new int[b];int sum=0;
        System.out.println("enter the array elements");
        for(int i=0;i<b;i++){
            arr[i]=a.nextInt();

        }
        System.out.println("Enter the position");
        int pos=a.nextInt();
        int s=a.nextInt();
        if(b>pos){
            for(int i=0;i<b;i++){
                if(arr[i]==arr[pos-1]){
                System.out.print(s+" ");
                    System.out.print(arr[i]+" ");}
                else{
                    System.out.print(arr[i]+" ");
                }

            }

        }else{
            System.out.println("Invalid position");
        }



}}
