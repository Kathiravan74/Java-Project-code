import java.util.Scanner;

public class Count_Digits {
    public static void main(String[]jkkl){
        Scanner as =new Scanner(System.in);
        int num=as.nextInt();int rem;int count=0;
        while(num>0){
            count++;
            num=num/10;
          }
        System.out.println(count);

}}
