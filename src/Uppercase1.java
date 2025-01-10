
import java.util.*;
public class Uppercase1 {
    public static void main(String[] p){
        Scanner s=new Scanner(System.in);
        String k=s.nextLine();
        String[] a=k.trim().split("\\s+");
        StringBuilder g= new StringBuilder("");
       for(String c:a){
           StringBuilder d=new StringBuilder(c);
           d.setCharAt(0,(char)((char) d.charAt(0)-32));
           g.append(d+" ");
       }
       k=new String(g);
       System.out.println(k);
    }
}
