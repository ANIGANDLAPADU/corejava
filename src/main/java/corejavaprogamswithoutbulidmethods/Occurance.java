package corejavaprogamswithoutbulidmethods;

import java.util.*;
public class Occurance{
public static void main(String[] args){
    String str ="seshu";
   char[] ch=str.toCharArray();
    Map<Character,Integer> map = new HashMap<Character,Integer>();
    for(char c:ch){
      if(map.containsKey(c)){
       map.put(c,map.get(c)+1);
       } 
       else{
         map.put(c,1);
        }
    }
     System.out.println(map);
  }
}