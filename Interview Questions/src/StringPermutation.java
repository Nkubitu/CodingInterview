import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by elainemnkubitu on 10/2/16.
 */
public class StringPermutation {


    public static boolean isPermutation(String one, String two){
        char  [] on  = one.toCharArray();
        Arrays.sort(on);
        System.out.println(on);
        char  [] tw  = two.toCharArray();
        Arrays.sort(tw);
        System.out.println(tw);
        return on.equals(tw);
    }

    public static void main (String [] args){

        System.out.println(isPermutation("You","You"));
    }
}
