package TwoD_ArrayQues;

import java.util.Scanner;

public class SearchIn2dMatrix {
    public static boolean SearchTarget(int matrix[][],int target)
    {
        int row=matrix.length;
        int col= matrix[0].length;
        int s=0,e=(row*col)-1;
//        int mid=s+(e-s)/2;
        while(s<=e)
        {
           int mid=s+(e-s)/2;
            int element=matrix[mid/col][mid%col];
            if(element==target)
            {
                return true;
            } else if (element<target) {
                s=mid+1;
            }
            else{
                e=mid-1;
            }

        }
        return false;

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
        System.out.print("enter target ele: ");
        int target=sc.nextInt();
        System.out.println(SearchTarget(arr,target));

    }
}
