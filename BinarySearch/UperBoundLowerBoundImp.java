package BinarySearch;

import java.awt.im.InputMethodRequests;
import java.util.Scanner;

public class UperBoundLowerBoundImp {
    public static int upperboud(int arr[],int x,int size)
    {
        int s=0,e=size-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]<x)
            {
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        if(s<size && arr[s]<=x)
        {
            s++;
        }
        return s;
    }
    public static int lowerbound(int arr[],int x,int size)
    {
        int s=0,e=size-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]>=x)
            {
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        if(s<size && arr[s]<x)
        {
            s++;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int lb=lowerbound(arr,x,size);
        System.out.println("lowerbound index is "+lb);
        int ub=upperboud(arr,x,size);
        System.out.println("upper bound index is "+ub);

    }
}
