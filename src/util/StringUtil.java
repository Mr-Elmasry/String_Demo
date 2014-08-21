/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com * Date:Aug 13, 2014
 */
package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Simulates Some ms-word Functions
 * @author Mr.Ahmed Elmasry
 */
public class StringUtil {
    
    private String orginal;
    private StringBuilder reverseBldr;
    private StringBuilder tOGGLEcASEbLDR;
    private final char[] chars;
    
    public StringUtil(String org) {
        this.orginal = org;
        chars = org.toCharArray();
    }

    public String getOrginal() {
        return orginal;
    }

    public String getReverse() {
        reverseBldr = new StringBuilder(orginal.length());        
        for (int i = chars.length-1; i >= 0; i--) {
            reverseBldr.append(chars[i]);
        }

        return reverseBldr.toString();
    }

    public String getSentenceCase() {
        return null;
          
         }

    public String gettOGGLEcASE() {
        tOGGLEcASEbLDR = new StringBuilder(orginal.length());
        for (int i = 0; i < chars.length ; i++) {
            if (Character.isUpperCase(chars[i])) {
                tOGGLEcASEbLDR.append(Character.toLowerCase(chars[i]));
            } else {
                tOGGLEcASEbLDR.append(Character.toUpperCase(chars[i]));
            }
        }
        return tOGGLEcASEbLDR.toString();
    }
    
    private String capAString(String wordOrStmnt){
    char first = wordOrStmnt.charAt(0);
    return Character.toUpperCase(first)+
                   wordOrStmnt.substring(1).toLowerCase();
    }
 
    public String capEachWord(){
        String cap = orginal;
        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher(orginal);
        while (m.find()) {
           String word = m.group();
           String capWord = capAString(word);
         cap =  cap.replaceAll(word, capWord);
        }    
    return cap;
    }

   }
/*** @author Mr. Ahmed Elmasry 
 *   WWW.FanniaBackbone.wikispaces.com/java *  */