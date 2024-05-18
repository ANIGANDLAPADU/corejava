package corejavaprogamswithoutbulidmethods;

public class revesre {
	public static void main(String[] args) {
	      String str="seshu babu karanam";
	      String[] str1=str.split(" ");
	      String strRev="";
	      for(String st:str1){
	          String strWord="";
	          for(int i=st.length()-1;i<=0;i--){
	              strWord=strWord+st.charAt(i);
	          }
	          strRev=strRev+strWord+" ";
	      }
	      System.out.println(strRev);
	    
	}
}
