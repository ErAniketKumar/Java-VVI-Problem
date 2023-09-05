package BinarySearch;

import java.util.Scanner;

public class OrderAgnosticSearch {
    public static int searchInDessending(int arr[],int target)
    {
        int size=arr.length;
        int s=0,e=size-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
    public static int searchInAssending(int arr[],int target)
    {
        int size=arr.length;
        int s=0,e=size-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
    public static int searchTarget(int arr[],int target)
    {
        int size=arr.length;
        if(size==1)
        {
            if(arr[0]==target)
            {
                return 0;
            }
            else{
                return -1;
            }
        }
        else{
            if(arr[0]<arr[1])
            {
                return searchInAssending(arr,target);
            }
            else{
                return searchInDessending(arr,target);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:- ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("gives input in array:- ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int idx=searchTarget(arr,target);
        System.out.println(idx);
    }
}
