package MiscellaneousProblem;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;
public class longestconsecutiveInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of an array :- ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Gives Input in Array :- ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int ans=Integer.MIN_VALUE;
        Arrays.sort(arr);
        int c=1;
        for(int i=1;i<size;i++)
        {
            if((arr[i]-arr[i-1])==1)
            {
                c++;
            }
                 else if(arr[i]-arr[i-1]==0)
                    continue;
                else{
                    ans=Math.max(ans,c);
                    c=1;
                }
            }
        ans=Math.max(ans,c);
        System.out.println(ans);
        }
    }

