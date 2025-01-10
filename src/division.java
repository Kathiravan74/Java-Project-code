import java.util.Scanner;

public class division{
    public static void main(String[]jkk){
        Scanner as=new Scanner(System.in);
        int num=as.nextInt();
        int denom=as.nextInt();
        int count=0;
        if(num>denom){
            while(num!=0){
                count=count+1;
                num=num-denom;
            }
            System.out.println(count);
        }else{
            System.out.println("0");
        }
    }
}
