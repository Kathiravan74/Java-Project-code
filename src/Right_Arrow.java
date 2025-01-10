import java.util.Scanner;

public class Right_Arrow {
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        int r=a.nextInt();
        for(int i=r;i>=1;i--) {
            for (int j = 1; j <=i;j++){

                System.out.print("* ");

            }
            System.out.println();
}
        for(int i=2;i<=r;i++) {
            for (int j = 1; j <=i;j++){

                System.out.print("* ");

            }
            System.out.println();

    }
}}
