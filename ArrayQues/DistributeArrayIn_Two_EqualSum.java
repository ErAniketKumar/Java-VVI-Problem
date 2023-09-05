package ArrayQues;

import java.util.Scanner;

public class DistributeArrayIn_Two_EqualSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array:- ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Gives input "+size+" element in array:- ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++) {
            sum+=arr[i];
        }
        int sum2=sum;
        int idx=0;
        for(int i=0;i<size;i++)
        {

            if((sum2-=arr[i])==sum)
            {
                idx=i;
                break;
            }
        }
        System.out.println(idx);

    }
}
