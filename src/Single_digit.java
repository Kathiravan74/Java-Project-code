import java.util.Scanner;

class Single_digit {
    public static void main (String[]jkl){
        Scanner f=new Scanner(System.in);
        int num=f.nextInt();
        if (num>=9){
            int s=(num%9==0)?9:num%9;
            System.out.println(s);
        }else{
            System.out.println(num);
        }
    }
}