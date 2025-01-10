import java.util.Scanner;

public class SpecialNumber {
    public static void main (String[]afsf) {
        Scanner sd = new Scanner(System.in);
        int num = sd.nextInt();int a=num;
        int sum=0;
        int prod=1;int rem;
        while(num>0){
            rem=num%10;
            sum=sum+rem;
            prod=prod*rem;
            num=num/10;
        }int d=sum+prod;
        if(a==d){
            System.out.println("Special");
        }else{
            System.out.println("Not Special");
        }
    }
}
