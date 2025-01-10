import java.util.Scanner;

public class Demo {
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        int r=a.nextInt();
        for(int i=r;i>=1;i--){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }for(int j=1;j<=2*i-1;j++){
            System.out.print("*");}
            System.out.println();
        }for(int i=1;i<=r;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }for(int j=1;j<=2*i-1;j++){
                System.out.print("*");}

            System.out.println();
        }
    }
}
