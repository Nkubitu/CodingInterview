/**
 * Created by elainemnkubitu on 10/2/16.
 */
public class URLfy {

    public static String makeURL(String url){
        char[] urlChars = url.toCharArray();
        int l = url.length();
        int index = 0;
        int spaceCount = 0;

        for(int i= 0; i<l; i++) {
            if (urlChars[i] != ' ') {
                spaceCount += 1;
            }
        }
        int totalChar = l + (spaceCount*2);
        char[] chars = new char[totalChar];
        for(int i= 0; i<l; i++){
            if(urlChars[i] != ' '){
                chars[index]=urlChars[i];
                index +=1;

            }
            else{
                chars[index] = '%';
                chars[index+1] = '2';
                chars[index+2] = '0';
                index+=3;
            }

        }

        return new String(chars);

    }

    public static void main(String [] args){
        System.out.println(makeURL("Why are you"));
    }
}
