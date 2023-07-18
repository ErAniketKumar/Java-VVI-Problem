package PatternProblem;

import java.util.Scanner;

public class TriangleSeprateWithSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        //first way to print

        for(int i=1;i<=num;i++) {
            for(int j=num;j>=i;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print(" *");
            }
            System.out.println();

        }

        //secondway to print triangle pyramid
//        for(int i=1;i<=num;i++) {
//            for(int j=num;j>=1;j--) {
//               if(j>i)
//               {
//                   System.out.print(" ");
//               }
//               else {
//                   System.out.print(" *");
//               }
//            }
//            System.out.println();
//        }
    }
}
