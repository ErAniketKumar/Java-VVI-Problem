package ArrayQues;

import java.util.Scanner;

public class RightSideRotateArrayByKstep {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
//
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
                int k=sc.nextInt();
                k=k%size;
                for(int i=0;i<k;i++) {
                    int temp=arr[size-1];
                    for(int j=size-1;j>0;j--) {
                        arr[j]=arr[j-1];
                    }
                    arr[0]=temp;
                }

                for(int i=0;i<size;i++) {
                    System.out.print(arr[i]+" ");
                }

      }
        }
