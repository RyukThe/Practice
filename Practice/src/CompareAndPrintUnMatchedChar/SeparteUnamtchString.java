package CompareAndPrintUnMatchedChar;

import java.util.HashSet;
import java.util.Set;

public class SeparteUnamtchString 
{
	public static void main(String[] args)
	{
		 /*  String str1 = "hello world";
	        String str2 = "hola mundo";

	        // Compare strings and print unmatched characters
	        for (int i = 0; i < str1.length(); i++) {
	            if (i >= str2.length() || str1.charAt(i) != str2.charAt(i)) {
	                System.out.println("Unmatched character at index " + i + ": " + str1.charAt(i));
	            }
	        }
	        
	        
	        
	        
	        */
		m1();
		//m2();
		//easy();
	    }
	
	
	
	
	public static void m1()
	{
		   String str1 = "hello world";
	        String str2 = "hola mundo";

	        // Find unmatched characters in str1
	        for (int i = 0; i < str1.length(); i++) {
	            char c = str1.charAt(i);
	            if (str2.indexOf(c) == -1) 
	            {
	                System.out.println("Unmatched character in str1: " + c);
	            }
	        }

	        // Find unmatched characters in str2
	        for (int i = 0; i < str2.length(); i++) {
	            char c = str2.charAt(i);
	            if (str1.indexOf(c) == -1) // if char is not present in str then indexof() return -1.
	            {
	                System.out.println("Unmatched character in str2: " + c);
	            }
	        }
	}
	
	
	
	
	
	public static void m2()
	{
		   String str1 = "hello world";
	        String str2 = "hola mundo";

	        // Create a set to hold the unmatched characters
	        Set<Character> unmatchedChars = new HashSet<>();

	        // Add characters from str1 that are not in str2 to the set
	        for (int i = 0; i < str1.length(); i++) {
	            char c = str1.charAt(i);
	            if (str2.indexOf(c) == -1) {
	                unmatchedChars.add(c);
	            }
	        }

	        // Add characters from str2 that are not in str1 to the set
	        for (int i = 0; i < str2.length(); i++) {
	            char c = str2.charAt(i);
	            if (str1.indexOf(c) == -1) {
	                unmatchedChars.add(c);
	            }
	        }

	        // Print the unmatched characters
	        System.out.println("Unmatched characters:");
	        for (char c : unmatchedChars) {
	            System.out.println(c);
	        }
	    
	}
	
	
	 public static void m3()
	 {
	     String str1 = "hello world";
	        String str2 = "hola mundo";

	        // Create a StringBuilder to hold the unmatched characters
	        StringBuilder unmatchedChars = new StringBuilder();

	        // Loop through the characters of str1
	        for (int i = 0; i < str1.length(); i++) {
	            char c = str1.charAt(i);

	            // Check if str2 contains the character
	            if (str2.indexOf(c) == -1) {
	                // If not, append it to the unmatchedChars StringBuilder
	                unmatchedChars.append(c);
	            }
	        }

	        // Loop through the characters of str2
	        for (int i = 0; i < str2.length(); i++) {
	            char c = str2.charAt(i);

	            // Check if str1 contains the character
	            if (str1.indexOf(c) == -1) {
	                // If not, append it to the unmatchedChars StringBuilder
	                unmatchedChars.append(c);
	            }
	        }

	        // Print the unmatched characters
	        System.out.println("Unmatched characters: " + unmatchedChars.toString());
	    
	 }
	 
	 public static void easy()
	 {
		    String str1 = "hello world";
	        String str2 = "hola mundo";

	        // Create a set to hold the unmatched characters
	        Set<Character> unmatchedChars = new HashSet<>();

	        // Add all characters from str1 to the set
	        for (char c : str1.toCharArray()) {
	            unmatchedChars.add(c);
	        }

	        // Remove all characters from str2 from the set
	        for (char c : str2.toCharArray()) {
	            unmatchedChars.remove(c);
	        }

	        // Print the unmatched characters
	        System.out.println("Unmatched characters:");
	        for (char c : unmatchedChars) {
	            System.out.println(c);
	        }
	    
	 }
	}


