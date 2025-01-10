import java.util.Scanner;

public class practice {
    public static void main (String[]args){
        Scanner a=new Scanner(System.in);
        String str=a.nextLine().trim();
        System.out.println(str.startsWith("java"));
        System.out.println(str.endsWith("Pro"));

    }
}
