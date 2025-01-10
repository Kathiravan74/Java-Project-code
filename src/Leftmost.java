import java.util.Scanner;

public class Leftmost {
    public static void main(String[]jkkl){
        Scanner as =new Scanner(System.in);
        int num=as.nextInt();int temp=num;int count=0;
        while (num > 0) {
            count++;
            num=num/10;
        }/*while (n>9){
        n=n/10;}
        System.out.println(n);}*/
        int a=(temp/((int)Math.pow(10,count-1)));
        System.out.println(a);

}}
