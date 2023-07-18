package PatternProblem;

import java.util.Scanner;

public class FullPiramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //combination of tho half piramid -> Full Piramid
        int num=sc.nextInt();


        //for 1st  half piramid
        for(int i=1;i<=num;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            //for 2nd half piramid
        for(int i=1;i<=num-1;i++) {
            for(int j=num-1;j>=i;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
