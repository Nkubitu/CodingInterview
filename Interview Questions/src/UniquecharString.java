import java.util.HashSet;
import java.util.Set;

/**
 * Created by elainemnkubitu on 10/2/16.
 */
public class UniquecharString {

    public static boolean UniqChar(String s){
        Set<Character> myChars = new HashSet<Character>();
        for(int i =0; i <s.length(); i++){
            if(myChars.contains(s.charAt(i))){
                return false;
            }
            else{
                myChars.add(s.charAt(i));
            }
        }

        return true;
    }


    public static void main (String [] args){
        String s = "When yougi";
        System.out.println(UniqChar(s));
    }
}
