package TwoD_ArrayQues;

import java.util.Scanner;

public class AdditionOFtwoMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No Of Rows:- ");
        int row=sc.nextInt();
        System.out.print("Enter No Of Column:- ");
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("Gives Input "+row*col+ " Element: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

     ///second array input
        System.out.println("Second array");
        System.out.print("Enter No Of Rows:- ");
        int row2=sc.nextInt();
        System.out.print("Enter No Of Column:- ");
        int col2=sc.nextInt();
        int[][] arr2=new int[row2][col2];
        System.out.println("Gives Input in "+row2*col2+ " Element: ");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        //addition perform
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
