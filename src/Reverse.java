import java.util.Scanner;

 class Reverse {
    public static void main(String[]jkl){
        Scanner aa=new Scanner(System.in);
        int num=aa.nextInt();
        int number=num;
        int rem;int sum=0;
        while(num>0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;

        }if(sum==number){
            System.out.println("Correct");
        }else{
            System.out.println("Not Correct");

        }

    }
}
