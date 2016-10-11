/**
 * Created by elainemnkubitu on 10/11/16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) { //n = length k = shifts
        int [] result = new int [n];
        int diff = n-k;
        for (int b =0; b < diff; b++){
            result[b]= a[k+b];
        }
        for (int c =0; c < k; c++){
            result[diff +c]= a[c];
        }

        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}
