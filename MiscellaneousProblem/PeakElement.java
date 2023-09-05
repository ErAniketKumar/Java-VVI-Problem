package MiscellaneousProblem;

import java.util.Scanner;

public class PeakElement {
   public static int isSorted(int size, int[]arr){
       int ans=1;
       for(int i=1;i<size;i++)
       {
           if(arr[i]>=arr[i-1]);
           else ans=0;
       }
       return ans;
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
        if (isSorted(size, arr) == 1)
            System.out.println(size-1);
        else {
            int ans = 0;
            for (int i = 1; i < size - 1; i++) {
                if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                    ans = i;
                }
            }
            System.out.println(ans);
        }
    }
}
