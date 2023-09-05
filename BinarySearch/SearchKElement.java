package BinarySearch;

import java.util.*;
public class SearchKElement{
    public static int bsearch(int[] arr, int k){
       int left=0,right=arr.length-1;
       while(left<=right)
       {
        int mid=left+(right-left)/2;
        if(arr[mid]==k){
            return mid;
        }
        if(arr[mid]<k)
        {
            left=mid+1;
        }
        else{
            right=mid-1;
        }
       }
       return -1;
    }
public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the size of array:- ");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.print("gives input in array:- ");
    for(int i=0;i<size;i++)
    {
        arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
   int idx= bsearch(arr,k);
   System.out.println(idx);
}
}
