package practice;

import java.util.*;

public class sumofnumber{
public static void main(String[] args){
    String str ="seshu";
    StringBuffer sb = new StringBuffer();
   
    Set<Character> set = new LinkedHashSet<Character>();
    for(int i=0;i<str.length();i++){
        set.add(str.charAt(i));
    }
     for(char s:set) {
    	 sb.append(s);
     }
     System.out.println(sb);
}
}