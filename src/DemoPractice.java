import java.util.Scanner;

public class DemoPractice {
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        int r=a.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=2*(r-i);j>=1;j--){
                System.out.print(" ");
            }int k=65;
            for(int j=0;j<i;j++){
                System.out.print((char) (k+j)+" ");
            }
            System.out.println();
        }
    }
}
