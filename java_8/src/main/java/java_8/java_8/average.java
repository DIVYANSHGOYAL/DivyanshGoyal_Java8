package java_8.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> listOfIntegers = Arrays.asList(20, 50, 99, 12, 94);
		 
        OptionalDouble average = listOfIntegers
            .stream()
            .mapToInt(number -> number.intValue())
            .average();
 
        System.out.println("Average of Numbers: " + average);

	}

}
