import java.util.Scanner;

public class Mango {
    public static void main (String[]agds ){
        Scanner r=new Scanner(System.in);
        int row=r.nextInt();
        int column=r.nextInt();
        int tree=r.nextInt();

        if(tree>=(row*(column-1)+1)&&(row*column)>=tree){
            System.out.println("mango tree");
        }else if(tree%row==0){
            System.out.println("mango tree");
        }else if(tree<=row){
            System.out.println("mango tree");
        }else{
            System.out.println(" not mango tree");
        }
    }
}
