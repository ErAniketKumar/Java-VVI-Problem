package MiscellaneousProblem;

import java.util.Scanner;

public class ReArraingeArrayPveAfterNve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of an array :- ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Gives Input in Array :- ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int p=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]>0)
            {
                p++;
            }
        }
        int[] prr=new int[p];
        int[] nrr=new int[size-p];
        int k=0,l=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]>0)
            {
                prr[k++]=arr[i];
            }
            else{
                nrr[l++]=arr[i];
            }
        }
        int stp=0;
        int stp2=0;
        int[] frr=new int[size];
        for(int i=0;i<size;i++)
        {
            if(stp<p) {
                if (i % 2 == 0) {
                    frr[i] = prr[stp++];
                }
            }

        }

        for(int i=0;i<size;i++)
        {
            if(stp2<size-p)
            {
                if(i%2!=0)
                {
                    frr[i]=nrr[stp2++];
                }
            }
        }

        for(int i=0;i<size;i++)
        {
            arr[i]=frr[i];
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
