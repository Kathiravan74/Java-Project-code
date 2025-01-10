import java.util.Scanner;

public class Friendly {
    public static void main(String[]ghu){
        Scanner  as=new Scanner(System.in);
        int num1=as.nextInt();
        int num2=as.nextInt();
        int a=num1;
        int b=num2;
        int sum1=0;
        int sum2=0;
        for(int i=1;i<num1;i++){
            if(num1%i==0){

                sum1=sum1+i;
            }}for(int j=1;j<num2;j++){
                if(num2%j==0){

                    sum2=sum2+j;
                }}if(a%sum1==b%sum2){
                    System.out.println("Friendly");
                }else{
                     System.out.println("not Friendly");
                }
    }
}
