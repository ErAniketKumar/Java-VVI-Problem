package ArrayQues;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Suffix_sum_Of_EachElement {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array:- ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Gives input in array:- ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int[] prefix=new int[size];
           prefix[0]=arr[0];
        for(int i=1;i<size;i++ ) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<size;i++) {
            System.out.print(prefix[i]+" ");
        }
        System.out.println();
        int[] suffix=new int[size];
        suffix[size-1]=arr[size-1];
        for(int i=size-2;i>=0;i--)
        {
//            arr[i]+=arr[i+1];
            suffix[i]=suffix[i+1]+arr[i];
        }
        for(int i=0;i<size;i++) {
            System.out.print(suffix[i]+" ");
        }
        int c=0;
        for(int i=0;i<size;i++) {
            if(prefix[i]==suffix[i+1]) {
                c=i;
                break;
            }
        }
        int[] subarr1 =new int[c+1];
        int [] subarr2=new int[size-c+1];
        for(int i=0;i<=c;i++) {
            subarr1[i]=arr[i];
        }
        int j=0;
        for(int i=0;i<=size-c+1;i++) {
            subarr2[i]=arr[c+1+i];
        }
        System.out.println(Arrays.toString(subarr1));
        System.out.println(Arrays.toString(subarr2));
    }
}
