import java.util.Scanner;
import java.lang.String;
import java.util.*;


public class Count_characters {
  public static void main(String[]args){
            Scanner ae=new Scanner(System.in);
            String s=ae.nextLine().trim();
            char target=ae.next().charAt(0);
            char[] ch=s.toCharArray();int count=0;
            for(int i=0;i<ch.length;i++){
                if(ch[i]==target){
                    count++;
                }

        } System.out.println(count);
    }
}
