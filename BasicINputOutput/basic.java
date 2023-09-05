package BasicINputOutput;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      char ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.print(1);
        }

        else if('a'<=ch&& ch<='z'){
            System.out.print(0);
        }

        else{
            System.out.print(-1);
        }



    }
}
