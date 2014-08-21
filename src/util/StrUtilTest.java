/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package util;

public class StrUtilTest {
    public static void main(String[] args) {
        String org = "String cap = orginal.Pattern p = Pattern.compile(\"\\\\w+\");\n" +
"\n" +
"        Matcher m = p.matcher(orginal);\n" +
"\n" +
"        while (m.find()) {\n" +
"\n" +
"           String word = m.group();\n" +
"\n" +
"           String capWord = capAString(word);\n" +
"         cap =  cap.replaceAll(word, capWord);";
        StringUtil ut = new StringUtil(org);
        System.out.println(ut.getSentenceCase());
    }
}
