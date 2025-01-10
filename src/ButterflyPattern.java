import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        int r=a.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }for(int j=i*2;j<=2*r;j++){
                System.out.print("  ");
            }for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=r-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }for(int j=i*2;j<=2*r;j++){
                System.out.print("  ");
            }for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
