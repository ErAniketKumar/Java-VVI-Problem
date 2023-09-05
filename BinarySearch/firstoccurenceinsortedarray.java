package BinarySearch;

import java.util.Scanner;

public class firstoccurenceinsortedarray {
    public static int foccurrence(int arr[],int size,int target)
    {
        int s=0,e=size-1;
        int ans=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                e=mid-1;
            }
            else if(arr[mid]>target)
            {
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int idx=foccurrence(arr,size,target);
        System.out.println(idx);
    }
}
