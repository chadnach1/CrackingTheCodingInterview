import java.util.Collections;
import java.util.Arrays;

public class CTCI_1 {
    
    public static void main(String[] args) {
        
        System.out.println(CTCI1_3("acadeeea"));
        System.out.println(CTCI1_4("cat","tca"));
        System.out.println(CTCI1_5("a sdfgh"));
    }
    
    public static String CTCI1_3(String s) {
        
        // check if string has a length
        
        if (s.length() == 0) return "";
        
        //iterate thru every element of string, save first element, check if that element appears anywhere else
        
        for (int i = 0; i < s.length(); i++) {
            
            for (int j = i + 1; j < s.length(); j++) {
                
                char first = s.charAt(i);
                
                if (s.charAt(i) == s.charAt(j)) {
                    
                    // Remember substring (start from 0) go from (included, excluded) and decrement j
                    s = s.substring(0,j) + s.substring(j + 1, s.length()) + "";
                    j--;
                }
            } 
        }
        return s;
    }
    
    
    public static boolean CTCI1_4(String s1, String s2) {
        
        // check length of the strings, not equal then not anagrams
        if (s1.length() != s2.length()) return false;
            
        // sort the strings be alphabetical order and then compare    
        return false;
        
        
    }
    
    public static String CTCI1_5(String s) {
        
        String p20 = "%20";
        
        //check if there are spaces using ascii for space (32)
        if (s.indexOf(' ') == -1) return s;
        
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == 32) s = s.substring(0,i) + p20 + s.substring(i+1, s.length());
            
        }
        
        return s;
        //once a space is encountered, add in another space before and after space, and populate with %20
        
    }
}