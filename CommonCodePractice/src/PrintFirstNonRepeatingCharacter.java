

import java.util.HashMap;
import java.util.Map;

public class PrintFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		printFirstNonRepeatingCharacter("$tyuiojbnnmkjhgbmntyuiokhgll$");
	}
	
	
	
	public static void printFirstNonRepeatingCharacter(String str) {
		
		Map<Character,Integer> countMap = new HashMap();
		for(char ch: str.toCharArray()) {	
			countMap.put(ch, countMap.getOrDefault(ch, 0)+1);
		}
		
		for(char ch: str.toCharArray()) {	
			if(countMap.get(ch) == 1) {
				System.out.println(ch);
				break;
			}
		}
	}

}
