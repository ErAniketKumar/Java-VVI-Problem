package ArrayQues;

import java.util.Arrays;
import java.util.Scanner;

public class PreFix_SumOfEach_Element {
    static void PreFix_Sum_No_ExtraArray(int[] arr) {
        //No Extra Array Use
        int size=arr.length;
        for(int i=1;i<size;i++) {
            arr[i]+=arr[i-1];
        }
    }

//    static int[] Prefix_SumArray(int[] arr)  {
//        int size=arr.length;
//
//        /*int[] pref=new int[size];
//        using double loop
//        for(int i=0;i<size;i++) {
//            for(int j=0;j<=i;j++) {
//                brr[i]+=arr[j];
//            }
//        }
//    return brr;
//         */
//
//      /*   using single loop
//        int[] pref=new int[size];
//        pref[0]=arr[0];
//        for(int i=1;i<size;i++) {
//            pref[i]=pref[i-1]+arr[i];
//        }
//        return pref;
//       */
//
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array:- ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Gives input "+size+" element in array:- ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        /*int [] res=Prefix_SumArray(arr); //function call pass with ref using extra array recieve in other array
        prefixsum array print
        for(int i=0;i<size;i++) {
            System.out.print(res[i]+" ");
        } */
        //not extra array use;
        PreFix_Sum_No_ExtraArray(arr);
//        prefixsum array print
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
