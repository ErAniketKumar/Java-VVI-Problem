package BinarySearch;

import java.util.Scanner;

public class BsearchTargetele {
    public static int bsearch(int[] arr,int target)
    {
        int s=0,e=arr.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
                return mid;
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the soze of array");
        int size=sc.nextInt();
        System.out.println("enter target element");
        int target=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter input in array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int idx=bsearch(arr,target);
        System.out.println(idx);
    }
}
