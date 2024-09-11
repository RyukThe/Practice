package CompareAndPrintUnMatchedChar;

import java.util.HashSet;
import java.util.Set;

public class CompareTwoString 
{
	public static void main(String[] args) 
	{
	     String str1 = "hello world";
	        String str2 = "hullo workd";

	        // Check if the strings are equal
	        if (str1.equals(str2)) {
	            System.out.println("Strings are equal.");
	        } 
	        else 
	        {
	            // Create sets to hold the unmatched characters
	            Set<Character> unmatchedChars1 = new HashSet<>();
	            Set<Character> unmatchedChars2 = new HashSet<>();

	            // Add all characters from str1 to unmatchedChars1
	            for (char c : str1.toCharArray()) {
	                unmatchedChars1.add(c);
	            }

	            // Add all characters from str2 to unmatchedChars2
	            for (char c : str2.toCharArray()) {
	                unmatchedChars2.add(c);
	            }

	            // Remove all characters from str1 that are in str2
	            for (char c : str2.toCharArray()) {
	                unmatchedChars1.remove(c);
	            }

	            // Remove all characters from str2 that are in str1
	            for (char c : str1.toCharArray()) {
	                unmatchedChars2.remove(c);
	            }

	            // Print the unmatched characters from both strings
	            System.out.println("Unmatched characters in str1: " + unmatchedChars1.toString());
	            System.out.println("Unmatched characters in str2: " + unmatchedChars2.toString());
	        }
	    
		
	}

}
