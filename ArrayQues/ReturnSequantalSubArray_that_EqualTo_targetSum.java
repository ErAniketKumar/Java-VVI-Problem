package ArrayQues;

import javax.sound.midi.Synthesizer;
import java.io.UncheckedIOException;
import java.util.Scanner;

public class ReturnSequantalSubArray_that_EqualTo_targetSum {

    public static int[] putarray(int arr[],int start,int end)
    {
       int[] crr=new int[end-start+1];
        int k=0;
        for(int i=start;i<=end;i++)
        {
            crr[k++]=arr[i];
        }
        return crr;

    }
    public static int[] checkSubArray(int arr[],int target)
    {
        int size=arr.length;
        int[]brr=new int[size];
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            for (int j = i; j < arr.length; j++) {
                sum=0;
                for (int k = i; k <= j; k++) {
                    sum+=arr[k];
                    if(sum==target)
                    {
                        brr=putarray(arr,i,k);
                        return brr;
                    }
                }
            }
        }
        return brr;
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
        int target=sc.nextInt();
        int[] res=checkSubArray(arr,target);
        for(int i=0;i< res.length;i++)
        {
            System.out.print(res[i]+" ");
        }

    }
}
