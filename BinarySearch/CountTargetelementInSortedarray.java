package BinarySearch;

import javax.security.auth.login.AccountException;
import java.util.Scanner;

public class CountTargetelementInSortedarray {
    public static int lastccurrence(int arr[],int size,int target)
    {
        int s=0,e=size-1;
        int ans=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                s=mid+1;
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
    public static int firstccurrence(int arr[],int size,int target)
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
        int lidx=lastccurrence(arr,size,target);
        int fidx=firstccurrence(arr,size,target);
        int res=0;
        System.out.println("first occur idx= "+fidx+ " last idx = : "+lidx);
        if(fidx==-1 && lidx==-1)
            System.out.println(res);
        else
            res= ((lidx-fidx)+1);
        System.out.println(res);
    }
}
