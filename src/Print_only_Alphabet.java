import java.util.Scanner;

public class Print_only_Alphabet {
    public static void main(String[]snj){
        Scanner a=new Scanner(System.in);
        String s=a.nextLine();
        String str=s.replaceAll("[\\d]"," ");
        System.out.println(str);
    }
}
