import java.util.*;
public class String_In_Build_Function {

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println(" 1.Length \n 2.Reverse \n 3.Copy \n 4.Split \n 5.Palindrome ");
        System.out.println("Enter your Choice : ");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:{
                System.out.println("Enter your String : ");
                scanner.nextLine();
                String str1=scanner.nextLine();
                System.out.println("The Length of the String is "+(str1.length()));
                break;
            }

            case 2:{
                System.out.println("Enter Your String : ");
                scanner.nextLine();

                String str =scanner.nextLine();
                StringBuilder sb=new StringBuilder(str);
                 sb.reverse();
                 String bb=sb.toString();
                System.out.println("The reverse String is : "+bb);

                 break;
            }

            case 3:{
                System.out.println("Enter Your String : ");
                scanner.nextLine();
                String str =scanner.nextLine();
                String g=new String(str);
                System.out.println("Copy of String is : "+g);
                break;

            }
            case 4:{
                System.out.println("Enter Your String : ");
                scanner.nextLine();
                String str =scanner.nextLine();

                break;
            }

        }

    }
}
