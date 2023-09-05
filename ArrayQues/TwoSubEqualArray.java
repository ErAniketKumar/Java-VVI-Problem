package ArrayQues;

import java.util.Scanner;

public class TwoSubEqualArray {
    static int findArraySum(int[] arr) {
        int totalSum=0;
        for(int i=0;i<arr.length;i++) {
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean qualSumPartition (int[] arr) {
        int totalSum=findArraySum(arr);
        int prefSum=0;
        for(int i=0;i< arr.length;i++){
            prefSum+=arr[i];
              int suffixSum=totalSum-prefSum;
              if(prefSum==suffixSum){
                  return true;
              }
        }
        return false;
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
        System.out.println("posible Equal partition: "+ qualSumPartition(arr));
    }
}
