/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com * Date:Aug 13, 2014
 */
package demos;
public class StringFormat {
    public static void main(String[] args) {
        int i = 13;
        float f = 13.f;
        double d = 100d;
        boolean b = true;
        char c = 'A';
        String s = "Welcome";
        System.out.printf(
                "The Value of Int Var is :%d\n"
                + "The Value of Float Var is :%f\n"
                + "The Value of Double Var is :%f\n"
                + "The Value Of String Var is :%s\n"
                + "The Value of Bool. Var is :%b\n"
                + "The Value of Char. Var is :%c\n",i,f,d,s,b,c);
        String strF = String.format(
                "The Value of Int Var is :%d\n"
                + "The Value of Float Var is :%f\n"
                + "The Value of Double Var is :%f\n"
                + "The Value Of String Var is :%s\n"
                + "The Value of Bool. Var is :%b\n"
                + "The Value of Char. Var is :%c\n",i,f,d,s,b,c);
             System.out.println(strF);
 } 
} 
