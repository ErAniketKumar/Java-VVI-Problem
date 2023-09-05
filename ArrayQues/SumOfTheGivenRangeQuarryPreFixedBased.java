package ArrayQues;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfTheGivenRangeQuarryPreFixedBased {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of Array:- ");
            int size = sc.nextInt();
            int[] arr = new int[size+1];
            System.out.print("Gives input in array:- ");
            //for 1 based indexing so we have to input in array from 1
            for (int i = 1; i <=size; i++) {
                arr[i] = sc.nextInt();
            }
            //prefixsum code
        int [] pref=new int[arr.length];
//            pref[1]=arr[1];
            for(int i = 1;i<arr.length;i++)
            {
                pref[i]=+pref[i-1]+arr[i];
            }
//        System.out.println(Arrays.toString(pref));
        System.out.print("enter the number of queries:- ");
        int queries = sc.nextInt();
        while (queries-- > 0) {
            System.out.print("enter the range :- ");
            int left = sc.nextInt();
            int right = sc.nextInt();
            int sum=pref[right]-pref[left-1];
            System.out.println("the sum in given range is : "+sum);
        }
    }
}
