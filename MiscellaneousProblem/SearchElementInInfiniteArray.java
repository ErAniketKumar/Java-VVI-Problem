package MiscellaneousProblem;

import java.util.Scanner;

public class SearchElementInInfiniteArray {
    public static int findelementindex(int arr[],int size,int target)
    {
        int s=0,e=1;
        while(arr[e]<target)
        {
            s=e;
            e=2*e;
        }
        while(s<=e) {
            int mid = s + (e - s) / 2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
            {
                s=mid+1;
            }
            else{
                e=mid-1;
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
        System.out.print("enter target: ");
        int target=sc.nextInt();
        int idx=findelementindex(arr,size,target);
        System.out.println(idx);
    }
}
