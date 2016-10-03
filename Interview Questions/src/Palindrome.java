import java.util.Scanner;

/**
 * Created by elainemnkubitu on 10/2/16.
 */
public class Palindrome {

    public static boolean isPalindrome (String str ) {
            String newS = "";
            str = str.replaceAll(("[^A-Za-z0-9]"),"");
            str = str.toLowerCase();
            int l = str.length();
            for(int m = l; m >l; m--)
                newS = newS + (str.charAt(m));
            return (newS.toString().equals (str));
        }
    public static void main ( String args[]){
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            System.out.println("You entered " +str);
            System.out.println(isPalindrome(str));
            in.close();
        }
    }

