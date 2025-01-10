import java.util.Scanner;

public class Each_Word_Reverse {
    public static void main(String[]args){
        Scanner ae=new Scanner(System.in);
        String s=ae.nextLine();
        String[] d=s.trim().split("\\s+");

        StringBuilder str=new StringBuilder("");
            for(String x:d){
                StringBuilder obj=new StringBuilder(x);
                obj.reverse();
                str.append(obj+" ");
            }String string=new String(str);
        System.out.println(string);
        }}







