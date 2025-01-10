import java.util.Scanner;

public class LetterPattern {
    public static void main(String[]hj) {
        Scanner a=new Scanner(System.in);
        int r=a.nextInt();
        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <= r; j++) {
                if (i == j || i + j == r+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
        System.out.println();}

    }}