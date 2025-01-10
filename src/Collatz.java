import java.util.*;

public class Collatz {
    public static void main(String[] b){
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt() ;
        System.out.print(n+" ");
        int c=0;
        while(n!=1){
            if(n%2 ==0){
                n=n/2;
                System.out.print("->"+" "+n);
                c=c+1;
            }
            else{
                n=3*n+1;
                System.out.print("->"+" "+n);
                c=c+1;

            }
        }
        System.out.println(" ");
        System.out.println("no of rounds taken to become one"+" "+c);
    }

}
