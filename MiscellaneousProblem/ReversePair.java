package MiscellaneousProblem;

import java.util.Scanner;

public class ReversePair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of an array :- ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Gives Input in Array :- ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int c=0;
       for(int i=0;i<size-1;i++)
       {
           for(int j=1;j<size;j++)
           {
               if(arr[i]>(2*arr[j]))
                   c++;
           }
       }


        System.out.println(c);
    }
}
