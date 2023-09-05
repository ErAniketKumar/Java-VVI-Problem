package BinarySearch;

import java.util.Scanner;

public class NumberOfTimeRotate {
    public static int CountRotate(int[]arr,int size)
    {
        int s=0,e=size-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;

            if(arr[mid+1]>arr[mid] && arr[mid]<arr[mid-1])
             {
               return size-mid;
            }
            else if(arr[mid]<arr[mid+1]&& arr[mid]>arr[mid-1])
            {
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter size of an array :- ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.print("Gives Input in Array :- ");
            for(int i=0;i<size;i++) {
                arr[i]=sc.nextInt();
            }
            int ans=CountRotate(arr,size);
        System.out.println(ans);

    }
}
