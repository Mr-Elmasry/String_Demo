/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package demos;
import java.util.Arrays;
public class Compare_String {
    public static void main(String[] args) {        
        String a = "ABC";        
        String b = "BCD";
        String c = "abc";
        System.out.println(a.compareTo(b));// -1 
        System.out.println(b.compareTo(a));// 1
        System.out.println(a.compareTo(c));//-32 
        System.out.println('A'-'a');//-32
        System.out.println('E'-'C');//2
        System.out.println(a.compareToIgnoreCase(c));//0
        String[]team =
        {"Karam","Mohab","Ahmed","Nohir","Magdy"};
        Arrays.sort(team);
        System.out.println(Arrays.toString(team));        
    }
}
