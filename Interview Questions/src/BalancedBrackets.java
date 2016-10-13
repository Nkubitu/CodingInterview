/**
 * Created by elainemnkubitu on 10/12/16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets {
    public static boolean isBalanced(String expression) {
        int len = expression.length();
        int mid = len/2;
        String open = "[({";
        String close = "])}";
        //System.out.println(mid);
        if((len % 2) !=0 ){
            return false;
        }
        else{
            for (int a =0; a < mid ; len ++){
                if (open.indexOf(expression.charAt(mid -1 -a)) == close.indexOf(expression.charAt(mid +a))){
                    System.out.println(open.indexOf(expression.charAt(mid -1 -a)));
                    System.out.println(close.indexOf(expression.charAt(mid +a)));
                    // System.out.println("Yo");
                    //System.out.println(expression.charAt(mid -1 -a) expression.charAt(mid +a));
                    //System.out.println(expression.charAt(mid + a));
                    return false;
                }
            }
            return true;
        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
