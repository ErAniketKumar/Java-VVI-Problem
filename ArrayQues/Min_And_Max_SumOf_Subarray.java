package ArrayQues;

import javax.sound.midi.Synthesizer;
import java.util.Scanner;

public class Min_And_Max_SumOf_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of an array :- ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Gives Input in Array :- ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0,c=0;
        int max=arr[0],min=arr[0];
        System.out.println("Sum Of Each Sub Array Is:- ");
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                c++;
                System.out.println(c+") SumArrSum  ->"+sum+" ");
               if(max<sum){
                   max=sum;
               }
               if(min>sum){
                   min=sum;
               }
            }
        }
        System.out.println();
        System.out.println("Minimum Sum Of SubArray Is: "+min);
        System.out.println("Maximum Sum Of SubArray Is: "+max);


    }
}
