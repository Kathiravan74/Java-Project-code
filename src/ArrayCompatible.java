import java.util.Scanner;

public class ArrayCompatible {
    public static void main (String[]jk){

        Scanner a=new Scanner(System.in);
        System.out.println("Enter element array1 size :");
        int b=a.nextInt();
        System.out.println("Enter element array2 size :");
        int c=a.nextInt();

        int arr1[]=new int[b];
        System.out.println("Enter the Array1 elemnts :");
        for(int i=0;i<b;i++){
            arr1[i]=a.nextInt();

        }for(int x:arr1){
            System.out.print(x+" ");}
        System.out.println();
        int arr2[]=new int[b];
        System.out.println("Enter the Array2 elemnts :");
        for(int i=0;i<b;i++){
            arr2[i]=a.nextInt();

        }for(int x:arr2){
            System.out.print(x+" ");}
        System.out.println();

        int sum=0;
        if(b==c){
            for(int i=0;i<b;i++){
                for(int j=i;i==j;j++){
                    if(arr1[i]>arr2[j]){
                        sum=1;
                    }else if(arr1[i]<arr2[j]){
                        sum=1;
                    }
                    else{
                        sum=0;
                        break;
                    }
                }
            }
        }else{
            System.out.println("Array is not Compatible");
        }if(sum==0){
            System.out.println("Array is not Compatible");
        }
        else{
            System.out.println("Array is  Compatible");
        }
}}
