import java.util.Scanner;

public class Abudant {
    public static void main (String[]afsf){
        Scanner sd=new Scanner (System.in);
        int num=sd.nextInt();
        int sum=0;
        int c=num;
        for(int i=1;i<num;i++){
            if(num%i==0){

                sum=sum+i;
            }


        }if(c<sum){
            System.out.println("Abundant");
        }else{
            System.out.println("not Abundant");
        }
    }
}
