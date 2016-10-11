/**
 * Created by elainemnkubitu on 10/10/16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndSquares {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double [] res = new double [t];
        for(int a = 0; a< t; a++){
            int [] vals = new int [2];
            vals[0] = sc.nextInt();
            //System.out.println(vals[0]);
            vals[1] = sc.nextInt();
            //System.out.println(vals[1]);
            double k = Math.ceil(Math.sqrt(vals[0]));
            //System.out.println(k);
            double l = Math.ceil(Math.sqrt(vals[1]));
            //System.out.println(l);
            if(l==k){
                res[a] = 0;
            }
            else{
                res[a] = (l-k) +1;
            }
        }
        for(int a = 0; a< t; a++){
            System.out.println((int)res[a]);
        }
    }
}