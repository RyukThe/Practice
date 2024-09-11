package April24;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.collections4.functors.CatchAndRethrowClosure;

public class ReevesAlphabetisOnly {

	
public static void main(String[] args) {
		
		String s = "asc4785sae";
		
		char [] ch = s.toCharArray();
		
		ArrayList<Character> letters = new ArrayList<>();
		
		ArrayList<Character> numbers = new ArrayList<>();
		
		for(int i = 0; i < ch.length; i++) {
			char temp = ch[i];
			if(Character.isAlphabetic(temp)) {
				letters.add(temp);
			} else {
				numbers.add(temp);
			}
		}
		
		for(int i = letters.size()-1; i >= 0; i--) {
			System.out.print(letters.get(i));
		}
		
		for(int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i));
		}	
	}}
