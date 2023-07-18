package PatternProblem;

import java.util.Scanner;

public class FullRevPiramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        //Full mirror piramid


        //for 1st half mirror piramid
        for(int i=1;i<=num;i++) {
            for(int j=num-1;j>=i;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
       // for 2nd half mirror piramid
        for(int i=1;i<=num;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for(int k=num-1;k>=i;k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
