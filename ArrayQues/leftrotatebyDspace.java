package ArrayQues;

import java.util.Scanner;

public class leftrotatebyDspace {
    public static void reverse(int arr[],int s,int e)
    {
        while(s<e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;s++;e--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        k=k%size;
      reverse(arr,0,size-1);
        reverse(arr,0,k-1);
        reverse(arr,k,size-1);

        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
