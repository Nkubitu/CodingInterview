import java.util.ArrayList;
import java.util.List;

public class StringBuilder{

    private static List<Character> myChars;

    public StringBuilder(){
         myChars= new ArrayList<>();

    }
    public  static void append(String str) {

        if (str != null) {
            char[] charArray = str.toCharArray();
            for (int k = 0; k < charArray.length; k++) {
                myChars.add(charArray[k]);
            }
        }
    }
    public String toString(){
        char[] charArray = new char[myChars.size()];
        for(int i=0; i<charArray.length; i++) {
            charArray[i] = myChars.get(i);
        }
        return new String(charArray);
    }



}