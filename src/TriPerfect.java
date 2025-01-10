import java.util.Scanner;

public class TriPerfect
    {
        public static void main (String[]afsf){
        Scanner sd=new Scanner (System.in);
        int num=sd.nextInt();
        int sum=0;
        int c=num;
        for(int i=1;i<=num;i++){
            if(num%i==0){


                sum=sum+i;

            }
}
            System.out.println(sum);
        if (sum==3*c){
            System.out.println("Tri Perfect");
        }else{
            System.out.println(" not a Tri perfect ");
        }
        }}
