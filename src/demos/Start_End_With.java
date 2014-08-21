/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package demos;
public class Start_End_With {
    
    public static void main(String[] args) {        
        String str = "This is a sentence with some tokens";
        System.out.println(str.startsWith(""));//true
        System.out.println(str.startsWith("T"));//true
        System.out.println(str.startsWith("this"));//false
        System.out.println(str.toLowerCase().startsWith("this"));//true
        System.out.println("***************");
        System.out.println(str.endsWith(""));//true
        System.out.println(str.endsWith(str));//true
        System.out.println(str.endsWith("Ens"));//false
        System.out.println("***************");  
      }
}
