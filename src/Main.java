import java.util.*;
class Main{
    public static void main (String[]bhj){
        Scanner as=new Scanner (System.in);
        int birthYear= as.nextInt();
        int currentYear= as.nextInt();
        int age1=(100-birthYear)+currentYear;
        int age2=currentYear-birthYear;
        if(birthYear>currentYear){
            System.out.println(age1);
        }else{
            System.out.println(age2);
        }
    }
}
