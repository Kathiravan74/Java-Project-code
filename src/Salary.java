import java.util.Scanner;

public class Salary {public static void main (String[]jn){
    Scanner ad=new Scanner(System.in);
    int sunday=ad.nextInt();
    int monday=ad.nextInt();
    int tuesday=ad.nextInt();
    int wednesday=ad.nextInt();
    int thursday=ad.nextInt();
    int friday=ad.nextInt();
    int saturday=ad.nextInt();
    int s=sunday+monday+tuesday+wednesday+thursday+friday+saturday;
    int amount=0;
    if (s<41){
        if(sunday<=8&& sunday>=0){
            int a=sunday*100;
             amount=amount+a+a*50/100;
        }else {
            int c=sunday*100;
            int v=c*50/100;
             amount=amount+sunday%8*15+800+c+v;

        }  if (monday<=8&&monday>=0) {
             amount=amount+monday*100;

        }else {
            amount=amount+monday%8*15+monday*100;

        }if (tuesday<=8&&tuesday>=0){
            amount=amount+tuesday*100;
        }else{
            amount=amount+tuesday%8*15+tuesday*100;

        } if(wednesday<=8&&wednesday>=0){
            amount=amount+wednesday*100;
        }else {
            amount=amount+wednesday%8*15+wednesday*100;
        }if (thursday<=8&&thursday>=0){
            amount=amount+thursday*100;

        }else {
            amount=amount+thursday%8*15+thursday*100;

        } if(friday<=8&&friday>=0){
            amount=amount+friday*100;
        }else {
            amount=amount+friday%8*15+friday*100;
        } if(saturday<=8&&saturday>=0){
            int b=saturday*100;
            amount=amount+b+b*50/100;
        }else{
            int cc=saturday*100;
            int vv=cc*50/100;
            amount=amount+sunday%8*15+cc+vv;

        }
        System.out.println("your salary is "+amount);
    }else{
        amount=s*100;
        System.out.println("your salary is "+amount);
    }
}
}
