/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package demos;
public class IndexOf_String {
    public static void main(String[] args) {
        String s = 
              "Java is OOP.\nJava is simple.\nJava is platform.";
        System.out.println(s.indexOf("Java"));//0
        System.out.println(s.indexOf(97));  //1   ?? 'a' = 97
        System.out.println(s.lastIndexOf("."));//s.length()-1
        System.out.println(s.length());//64
        System.out.println(findSecond(s, "Java"));//13
        System.out.println(findSecond(s, "java"));//-1
        
        }
    static String findSecond(String src,String srch){
      int frstIndex = src.indexOf(srch);
      int srchFrom  = frstIndex + srch.length();
      return String.format
        ("Second '%s' is located at index :%d",srch,src.indexOf(srch, srchFrom));
    }
}
