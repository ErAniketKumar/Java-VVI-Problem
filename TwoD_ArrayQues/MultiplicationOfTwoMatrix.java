package TwoD_ArrayQues;

import java.util.ConcurrentModificationException;
import java.util.Scanner;

public class MultiplicationOfTwoMatrix {
    static int[][] MultiplyMatrix(int[][] arr,int row,int col,int[][] arr2,int row2,int col2) {
        //multiplication operation

        int[][] crr = new int[row][col2];
        if (col == row2) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < row2; k++) {
                        crr[i][j] += arr[i][k] * arr2[k][j];
                    }
                }
            }
        }
        return crr;
    }
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
             //second matrix input
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
        //function call for multiplication of matrix
       int[][] res= MultiplyMatrix(arr,row,col,arr2,row2,col2);
        //print result matrix
           for(int i=0;i<row;i++){
               for(int j=0;j<col2;j++){
                   System.out.print(res[i][j]+" ");
               }
               System.out.println();
           }

        }

    }

