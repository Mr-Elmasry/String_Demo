/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package demos;
public class Match_String {
    public static void main(String[] args) {        
        String X = "ABC";
        System.out.println(X.matches("ABC"));//true
        System.out.println(X.matches("abc"));//false
        System.out.println(X.matches("[A-C]+"));//true
        System.out.println(X.matches(".+"));//true
        System.out.println(X.matches("ABC?"));//true
        String mail = "mr_el_masry@Yahoo.com";
//        String  mail = "a@b.c";
        System.out.println(mail.matches(".+[@].+[.].+"));//true
        
       String mob = "01201342207";
       mob.matches("^01[0-2][0-9]{8}$");
     //  int 5X;
        
    }

}
