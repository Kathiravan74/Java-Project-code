import java.util.Scanner;

public class ArrayElementDelete {
    public static void main (String[]jk){

        Scanner a=new Scanner(System.in);
        System.out.println("Enter element array size :");
        int b=a.nextInt();

        int arr[]=new int[b];int sum=0;
        System.out.println("Enter the Array elemnts :");
        for(int i=0;i<b;i++){
            arr[i]=a.nextInt();

        }for(int x:arr){
        System.out.print(x+" ");}
        System.out.println();
        System.out.println("Enter which position want to delete :");
        int deletepos=a.nextInt();
        if(deletepos<b){
        for(int i=0;i<b;i++){
          if(  arr[i]==arr[deletepos])
              continue;
          else
              System.out.print(arr[i]+" ");
        }}else {
            System.out.println("Invlaid Position");
        }
    }
}
