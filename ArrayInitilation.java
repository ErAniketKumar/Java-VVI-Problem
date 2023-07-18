package ArrayJava;

import java.util.Scanner;

public class ArrayInitilation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num]; //array create/ decl

        //array inpute
        for(int i=0;i<num;i++) {
            arr[i]=sc.nextInt();
        }
        //output or print array
        
        for(int i=0;i<num;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
