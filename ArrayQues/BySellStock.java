package ArrayQues;

import java.util.Scanner;

public class BySellStock {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array:- ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Gives input "+size+" element in array:- ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int[] bys=new int[size];
        int min=arr[0],k=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            bys[k++]=min;
        }
        System.out.println("min buy price");
        for(int i=0;i<size;i++)
        {
            System.out.print(bys[i]+" ");
        }
        System.out.println();
        int[] pp=new int[size];
        int l=0;
        for(int i=0;i<size;i++)
        {
            pp[l++]=(arr[i]-bys[i]);
        }
        System.out.println("all profit price");
        int mx=pp[0];
        for(int i=0;i<size;i++)
        {
            if(pp[i]>mx)
            {
                mx=pp[i];
            }
            System.out.print(pp[i]+" ");
        }
        System.out.println();
        System.out.println("max pofit = : "+mx);
    }
}
