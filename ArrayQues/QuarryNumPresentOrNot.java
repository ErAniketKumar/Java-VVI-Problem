package ArrayQues;

import java.util.Scanner;

public class QuarryNumPresentOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array:- ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Gives input in array:- ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter No of Quary:- ");
        int quary=sc.nextInt();
        while(quary>0) {
            System.out.print("inter target to check:- ");
            int k=sc.nextInt();
            int check=0;
            for(int i=0;i<size;i++) {
                if(arr[i]==k) {
                    check++;
                }
            }
            if(check>0)
            System.out.println("Yes Present");
            else System.out.println("Not Present");
            quary=quary-1;
        }
    }
}
