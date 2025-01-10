import java.util.Scanner;

public class Hollow_Triangle
{

    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        int r=a.nextInt();
        for(int i=1;i<=r;i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                if(j==i*2-1||j==1||i==r){

              System.out.print("* ");}
                else{
                    System.out.print("  ");
                }
            }


           System.out.println();
        }
}}
