package demos;

public class StringConst {    
    public static void main(String[] args) {
        // Declaring a String Objects
        String s = "Hello";
        String s1 = new String(s);
        String s2 = "Hello";
               
        String s3 = new String(new char[]{'H','e','l','l','o'});
        String s4 = new String(new char[]{'H','e','l','l','o'},2,3);
              
        // Equality 
        System.out.println(s==s1);// false
        System.out.println(s.equals(s1));//true
        System.out.println(s1==s2);//false
        System.out.println(s==s2); //true       
        System.out.println(s4);         
 }
}
