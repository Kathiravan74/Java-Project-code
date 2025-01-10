import java.util.*;
import java.io.*;
class Automorphic{
    public static void main(String sa[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=n;
        int count=0;
        while(n>0){
            count++;
            n=n/10;

        }
        int b=t*t;
        int x= (int) Math.pow(10,count);
        if(t==(b%x)){
            System.out.println("It's automorphic");
        }
        else{
            System.out.println("Its not automorphic");
        }

    }
}