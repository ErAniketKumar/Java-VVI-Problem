package MiscellaneousProblem;

import java.util.Scanner;

public class MinNoRequiredForEqualTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of an array :- ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Gives Input in Array :- ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int ans=0;
        int needsum=sc.nextInt();
        int maxval=sc.nextInt(); //maxval => max limit of each array element
        int ogsum=0;
        for(int i=0;i<size;i++)
        {
            ogsum+=arr[i]; //og=> orignalsum of array
        }
        int dfsum=needsum-ogsum; //dfsum=> diffrence sum
        if(dfsum<0)
        {
             int pdfsum=-dfsum; //pdfsum => positive diffrence sum
        if(pdfsum%maxval!=0)
        {
            int r=(pdfsum-(pdfsum%maxval))/maxval+1;
            ans=r;
        }
        else{
            ans=pdfsum/maxval;
        }
       }
        else{
            if(dfsum%maxval!=0)
            {
                int r=(dfsum-(dfsum%maxval))/maxval+1;
                ans=r;
            }
            else{
                ans=dfsum/maxval;
            }

        }

        System.out.println("elem "+ans); // minimum number of required element equal for need sum
    }
}
