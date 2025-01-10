import java.util.Scanner;

class Harshad{
    public static void main(String[]bbk){
        Scanner as =new Scanner(System.in);
        int num=as.nextInt();
        int sum=0;int g=num;int rem;
        while(num>0) {
            rem = num % 10;
            sum+=rem;
            num = num / 10;
        }if(g%sum==0){
            System.out.println("Harshad Number");
        }else{
            System.out.println("Not Harshad Number");
        }
    }
}