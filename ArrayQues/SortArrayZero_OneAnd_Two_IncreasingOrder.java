package ArrayQues;

import java.util.Scanner;

public class SortArrayZero_OneAnd_Two_IncreasingOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array:- ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Gives input in array:- ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int zeroes=0,twoes=0,ones=0;
        for(int i=0;i<size;i++) {
            if(arr[i]==0) zeroes++;
            else if(arr[i]==1) ones++;
            else twoes++;
        }
        for(int i=0;i<zeroes;i++) {
            arr[i]=0;
        }
        for(int i=zeroes;i<zeroes+ones;i++) {
            arr[i]=1;
        }
        for(int i=zeroes+ones;i<size;i++) {
            arr[i]=2;
        }
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
