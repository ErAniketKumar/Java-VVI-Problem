package ArrayQues;

import javax.security.auth.login.AccountException;
import java.util.Scanner;

public class TotalNo_of_SubArray_hisSum_is_EqualTo_Target {

    public static int NoOfSubArraySum(int arr[],int target)
    {
        int size=arr.length;
        int[]brr=new int[size];
        int sum=0,count=0,k=0;
        for(int i=0;i<arr.length;i++) {
            for (int j = i; j < arr.length; j++) {
                sum=0;
                for (k = i; k <= j; k++) {
                    sum+=arr[k];
                }
                if(sum==target)
                {
                    count++;
                }
            }
        }
        return count;
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
        int res=NoOfSubArraySum(arr,target);
        System.out.println(res);
    }
}