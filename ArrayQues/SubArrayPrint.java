package ArrayQues;

import java.util.Arrays;
import java.util.Scanner;

public class SubArrayPrint {
    static void SubArr(int[] arr){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total No of SubArray is: "+ts);
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
        // In main function
//        int start=0,end=0;
//        for(int i=0;i<size;i++){
//            System.out.println(arr[i]+" ");
//            start=i;
//            for(int j=i+1;j<size;j++){
//                end=j;
//                for(int k=start;k<=end;k++){
//                    System.out.print(arr[k]+" ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

        // By function call
        SubArr(arr);
    }
}
