package ArrayQues;

import java.util.Scanner;

public class PairOfElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array:- ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Gives input "+size+" element in array:- ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int totalpair=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")");
                totalpair++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs Is:- "+totalpair);
    }
}
