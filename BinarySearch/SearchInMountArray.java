package BinarySearch;

import java.util.Scanner;

public class SearchInMountArray {
    public static int searchInCrrArray(int qrr[],int target)
    {
        int size=qrr.length;
        int s=0,e=size-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(qrr[mid]==target)
            {
                return mid;
            }
            else if(qrr[mid]<target)
            {
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
    public static int searchInbrrArray(int prr[],int target)
    {
        int size=prr.length;
        int s=0,e=size-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(prr[mid]==target)
            {
                return mid;
            }
            else if(prr[mid]<target)
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
        int maxidx=-1;
        int maxele=arr[0];
        for(int i=0;i<size;i++)
        {
            if(arr[i]>maxele)
            {
                maxele=arr[i];
                maxidx=i;
            }
        }
        int[] brr=new int[maxidx+1];
        int[] crr=new int[size-(maxidx+1)];

        for(int i=0;i<maxidx+1;i++)
        {
            brr[i]=arr[i];
        }
        int k=0;
        for(int i=maxidx+1;i<size;i++)
        {
            crr[k++]=arr[i];
        }

        int idx1=searchInbrrArray(brr,target);
        int idx2=searchInCrrArray(crr,target);
        if(idx1!=-1)
        {
            return idx1;
        }
        else if(idx2!=-1)
        {
            return (idx2+=(maxidx+1));
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
        int target=sc.nextInt();
        int idx=searchTarget(arr,target);
        System.out.println(idx);
    }
}
