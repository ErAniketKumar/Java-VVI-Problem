package ArrayQues;

import java.util.Scanner;

public class RemoveDuplicateEleArr {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of an array :- ");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.print("Gives Input in Array :- ");
        for(int i=0;i<num;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++) {
                if(arr[i]==arr[j]) {
                    arr[j]=-1;
                }
            }
        }
        System.out.println("after removing duplicate element ");
        for(int i=0;i<num;i++) {
            if(arr[i]>=0)
                System.out.print(arr[i]+ " ");

        }

    }
}

