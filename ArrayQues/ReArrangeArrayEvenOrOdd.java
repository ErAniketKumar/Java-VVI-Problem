package ArrayQues;

import java.util.Scanner;

public class ReArrangeArrayEvenOrOdd {
    /*relative order does not matter
     i.e first all even then odd
     note- (even element may be sorted or not similarly for odd  not problem)
     */

    static void swap(int[]arr,int l, int r) {
//        arr[l]=arr[l]+arr[r];
//        arr[r]=arr[l]-arr[r];
//        arr[l]=arr[l]-arr[r];
        //or this can also

        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array:- ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Gives input in array:- ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int l=0,r=size-1;
        while(l<=r) {
            if(arr[l]%2==0 && arr[r]%2!=0) {
                l++;r--;
            }
            else if(arr[l]%2!=0 && arr[r]%2==0) {
                  swap(arr,l,r);
                  l++;r--;
            }
            else if(arr[l]%2==0){
                l++;
            }
            else{       //or we can also write this else if(arr[r]%2!=0) r--;
                r--;
            }
        }
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
