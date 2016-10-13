/**
 * Created by elainemnkubitu on 10/13/16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WashingPlates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int plates = sc.nextInt();
        int wash = sc.nextInt();
        int cash = 0;
        int lost = 0;
        ArrayList<Integer> gain  = new ArrayList <Integer>();
        ArrayList<Integer> loss  = new ArrayList <Integer> ();
        for(int n = 0; n < plates; n++){
            gain.add(n, sc.nextInt());
            loss.add(n, sc.nextInt());
        }

        for (int a = 0; a <wash; a++){
            int max = Collections.max(gain);
            int k = gain.indexOf(Collections.max(gain));
            loss.remove(k);
            cash += max;
        }
        for (int b = 0; b < loss.size(); b++){
            lost += loss.get(b);
        }
        if (cash <= lost){
            System.out.println(0);

        }
        else{
            System.out.println(cash - lost);
        }

    }
}
