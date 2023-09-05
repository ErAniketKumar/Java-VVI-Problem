package BinarySearch;

import java.util.Scanner;

public class MinimumDifferenceInSOrtedArray {
    public static int MinDifferenceElement(int arr[],int target)
    {
        int s=0,e=arr.length-1;
        int ans=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
                return (arr[mid]-target);
            else if(arr[mid]<target)
            {
                ans=(target-arr[mid]);
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
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
        int ans=MinDifferenceElement(arr,target);
        System.out.println(ans);
    }
}
