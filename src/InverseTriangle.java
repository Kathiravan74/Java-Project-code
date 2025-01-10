import java.util.Scanner;

public class InverseTriangle {
    public static void main(String[]jkkl) {
        Scanner as = new Scanner(System.in);
        int num = as.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }for(int j=i*2;j<num*2;j++){
                System.out.print("  ");
            }for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=num-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }for(int j=i*2;j<num*2;j++){
                System.out.print("  ");
            }for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

}}
