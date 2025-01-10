import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[]j){
        Scanner as=new Scanner(System.in);
        int a=as.nextInt();
        int b=as.nextInt();
        for(int i=1;i<=b;i++){
            System.out.println(a+"*"+i+"="+(a*i));
        }
    }
}
