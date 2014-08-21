/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package demos;
import java.util.Arrays;
public class Split_String {
    public static void main(String[] args) {
        String text = 
                "This is a sentEnce with some tokens\nthis is a line";
        String[] words = text.split(" ");
        for (String word : words)
            System.out.printf("%s__",word);  
        System.out.println("\nThe count of Words is "+words.length);
        System.out.println(Arrays.toString(words)); // Arrays from util
        System.out.println("*************");
        //Try this:
        System.out.println(CapEachWord(text));
        System.out.println(toggleCase(text));
      }
    static String CapEachWord(String src){
      String dst ="";
      String []words = src.split("\\s");
    for (String word : words) {         
           word = Character.toUpperCase(word.charAt(0)) +
                                  word.substring(1).toLowerCase();              
        dst+= word+" ";// length of dst - length of src = 1 ???
    }
        return dst.substring(0, dst.length()-1);
    }    
    static String toggleCase(String src){        
    char[] chars = src.toCharArray();
        for (int i =0;i<chars.length;i++) {
            if (Character.isUpperCase(chars[i]))
                chars[i] = Character.toLowerCase(chars[i]);
            else 
                chars[i] = Character.toUpperCase(chars[i]);
            }
        return new String(chars);// Constructor using char Array
    }
}
