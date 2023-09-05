package TwoD_ArrayQues;

import java.util.Scanner;

public class RangeSumQuarry2DMatrix {
    //this is not proper fully conplete so dont trust this program
    public static int RangeSumRectangle(int[][]arr,int r1, int c1, int r2, int c2)
    {
        int nsize=0;
        for(int i = r1;i<=r2;i++)
        {
            for(int j=c1;j<=c2;j++)
            {
                nsize++;
            }
        }
        int[] recarr=new int[nsize];
        for(int i=0;i<nsize;i++)
        {
            recarr[i]=0;
        }
        int k=0;
        for(int i = r1;i<=r2;i++)
        {
            for(int j=c1;j<=c2;j++)
            {
                recarr[k++]=arr[i][j];
            }

        }
        int rsum=0;
        for(int i=0;i<recarr.length;i++)
        {
//            System.out.print(recarr[i]+" ");
            rsum+=recarr[i];
        }
        return rsum;

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
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int ans =RangeSumRectangle(arr,r1,c1,r2,c2);
        System.out.println(ans);


    }
}
