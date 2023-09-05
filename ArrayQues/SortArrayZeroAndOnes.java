package ArrayQues;

import java.util.Scanner;

public class SortArrayZeroAndOnes {
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
            if(arr[l]==0 && arr[r]==1) {
                l++;r--;
            }
            else if(arr[l]==1 &&arr[r]==0) {
                arr[l] = arr[l] + arr[r];
                arr[r] = arr[l] - arr[r];
                arr[l] = arr[l] - arr[r];
                l++;
                r--;
            }
            else if(arr[l]==0 && arr[r]==0) {
                l++;
            }
            else{
                r--;
            }
        }
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
