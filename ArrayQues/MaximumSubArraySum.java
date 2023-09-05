package ArrayQues;

import java.util.Scanner;

public class MaximumSubArraySum {
////note brute force approach time complexcity is very bad;
    //this is not optimal solution
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("enter size of an array :- ");
                int size = sc.nextInt();
                int[] arr = new int[size];
                System.out.print("Gives Input in Array :- ");
                for(int i=0;i<size;i++) {
                    arr[i]=sc.nextInt();
                }
                int currentsum=0;
                int maxsum=arr[0];
                System.out.println("Sum Of Each Sub Array Is:- ");
                for(int i=0;i<size;i++){
                    for(int j=i;j<size;j++){
                        currentsum=0;
                        for(int k=i;k<=j;k++){
                            currentsum+=arr[k];
                        }
                        if(currentsum>maxsum){
                            maxsum=currentsum;
                        }
                    }
                }
                System.out.println();
                System.out.println("Maximum Sum Of SubArray Is: "+maxsum);


            }
        }



