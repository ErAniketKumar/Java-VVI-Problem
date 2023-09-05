package BinarySearch;

import java.util.Scanner;

public class SearchInNearlySortedArray {
    public static int searchTarget(int arr[],int target)
    {
        int s=0,e=arr.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid-1]==target && mid-1>=s)
                return mid-1;
            else if(arr[mid+1]==target&& mid+1<=e)
                return mid+1;
            else if(arr[mid]<target)
            {
                s=mid+2;
            }
            else{
                e=mid-2;
            }
        }
        return -1;
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
        System.out.print("enter target ele: ");
        int target=sc.nextInt();
        int idx=searchTarget(arr,target);
        System.out.println(idx);
    }
}
