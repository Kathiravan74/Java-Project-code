import java.sql.SQLOutput;
import java.util.Scanner;

public class Traffic {
    public static void main(String []bh){
        Scanner as=new Scanner(System.in);
        float currentspeed=as.nextFloat();
        float lightdistance=as.nextFloat();
        float redturns=as.nextFloat();
        float time =(float) lightdistance/currentspeed;
        float value= (float)(time*3600.0);
        if ( redturns>value){
            System.out.println("chased");
        }else{
            System.out.println("not chased");
        }



    }
}
