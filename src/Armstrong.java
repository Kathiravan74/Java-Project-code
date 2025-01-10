import java.util.Scanner;

public class Armstrong {
    public static void main(String[]agd){
        Scanner as=new Scanner(System.in);
        int a=as.nextInt();
        int count=0;
        int temp=a;
        int aa=a;
        while(a>0){
            count++;
            a=a/10;
        }
        int rem;int sum=0;
        while(aa>0){
            rem=aa%10;
            sum=sum+(int)Math.pow(rem,count);

            aa=aa/10;

        }if(sum==temp){
            System.out.println("Armstrong");

        }else{
            System.out.println("not a armstrong");
        }

    }
}
