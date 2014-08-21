/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package demos;
public class Reverse_String {
    
    public static void main(String[] args) {        
        String text = "Hello Alexandria!";
        System.out.println(reverse(text));         
        }    
    static  String reverse(String org){
        char[] toCharArray = org.toCharArray();
        String revStr ="";
        for (int i = toCharArray.length-1; i >= 0; i--) {
            revStr+= toCharArray[i];
        }
    return revStr;
    }
}
