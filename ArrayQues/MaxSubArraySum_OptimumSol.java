package ArrayQues;

import java.util.Scanner;

public class MaxSubArraySum_OptimumSol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of an array :- ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Gives Input in Array :- ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
       int[] pref=new int[size];
        pref[0]=arr[0];
        for(int i=1;i<size;i++){
              pref[i]+=pref[i-1]+arr[i];
        }
        int currentsum=0;
        int maxsum=arr[0];
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                currentsum=i==0?pref[j]:pref[j]-pref[i-1];
            }
            if(maxsum<currentsum){
                maxsum=currentsum;
            }
        }
        System.out.println(maxsum);
    }
}
