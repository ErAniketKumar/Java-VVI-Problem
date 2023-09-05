package ArrayQues;

import java.util.Scanner;

public class nextprime {
    public static int isprime(int num)
    {
       if(num<=1)
           return 2;
       for(int i=2;i<=num/2;i++)
       {
           if(num%i==0){
               return 0;
           }
       }
       return 1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       while(true)
       {
           num++;
           int res=isprime(num);
           if(res==1)
           {
               System.out.println(num);
               break;
           }
       }
    }
}
