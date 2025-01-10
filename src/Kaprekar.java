import java.util.Scanner;

public class Kaprekar {
    public static void main (String[]hgj){
        Scanner as=new Scanner(System.in);
        int num=as.nextInt();
        int temp=num;
        int c=num*num;
        int count=0;
        while (num > 0) {
           count=count+1;
           num=num/10;
         }
        int d=c%((int)Math.pow(10,count));
        int e=c/((int)Math.pow(10,count));
        int f=d+e;
        if(temp==f){
            System.out.println("Kaprekar");
        }else{
            System.out.println("Kaprekar");
        }

    }
}//
