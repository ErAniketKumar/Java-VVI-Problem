package ArrayQues;

import java.util.Scanner;

public class ArrayReturnAfterKopration {


    public static int maxval(int arr[],int n)
    {
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void repeatmaxminus(int arr[],int k) {
        int size=arr.length;
        while(k-->0) {
            int max = maxval(arr,size);
            for (int i = 0; i <size; i++) {
                arr[i] = (max - arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array:- ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Gives input "+size+" element in array:- ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int toperation=sc.nextInt();

        repeatmaxminus(arr,toperation);
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
