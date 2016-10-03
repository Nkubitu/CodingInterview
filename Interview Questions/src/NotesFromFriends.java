//Alex sleeps in class and needs to know if he can borrow notes from his friends in class. Class has n other students
//and Alex has k friends.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NotesFromFriends {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        int friends[] = new int[k];
        for(int friends_i=0; friends_i < k; friends_i++){
            friends[friends_i] = in.nextInt();

        }
        for(int a =0; a < k; a++){
            //System.out.println((friends[a]));
            if(s.charAt(friends[a]-1)=='1'){
                continue;
            }
            else{
                System.out.println("YES");
                break;
            }
        }
        System.out.println("NO");

        }

    }
