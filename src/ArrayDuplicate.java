import java.util.Scanner;

public class ArrayDuplicate {
    public static void main(String[]ard){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int b=a.nextInt();
        int arr[]=new int[b];int sum=0;
        System.out.println("Enter the array elements");
        for(int i=0;i<b;i++){
            arr[i]=a.nextInt();

        }

        System.out.println("Your array is ");
        for(int r:arr){
            System.out.print(r+" ");
        }
        System.out.println();
        boolean flag=false;
       for(int i=0;i<b;i++){
            for(int j=i+1;j<b;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }

                if(flag){
                    System.out.println(arr[i] + " is duplicate");
                    break;
                }
            }
        }
    }
}
