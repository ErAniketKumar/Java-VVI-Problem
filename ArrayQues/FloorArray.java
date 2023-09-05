package ArrayQues;

import java.awt.geom.GeneralPath;
import java.util.Scanner;

public class FloorArray {
    public static int find(int arr[],int n, int x)
    {
        int s=0,e=n-1;
        int ans=-1;
        int res=0;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]<x)
            {
                res=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }

        }

        return res;
    }

    static int findFloor(int arr[], int n, int x)
    {

        if(x<arr[0])
            return -1;
        else if(x>arr[n-1])
            return n-1;
        else{

            int idx=find(arr,n,x);

            return idx;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of an array :- ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Gives Input in Array :- ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
            int idx = findFloor(arr, size, target);
            System.out.println(idx);

    }
}
