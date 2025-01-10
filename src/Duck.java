import java.util.Scanner;

public class Duck {

    public static void main(String[] afsf) {
        Scanner sd = new Scanner(System.in);
        int num = sd.nextInt();

        int rem;
        int c = 0;

        while (num > 0) {
            rem = num % 10;
            if (rem == 0) {
                System.out.println("Duck number");
                break;


            }else{c=c+1;}num /= 10;}

        if(c!=0){
            System.out.println("Not a Duck number");
        }

    }
}
