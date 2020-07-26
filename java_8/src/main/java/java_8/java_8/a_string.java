package java_8.java_8;


import java.util.*; 
public class a_string {
	 
	public static void main(String[] args) {
	     String [] strArray = {"aaa","bbb","abb","ccccc"};
	     List<String> strList = Arrays.asList(strArray);
	     
		 List<String> aWithThreeLettersStr = filterStrings(strList);
	     System.out.println(aWithThreeLettersStr);
	  }

	  public static List<String> filterStrings(List<String> list) {
	     List<String> finalList = new ArrayList<>();
		 for (int i=0; i<list.size(); i++) {
	       if((list.get(i).indexOf('a')==0) && (list.get(i).length() == 3)) {
	         finalList.add(list.get(i));
	       }
	    }
	  return finalList;
	  }


}
