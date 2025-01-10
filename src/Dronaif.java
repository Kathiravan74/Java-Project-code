import java.sql.SQLOutput;
import java.util.Scanner;

class Dronaif{
    public static void main(String[]jkkl){
        Scanner as =new Scanner(System.in);
        int target=as.nextInt();
        int count=0;
        int sum=0;
        int input;
        while(sum<target){
            input =as .nextInt();
            sum+=input;
            count++;

        }
        System.out.println(count);
    }
}