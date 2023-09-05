package ArrayQues;

import java.util.Scanner;

public class ProductofarrayExpSeaf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array:- ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Gives input "+size+" element in array:- ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int stop=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==0)
            {
                stop=i;
                break;
            }
        }

        int p=1;
        int c=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==0)
            {
                arr[i]=1;
                c++;
            }
           p*=arr[i];
        }

        if(c==1)
        {
           for(int i=0;i<size;i++)
           {
               arr[i]=0;
           }
           arr[stop]=p;
        }
        if(c>1)
        {
            for(int i=0;i<size;i++)
            {
                arr[i]=0;
            }
        }
        if(c==0){
            for(int i=0;i<size;i++)
            {
                arr[i]=p/arr[i];
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }




    }
}
