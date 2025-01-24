import java.util.*;

public class Anagram {
    public static void main (String[]args){
        Scanner a=new Scanner(System.in);
        String s1=a.nextLine();
        String s2=a.nextLine();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String a1=new String(c1);
        String a2=new String(c2);
        System.out.println(a1.equals(a2));

    }
}
