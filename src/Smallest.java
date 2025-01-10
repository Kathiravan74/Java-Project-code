import java.util.Scanner;

class Smallest{
    public static void main(String[]jkkl){
        Scanner as =new Scanner(System.in);
        int num=as.nextInt();int rem;int count=0;
        while (num > 0 ) {
            rem=num%10;
            if(rem%2==0){
                count++;
            }else{
                count=0;
                break;

            }
            num=num/10;
         }if(count>0){
            System.out.println("even");
        }else{
            System.out.println("not even");
        }

    }
}