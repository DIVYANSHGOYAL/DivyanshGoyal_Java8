package java_8.java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class palindrome {

	public static void main(String[] args) {
	     String [] strArray = {"aaa","bbb","abb","ccccc","aabaa"};
	     List<String> strList = Arrays.asList(strArray);
	     
		 List<String> aPalindromeStr = filterStrings(strList);
	     System.out.println(aPalindromeStr);
	  }

	  public static List<String> filterStrings(List<String> list) {
	     List<String> finalList = new ArrayList<>();
	     boolean b = true;
	     char c1,c2;
		 for (int i=0; i<list.size(); i++) {
			 for (int j=0; j<list.get(i).length()/2; j++) {
				 c1 = list.get(i).charAt(j);
				 c2 = list.get(i).charAt(list.get(i).length()-j-1);
				 if(c1 != c2) {
					 b = false;
					 break;
				 }
			 }
			 if(b==true)
			 finalList.add(list.get(i));
			 b=true;
	    }
	  return finalList;
	  }

}
