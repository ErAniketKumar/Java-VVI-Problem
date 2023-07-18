package ArrayQues;

import java.util.Scanner;

public class Min_Max {
    static int[] FindMinMax(int[]arr) {
        int min=arr[0],max=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];

            }
            if(arr[i]<min) {
                min=arr[i];
            }
        }
        int[] MinMax={min,max};
        return MinMax;           //return array
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++) {
            arr[i]=sc.nextInt();
        }
        int[] ans=FindMinMax(arr); //function calling (pass by ref)


        for(int i=0;i<2;i++)
        {
            System.out.print(ans[i]+" ");
        }

    }
}
