package TwoD_ArrayQues;

import ArrayQues.QuarryNumPresentOrNot;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class BasicInOutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int rc=sc.nextInt();
        int mm=sc.nextInt();
        int[][][][] arr=new int[row][col][rc][mm];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                for(int k=0;k<rc;k++){
                    for(int l=0;l<mm;l++){
                        arr[i][j][k][l]=sc.nextInt();
                    }
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                for(int k=0;k<rc;k++){
                    for(int l=0;l<mm;l++){
                        System.out.print(arr[i][j][k][l]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
