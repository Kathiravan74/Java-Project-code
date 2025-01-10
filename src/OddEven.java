
import java.util.Scanner;

class OddEven {
    public static void main(String[]jkkl){
        Scanner as =new Scanner(System.in);
        int num=as.nextInt();int rem;
        while (num > 0 ) {
            rem=num%10;
            if(rem%2==0){
                System.out.println(rem+" Even ");
            }else{
                System.out.println(rem+" Odd ");


            }
            num=num/10;
        }

    }
}