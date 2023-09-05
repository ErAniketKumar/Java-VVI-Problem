package ArrayQues;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.cbrt;

public class SqureElem_of_Array_in_NonDecreasingOrder {
    static void Rev_Array(int[] brr) {
        //here array is reverse
       int s=0,e=brr.length-1;
       while(s<e) {
           int temp=brr[s];
           brr[s]=brr[e];
           brr[e]=temp;
           s++;e--;
       }
      }
    static void Squre_And_SortNonDecArr(int[] arr,int size) {

        int[] brr=new int[size]; //create extra array
        int l=0,r=size-1,k=0; //two pointer for check absolute value large or small
        while(l<=r) {
            if(abs(arr[l])<abs(arr[r])) {
                brr[k]=arr[r]*arr[r];
                r--;k++;
            } else {
                brr[k]=arr[l]*arr[l];
                l++;k++;
            }
        }
        // Array are sorted with squre but this is decreasing to have to reverse array for non-decreasing
        Rev_Array(brr); ///function call for reverse
        //printed output

        for(int i=0;i<size;i++) {
            System.out.print(brr[i]+" ");
        }
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
        //Array passing for doing operation
        Squre_And_SortNonDecArr(arr,size);
    }
}
