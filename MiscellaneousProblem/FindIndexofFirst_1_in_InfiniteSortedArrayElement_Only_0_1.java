package MiscellaneousProblem;

import java.util.Scanner;

public class FindIndexofFirst_1_in_InfiniteSortedArrayElement_Only_0_1 {
    //yah array me zero aur fir baad me infinite 1.... pahla 1 (one) ka index nikalna hai;

    public static int findFirstIndexOf1(int arr[],int s,int e)
    {
        int idx=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==1)
            {
             idx=mid;
             e=mid-1;
            }
            else if(arr[mid]==0)
            {
                s=mid+1;
            }
            else{
                s=mid-1;
            }
        }
        return idx;
    }
    public static int getidxoffirst1(int arr[])
    {
        int s=0,e=1;
        while(1>arr[e])
        {
            s=e;
            e=2*e;
        }
        return findFirstIndexOf1(arr,s,e);
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
        int idx=getidxoffirst1(arr);
        System.out.println(idx);
    }
}
