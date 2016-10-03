/**
 * Created by elainemnkubitu on 10/2/16.
 */
public class StringRemake {

    public static void  strRemake(String [] strings) {
        int l = strings.length;
        String S = "";
        for(int n = 0; n <l; n++){
            S+= strings[n];
        }
        System.out.println(S);
        for(int m = 0; m<l; m++){
            System.out.println (S.substring(0, strings[m].length()));
            S = S.substring(strings[m].length());
        }
    }
    public static void main (String args[]){
        String [] strings = {"joy", "happy", "sad", "cry", "love"};
        strRemake (strings);
    }

}
