package ArrayQues;

import java.util.Scanner;
public class MaxSubArraySUM_BYKadnesAlgo {
    static int MaxSubArrSum(int[] arr){
        int sum=0;
        int maxi=arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxi= Math.max(maxi,sum); ///maximum betbeen old maxi or sum;
            if(sum<0)  /// if sum is -ve the assign sum=0;
            {
                sum=0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of an array :- ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Gives Input in Array :- ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int res=MaxSubArrSum(arr); ///function call
        System.out.println("The maximum Sub array sum is: "+res);
    }
}
