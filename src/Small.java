import java.util.Scanner;

public class Small {
    public static void main(String[]jkkl) {
        Scanner as = new Scanner(System.in);
        int num = as.nextInt();
        int rem;
        int min = 9;
        while(num>0){
            rem=num%10;
            min=Math.min(min,rem);
            num=num/10;

    }
        System.out.println(min);
}}
