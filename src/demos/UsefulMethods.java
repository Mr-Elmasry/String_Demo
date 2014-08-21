/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package demos;

public class UsefulMethods {
    public static void main(String[] args) {
        // Length , charAt and getChars :
        String str = "Alexandria";
        System.out.println(reverse(str));
        System.out.println(reverse(reverse(str)));
        System.out.println("*****");
        
        char[] chars = new char[4];
        str.getChars(0, 4, chars, 0);

        for (char c : chars) {
            System.out.println(c);
        }
    }
    static String reverse(String org) {
        String rev = "";
        for (int i = org.length() - 1; i >= 0; i--) {
            rev += org.charAt(i);
        }
        return rev;
    }
    
}
