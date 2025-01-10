import java.util.Scanner;

public class Z_Pattern {
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        int r=a.nextInt();
        for(int i=1;i<=r;i++){
            for (int j=1;j<=r;j++){
                if(i+j==r+1||i==1||i==r){
                System.out.print(j+" ");}
                 else {
                    System.out.print("  ");
                }

                }System.out.println();
            }

        }
    }

