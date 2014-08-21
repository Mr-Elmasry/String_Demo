/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package demos;
import java.util.Arrays;
public class GetBytes_String {
    public static void main(String[] args) {   
        
        String str = "Java";
        byte[] bCode = str.getBytes();
        System.out.println(Arrays.toString(bCode));
        for (byte i = 0; i < bCode.length; i++) {
            System.out.
                    printf("Code of %s i System.out.println"
                            + "(Arrays.toString(bCode));s :%d\n",
                            str.charAt(i), bCode[i]);
        }

    }
}
