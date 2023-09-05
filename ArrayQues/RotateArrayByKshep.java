package ArrayQues;

import java.util.Scanner;

public class RotateArrayByKshep {
    //left rotate array
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        k=k%size;
        while(k>0)
        {
            int temp=arr[0];
            for(int i=0;i<size-1;i++)
            {
                arr[i]=arr[i+1];
            }
            arr[size-1]=temp;
            k=k-1;
        }
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
