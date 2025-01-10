import java.util.Scanner;

public class Trendy {
    public static void main (String[]kjl){
        Scanner as=new Scanner(System.in);
        int num=as.nextInt();
        if (num>99&&num<=999){
            if(((num%100)/10)%3==0){
                System.out.println("trendy");
            }else{
                System.out.println("Not Trendy");
            }

        }else{
            System.out.println("Not Trendy");
        }

    }
}
