/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package demos;
public class Trim_String {
    public static void main(String[] args) {
       String src = "   He llo   ";
       System.out.println(src.length());//12
       String trimSrc = src.trim();
       System.out.println(trimSrc.length());//6
       System.out.println(src.length());//12
     }
}
