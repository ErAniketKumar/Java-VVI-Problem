package ArrayQues;

import java.util.Scanner;

public class tappingrainwater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] brr=new int[size];
        int k=0;
        int lmax=arr[0];
        for(int i=0;i<size;i++)
        {
         if(arr[i]>lmax)
         {
             lmax=arr[i];
         }
         brr[k++]=lmax;
        }
        int[] crr =new int[size];
        int l=size-1;
       int rmax=arr[size-1];
        for(int i=size-1;i>=0;i--)
        {
            if(arr[i]>rmax)
            {
                rmax=arr[i];
            }
            crr[l--]=rmax;
        }
        System.out.println("orignal array");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("lmax array");
        for(int i=0;i<size;i++)
        {
            System.out.print(brr[i]+" ");
        }
        System.out.println();
        System.out.println("rmaxarray");
        for(int i=0;i<size;i++)
        {
            System.out.print(crr[i]+" ");
        }
          int[] drr=new int[size];
        int m=0;
        for(int i=0;i<size;i++)
        {
            if(brr[i]<crr[i])
            {
                drr[m++]=brr[i];
            }
            else
                drr[m++]=crr[i];
        }
        System.out.println();
        for(int i=0;i<size;i++)
        {
            System.out.print(drr[i]+" ");
        }
        int[] err=new int[size];
        int n=0;
        for(int i=0;i<size;i++)
        {
            err[n++]=drr[i]-arr[i];
        }
        System.out.println();
        for(int i=0;i<size;i++)
        {
            System.out.print(err[i]+" ");
        }
        System.out.println();
        int sum=0;
        for(int i=0;i<size;i++)
        {
           sum+=err[i];
        }
        System.out.println(sum);
    }
}
