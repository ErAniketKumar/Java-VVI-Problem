package PatternProblem;

import java.util.Scanner;

public class RevHalfPiramid {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //row Directly dipend upon column so we required only one input by user
        int num=sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            for(int j=num;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
