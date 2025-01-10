import java.util.Scanner;

public class TopperNumber {
    public static void main (String[] asgs) {
        Scanner sd = new Scanner(System.in);
        int num = sd.nextInt();
        int a = num;int rem;int c=0;int d=0;
        while(num>0){
            rem=num%10;
            if(rem%2==0){
                c+=rem;

            }else{
                d+=rem;
            }num=num/10;
        }if(c==d){
            System.out.println("yes");
    }else{
            System.out.println("no");
        }

    }
}
