package MiscellaneousProblem;

import java.util.Scanner;

public class SetMatrixZeroes {
    public static void setzero(int[][] arr, int r, int c,int[][]brr) {
        int row = arr.length;
        int col = arr[0].length;
//        int[][] brr=new int[row][col];

//        System.out.println("isx "+r+" "+c);  //zero available on this index
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               if(i==r|| j==c)
               {
                   brr[i][j]=0;
               }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No Of Rows:- ");
        int row = sc.nextInt();
        System.out.print("Enter No Of Column:- ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Gives Input " + row * col + " Element: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //copy array with all element
        int[][] brr=new int[row][col];
        for(int i = 0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                brr[i][j]=arr[i][j];
            }
        }

//check zero present row and column
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0) {
                    setzero(arr, i, j,brr);
                }
            }
        }

        //after operation copy value in oragnal array
        for(int i = 0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=brr[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
