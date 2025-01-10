import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        int r=a.nextInt();
        for(int i=0;i<r;i++){
            for(int j=r-i;j>1;j--){
                System.out.print(" ");
            }for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
