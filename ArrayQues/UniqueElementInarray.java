package ArrayQues;

import java.util.Scanner;

public class UniqueElementInarray {
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
                    arr[i]=-1;
                    arr[j]=-1;

                }
            }
        }
        System.out.println("The Unique Element of array is: ");
        for(int i=0;i<num;i++) {
             if(arr[i]>=0)
            System.out.print(arr[i]+ " ");

        }

    }
}
