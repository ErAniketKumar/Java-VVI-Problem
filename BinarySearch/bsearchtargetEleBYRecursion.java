package BinarySearch;

import java.util.Scanner;

public class bsearchtargetEleBYRecursion {
    public static int bsearch(int arr[],int s,int e,int target)
    {
        int ans=-1;
        if(s>e)
            return ans;

            int mid=s+(e-s)/2;
            if(arr[mid]==target)
            {
                ans=mid;
            }
            else if(arr[mid]>target)
            {
               ans= bsearch(arr,s,mid-1,target);
            }
            else{
                ans=bsearch(arr,mid+1,e,target);
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
        int idx=bsearch(arr,0,size-1,target);
        System.out.println(idx);
    }
}
