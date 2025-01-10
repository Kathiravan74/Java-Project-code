import java.util.*;
public class Replace_By_Vowel_By_Star {
    public static void main(String[] p){
        String k="i love india";

        StringBuilder b=new StringBuilder(k);
        for(int i=0;i<k.length();i++){
            char c=b.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                b.setCharAt(i,'*');
            }

        }
        k=new String(b);
        System.out.println(k);
       // String s=k.replaceAll("[aeiouAEIOU]","*');
              //  System.out.println(s);

    }
}
