package BinarySearch;

import java.util.Scanner;

public class PeakElement {
    public static int getPeak_Element(int arr[])
    {
        int ans=-1;
        int s=0,e=arr.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;

                if ((mid==0||arr[mid] >= arr[mid - 1]) && (mid==arr.length-1||arr[mid] >= arr[mid + 1])) {
                    return arr[mid];
                } else if (mid>0 && arr[mid-1] > arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
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
        int ans=getPeak_Element(arr);
        System.out.println(ans);
    }
}
