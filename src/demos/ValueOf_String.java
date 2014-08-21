/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package demos;
public class ValueOf_String {
    public static void main(String[] args) {
        double dbl = 103.4d;
        double dbl2 = +100;
        double dbl3 = -150_150.5; 
        String x ="AAAAA";
        x = null;
        String y ="AAAAA";
        System.out.println(String.valueOf(dbl));//"103.4"
        System.out.println(String.valueOf(dbl2));//"100.0"
        System.out.println(String.valueOf(dbl3));//"-150150.5"        
        System.out.println(dbl + dbl2);//203.4;
        System.out.println
                (String.valueOf(dbl)+String.valueOf(dbl2));//"103.4100.0"
        
        }
}
