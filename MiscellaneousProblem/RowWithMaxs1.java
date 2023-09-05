package MiscellaneousProblem;

import BinarySearch.CountTargetelementInSortedarray;

import javax.sound.midi.Synthesizer;
import java.util.Scanner;

public class RowWithMaxs1 {
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
        int[] brr=new int[row];
        for(int i=0;i<row;i++)
        {
            int c=0;
            for(int j=0;j<col;j++)
            {
                if(arr[i][j]==1)
                {
                    c++;
                }
            }
            brr[i]=c;
        }
        int max=brr[0];
        int idx=0;
        for(int i=0;i<row;i++)
        {
            if(max<brr[i])
            {
                max=brr[i];
                idx=i;
            }
        }
        System.out.println("maximum time one is : "+max+" and his row is: "+idx);

    }
}
