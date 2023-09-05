package PatternProblem;

import java.util.Scanner;

public class HackerRankPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int len=2*n-1;
        int[][] arr=new int[len][len];
        int start=0,end=len-1;
        while(n!=0) {
            for (int i = start; i <=end; i++) {
                for (int j = start; j <=end; j++) {
                  if(i==start||i==end||j==start||j==end)
                  {
                      arr[i][j]=n;
                  }
                }
            }
            n--;
            start++;end--;
        }

        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
